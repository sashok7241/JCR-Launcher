<?php
	define('IMPASS_CHECK', true);
	include ("jcr_connect.php");
	$user = mysql_real_escape_string($_GET ['user']);
	$serverid = mysql_real_escape_string($_GET ['serverId']);
	$result = mysql_query("SELECT $db_colUser FROM $db_table WHERE $db_colUser='$user' AND $db_colServer='$serverid'") or die("Ошибка");
	$row = mysql_fetch_assoc($result);
	$realUser = $row [$db_colUser];
	if($user != $realUser) exit("NO");
	if(mysql_num_rows($result) == 1) echo "YES";
	else echo "NO";
?>