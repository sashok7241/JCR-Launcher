<?php
define('IMPASS_CHECK', true);
include ("jcr_connect.php");
include ("jcr_settings.php");
$user = sql_param($_GET ['user']);
$sessionid = sql_param($_GET ['sessionId']);
$serverid = sql_param($_GET ['serverId']);
$hash = mysql_real_escape_string($_GET ['hash']);
$client = mysql_real_escape_string($_GET ['client']);
$action = mysql_real_escape_string($_GET ['action']);
if(!(strtolower($hash) == strtolower(md5_file("files/clients/$client/bin/minecraft.jar")))) die("Bad session"); // Bad hash
if($action == "setServerId")
{
	$secureSesId = sha1($sessionid . $sessionKey);
	$checkSession = mysql_query("SELECT $db_colUser FROM $db_table WHERE $db_colUser='$user' AND $db_colSesId='$secureSesId'") or die("Ошибка");
	if(mysql_num_rows($checkSession) == 1)
	{
		$result = mysql_query("SELECT $db_colUser FROM $db_table WHERE $db_colUser='$user' AND $db_colServer='$serverid'") or die("Ошибка");
		if(mysql_num_rows($result) == 1)
		{
			echo "OK";
		} else
		{
			$result = mysql_query("UPDATE $db_table SET $db_colServer='$serverid' WHERE $db_colUser='$user'") or die("Ошибка");
			if(mysql_affected_rows() == 1)
			{
				echo "OK";
			} else
				echo "Bad login";
		}
	} else
		echo "Bad session";
}

function sql_param($string)
{
	(string) $string = $string;
	$string = PREG_REPLACE("/[^\w- ]|INSERT|DELETE|UPDATE|UNION|SET|SELECT|TRUNCATE|DROP|TABLE/i", "", $string);
	$string = TRIM($string);
	mysql_real_escape_string($string);
	return $string;
}
?>