<?php
define('IMPASS_CHECK', true);
include ("jcr_connect.php");
$user = sql_param(mysql_real_escape_string($_GET ['user']));
$serverid = sql_param(mysql_real_escape_string($_GET ['serverId']));
$result = mysql_query("SELECT $db_colUser FROM $db_table WHERE $db_colUser='$user' AND $db_colServer='$serverid'") or die("Ошибка");
$row = mysql_fetch_assoc($result);
$realUser = $row [$db_colUser];
if($user != $realUser) exit("NO");
if(mysql_num_rows($result) == 1) echo "YES";
else echo "NO";

function sql_param($string)
{
	(string) $string = $string;
	$string = PREG_REPLACE("/[^\w- ]|INSERT|DELETE|UPDATE|UNION|SET|SELECT|TRUNCATE|DROP|TABLE/i", "", $string);
	$string = TRIM($string);
	MYSQL_ESCAPE_STRING($string);
	return $string;
}
?>