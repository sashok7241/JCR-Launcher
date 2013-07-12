<?php
	/*
		Файл настроек
		Восстановил по крупицам tehead
		Нехер было красть мой дизайн, крафтчик :)
	*/
	if(!defined("IMPASS_CHECK")) die("Иди нахуй!");
	
	# БАЗА ДАННЫХ
	
	$db_host = "localhost";
	$db_port = "3306";
	$db_user = "root";
	$db_pass = "password";
	$db_database = "launcher";
	
	$db_table = "users";
	$db_colId = "user_id";
	$db_colUser = "username";
	$db_colPass = "pass";
	$db_colSalt = "salt";
	$db_tableOther = "xf_user_authenticate";
	$db_colSesId = "session";
	
	# Версия
	$version = "1";
	# Защитный ключ
	$protectKey = "ключ защиты";
	# Тип хеша
	$crypt = "hash_md5";
	# Папка темы
	$themeFolder = "";
	
	
	# НЕИЗВЕСТНО, ЧТО ИЗ СЕБЯ ПРЕДСТАВЛЯЮТ
	# Раздел авторизации
	$programName = "";
	# Раздел мониторинга
	$pauseMon = "";
	$servers = Array(); //?!?
	$serverList = Array(); //?!?
	$pauseSelMon = Array(); //?!?
	# Раздел тем
	$online_elements = Array();
	$themeColor = "";
	$online_theme = "";
?>