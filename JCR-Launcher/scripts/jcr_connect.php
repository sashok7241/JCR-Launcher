<?php
	/*
		Файл соединения с БД
		Восстановил по крупицам tehead
		Нехер было красть мой дизайн, крафтчик :)
	*/
	if(!defined("IMPASS_CHECK")) die("Иди нахуй!");
	$link = @mysql_connect($db_host.':'.$db_port,$db_user,$db_pass) or die(mysql_error());
	mysql_select_db($db_database,$link);
	mysql_query("SET names UTF8");
?>