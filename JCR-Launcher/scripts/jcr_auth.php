<?php
	define("IMPASS_CHECK", true);
	include ("jcr_connect.php");
	include ("jcr_settings.php");
	$action = mysql_real_escape_string($_GET ["action"]);
	$getLogin = mysql_real_escape_string($_GET ["login"]);
	$getPass = mysql_real_escape_string($_GET ["password"]);
	$appHash = mysql_real_escape_string($_GET ["hash"]);
	$appForm = mysql_real_escape_string($_GET ["format"]);
	$client = mysql_real_escape_string($_GET ["client"]);
	$secCode = mysql_real_escape_string($_GET ["code"]);
	if(!($secCode == sha1($protectKey))) die("BadCode");
	if($action == "auth")
	{
		if(!preg_match("/^[a-zA-Z0-9_]+$/", $getLogin) || !preg_match("/^[a-zA-Z0-9_]+$/", $getPass)) die("BadData");
		$sessid = generateSessionId();
		$getLogin = mysql_real_escape_string($getLogin);
		if($crypt == 'hash_md5' || $crypt == 'hash_authme' || $crypt == 'hash_xauth' || $crypt == 'hash_cauth' || $crypt == 'hash_joomla' || $crypt == 'hash_wordpress' || $crypt == 'hash_dle' || $crypt == 'hash_drupal')
		{
			$query = mysql_query("SELECT $db_colUser, $db_colPass FROM $db_table WHERE $db_colUser='$getLogin'") or die(mysql_error());
			$row = mysql_fetch_assoc($query);
			$getLogin = $row [$db_colUser];
			$realPass = $row [$db_colPass];
		} else if($crypt == 'hash_ipb' || $crypt == 'hash_vbulletin')
		{
			$query = mysql_query("SELECT $db_colId, $db_colUser, $db_colPass, $db_colSalt FROM $db_table WHERE $db_colUser='$getLogin'") or die(mysql_error());
			$row = mysql_fetch_assoc($query);
			$getLogin = $row [$db_colUser];
			$realPass = $row [$db_colPass];
			$salt = $row [$db_colSalt];
		} else if($crypt == 'hash_xenforo')
		{
			$query = mysql_query("SELECT $db_table.$db_colId, $db_table.$db_colUser, $db_tableOther.$db_colId, $db_tableOther.$db_colPass FROM $db_table, $db_tableOther WHERE $db_table.$db_colId = $db_tableOther.$db_colId AND $db_table.$db_colUser='$getLogin'") or die(mysql_error());
			$row = mysql_fetch_assoc($query);
			$getLogin = $row [$db_colUser];
			$realPass = substr($row [$db_colPass], 22, 64);
			$salt = substr($row [$db_colPass], 105, 64);
		} else
			die("Error: Unknown encryption format");
		$hashPass = $crypt();
		if($getLogin != null && $getPass != null && $client != "null")
		{
			if(!($realPass == $hashPass)) die("BadData");
			else
			{
				if(!file_exists("files/clients/$client/bin/minecraft.jar") || !file_exists("files/clients/$client/bin/lwjgl.jar") || !file_exists("files/clients/$client/bin/lwjgl_util.jar") || !file_exists("files/clients/$client/bin/jinput.jar") || !file_exists("files/clients/$client/extra.zip")) die("Error: Some elements of client '" . $client . "' not detected");
				if(!file_exists("files/program/" . $programName . $appForm)) die("Error: Program update file is not detected");
				$md5_zip = md5_file("files/clients/$client/extra.zip");
				$md5_jar = md5_file("files/clients/$client/bin/minecraft.jar");
				$md5_lwjql = md5_file("files/clients/$client/bin/lwjgl.jar");
				$md5_lwjql_util = md5_file("files/clients/$client/bin/lwjgl_util.jar");
				$md5_jinput = md5_file("files/clients/$client/bin/jinput.jar");
				$md5_program = md5_file("files/program/" . $programName . $appForm);
				$sha1_md5zip = sha1($md5_zip);
				$sha1_pass = sha1($realPass);
				$sha1_version = sha1($version);
				$sha1_seskey = sha1(generateSessionId());
				$last_version = "false";
				if(strtolower($appHash) == strtolower($md5_program)) $last_version = "true";
				echo $sha1_md5zip . "<::>" . $md5_jar . "<::>" . $md5_lwjql . "<::>" . $md5_lwjql_util . "<::>" . $md5_jinput . "<::>" . "<br>" . $sha1_version . "<::>" . $sha1_pass . "<::>" . $sha1_seskey . "<::>" . $last_version . "<::>" . "<br>";
				$mods = "";
				$numMods = 0;
				$modsfiles = scandir("files/clients/$client/mods");
				for($i = 0; $i < count($modsfiles); $i++)
				{
					if(substr($modsfiles [$i], -4) == ".zip" || substr($modsfiles [$i], -4) == ".jar")
					{
						$mods = $modsfiles [$i] . "<:h:>" . md5_file("files/clients/$client/mods/" . $modsfiles [$i]) . "<:m:>" . $mods;
						$numMods++;
					}
				}
				if($numMods == 0) echo "nomods";
				else echo substr_replace($mods, "", strrpos($mods, "<:m:>"));
				echo "<::>";
				$error = false;
				if($loadLibrary)
				{
					$library = @file_get_contents('http://www.er-log.ru/JCR_Launcher/scripts/jcr_library.php?action=library');
					if($library != "") echo $library;
					else $error = true;
				}
				if(!$loadLibrary || $error == true)
				{
					for($i = 0; $i < count($libraryForPatch); $i++)
					{
						$lfp_array = $libraryForPatch [$i] . "<:f:>" . $lfp_array;
					}
					echo substr_replace($lfp_array, "", strrpos($lfp_array, "<:f:>"));
				}
				echo "<::>" . get_image_url("skin") . "<::>" . get_image_url("cloak") . "<::>";
				$coremods = "";
				$numCoreMods = 0;
				$cmodsfiles = scandir("files/clients/$client/coremods");
				for($i = 0; $i < count($cmodsfiles); $i++)
				{
					if(substr($cmodsfiles [$i], -4) == ".zip" || substr($cmodsfiles [$i], -4) == ".jar")
					{
						$coremods = $cmodsfiles [$i] . "<:h:>" . md5_file("files/clients/$client/coremods/" . $cmodsfiles [$i]) . "<:m:>" . $coremods;
						$numCoreMods++;
					}
				}
				if($numCoreMods == 0) echo "nocoremods";
				else echo substr_replace($coremods, "", strrpos($coremods, "<:m:>"));
				echo "<::>" . $programName . $appForm . "<::>";
				$all_natives = "";
				$num_natives = 0;
				$natives = scandir("files/clients/$client/bin/natives");
				for($i = 0; $i < count($natives); $i++)
				{
					if(!is_dir("files/clients/$client/bin/natives/" . $natives [$i]))
					{
						$all_natives = $natives [$i] . "<:n:>" . $all_natives;
						$num_natives++;
					}
				}
				if($num_natives == 0) echo "nonatives";
				else echo substr_replace($all_natives, "", strrpos($all_natives, "<:n:>"));
				$md5_seskey = md5($sha1_seskey);
				$add_seskey = sha1(md5($md5_seskey . substr($md5_seskey, -3)) . $sessionKey);
				mysql_query("UPDATE $db_table SET $db_colSesId='$add_seskey' WHERE $db_colUser='$getLogin'") or die("Ошибка");
			}
		} else
		{
			die("BadParams");
		}
	}
	
	function generateSessionId()
	{
		srand(time());
		$randNum = rand(1000000000, 2147483647) . rand(1000000000, 2147483647) . rand(0, 9);
		return $randNum;
	}
	
	function get_image_url($type)
	{
		global $getLogin;
		if($type == "skin")
		{
			if(file_exists("files/skins/" . $getLogin . ".png")) return $getLogin . ".png";
			else return "default.png";
		} else if($type == "cloak")
		{
			if(file_exists("files/cloaks/" . $getLogin . ".png")) return $getLogin . ".png";
			else return "default.png";
		}
	}
	
	function hash_md5()
	{
		global $getPass;
		$cryptPass = false;
		$cryptPass = md5($getPass);
		return $cryptPass;
	}
	
	function hash_authme()
	{
		global $realPass, $getPass;
		$cryptPass = false;
		$ar = preg_split("/\\$/", $realPass);
		$salt = $ar [2];
		$cryptPass = '$SHA$' . $salt . '$' . hash('sha256', hash('sha256', $getPass) . $salt);
		return $cryptPass;
	}
	
	function hash_cauth()
	{
		global $realPass, $getPass;
		$cryptPass = false;
		if(strlen($realPass) == 32)
		{
			$cryptPass = md5($getPass);
		} else
		{
			$pass = md5($getPass);
			$cryptPass = substr($pass, 0, 8) . substr($pass, -23);
		}
		return $cryptPass;
	}
	
	function hash_xauth()
	{
		global $realPass, $getPass;
		$cryptPass = false;
		$saltPos = (strlen($getPass) >= strlen($realPass) ? strlen($realPass) : strlen($getPass));
		$salt = substr($realPass, $saltPos, 12);
		$hash = hash('whirlpool', $salt . $getPass);
		$cryptPass = substr($hash, 0, $saltPos) . $salt . substr($hash, $saltPos);
		return $cryptPass;
	}
	
	function hash_dle()
	{
		global $getPass;
		$cryptPass = false;
		$cryptPass = md5(md5($getPass));
		return $cryptPass;
	}
	
	function hash_joomla()
	{
		global $realPass, $getPass;
		$cryptPass = false;
		$parts = explode(':', $realPass);
		$salt = $parts [1];
		$cryptPass = md5($getPass . $salt) . ":" . $salt;
		return $cryptPass;
	}
	
	function hash_ipb()
	{
		global $getPass, $salt;
		$cryptPass = false;
		$cryptPass = md5(md5($salt) . md5($getPass));
		return $cryptPass;
	}
	
	function hash_xenforo()
	{
		global $getPass, $salt;
		$cryptPass = false;
		$cryptPass = hash('sha256', hash('sha256', $getPass) . $salt);
		return $cryptPass;
	}
	
	function hash_wordpress()
	{
		global $realPass, $getPass;
		$cryptPass = false;
		$itoa64 = './0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz';
		$count_log2 = strpos($itoa64, $realPass [3]);
		$count = 1 << $count_log2;
		$salt = substr($realPass, 4, 8);
		$input = md5($salt . $getPass, TRUE);
		do
			$input = md5($input . $getPass, TRUE); while(--$count);
		$output = substr($realPass, 0, 12);
		$count = 16;
		$i = 0;
		do
		{
			$value = ord($input [$i++]);
			$cryptPass .= $itoa64 [$value & 0x3f];
			if($i < $count) $value |= ord($input [$i]) << 8;
			$cryptPass .= $itoa64 [($value >> 6) & 0x3f];
			if($i++ >= $count) break;
			if($i < $count) $value |= ord($input [$i]) << 16;
			$cryptPass .= $itoa64 [($value >> 12) & 0x3f];
			if($i++ >= $count) break;
			$cryptPass .= $itoa64 [($value >> 18) & 0x3f];
		} while($i < $count);
		$cryptPass = $output . $cryptPass;
		return $cryptPass;
	}
	
	function hash_vbulletin()
	{
		global $getPass, $salt;
		$cryptPass = false;
		$cryptPass = md5(md5($getPass) . $salt);
		return $cryptPass;
	}
	
	function hash_drupal()
	{
		global $getPass, $realPass;
		$cryptPass = false;
		$setting = substr($realPass, 0, 12);
		$itoa64 = './0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz';
		$count_log2 = strpos($itoa64, $setting [3]);
		$salt = substr($setting, 4, 8);
		$count = 1 << $count_log2;
		$input = hash('sha512', $salt . $getPass, TRUE);
		do
			$input = hash('sha512', $input . $getPass, TRUE); while(--$count);
		$count = strlen($input);
		$i = 0;
		do
		{
			$value = ord($input [$i++]);
			$cryptPass .= $itoa64 [$value & 0x3f];
			if($i < $count) $value |= ord($input [$i]) << 8;
			$cryptPass .= $itoa64 [($value >> 6) & 0x3f];
			if($i++ >= $count) break;
			if($i < $count) $value |= ord($input [$i]) << 16;
			$cryptPass .= $itoa64 [($value >> 12) & 0x3f];
			if($i++ >= $count) break;
			$cryptPass .= $itoa64 [($value >> 18) & 0x3f];
		} while($i < $count);
		$cryptPass = $setting . $cryptPass;
		$cryptPass = substr($cryptPass, 0, 55);
		return $cryptPass;
	}
?>