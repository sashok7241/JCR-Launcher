<?php
	define('IMPASS_CHECK', true);
	include ("jcr_settings.php");
	$action = $_GET ['action'];
	$getIP = $_GET ['ip'];
	$getPort = $_GET ['port'];
	if($action == 'status' && $getIP != null && $getPort != null)
	{
		if(!$pauseMon)
		{
			for($i = 0; $i < count($pauseSelMon); $i++)
			{
				$splitServer = explode(" :: ", $pauseSelMon [$i]);
				$contains = strCaseCmp($splitServer [0], $getIP) . strCaseCmp($splitServer [1], $getPort);
				if($contains == '00') break;
			}
			if($contains != '00')
			{
				$Server = new ServerStatus($IP = $getIP, $Port = $getPort);
				$status = $Server->Online ? true : false;
				if($Server && $status)
				{
					$players = preg_replace('/\D/', '', $Server->OnlinePlayers);
					$maxplayers = preg_replace('/\D/', '', $Server->MaxPlayers);
					if(empty($maxplayers)) echo 'TechWork';
					else echo $players . '<::>' . $maxplayers;
				} else
					echo 'OFF';
			} else
				echo 'TechWork';
		} else
			echo 'TechWork';
	} else if($action == 'servers')
	{
		for($i = 0; $i < count($servers); $i++)
		{
			$serversList = $serversList . $servers [$i] . '<::>' . '<br>';
		}
		echo substr_replace($serversList, '', strrpos($serversList, '<::>'));
	}
	class ServerStatus
	{
		private $Socket, $Info;
		public $Online, $OnlinePlayers, $MaxPlayers, $IP;
	
		public function __construct($IP, $Port = '25565')
		{
			$Socket = @fsockopen($IP, $Port);
			if($Socket == false)
			{
				$this->Online = false;
			} else
			{
				$this->Online = true;
				fwrite($Socket, "\xFE");
				$data = @fread($Socket, 256);
				@fclose($Socket);
				if($data == false or substr($data, 0, 1) != "\xFF") return;
				$Info = substr($data, 3);
				$Info = iconv('UTF-16BE', 'UTF-8', $Info);
				if($Info [1] === "\xA7" && $Info [2] === "\x31")
				{
					$Info = explode("\x00", $Info);
					$this->OnlinePlayers = IntVal($Info [4]);
					$this->MaxPlayers = IntVal($Info [5]);
				} else
				{
					$Info = Explode("\xA7", $Info);
					$this->OnlinePlayers = IntVal($Info [1]);
					$this->MaxPlayers = IntVal($Info [2]);
				}
			}
		}
	}
?>