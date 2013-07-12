<?php
define('IMPASS_CHECK', true);
include ('jcr_settings.php');
$action = $_GET ['action'];
$verApp = $_GET ['version'];
$request = $_GET ['request'];
if($action == 'theme')
{
	if($version == $verApp) for($i = 0; $i < count($online_elements); $i++)
	{
		if($request == $online_elements [$i]) header('Location: ' . 'files/' . $themeFolder . '/' . $online_elements [$i]);
	}
	if($request == 'color') echo $themeColor;
} else if($action == 'settings')
{
	if($online_theme) $use_online_theme = 'true';
	else $use_online_theme = 'false';
	echo $use_online_theme . '<::>';
	if($online_theme && $request == 'elements' && $version == $verApp)
	{
		for($i = 0; $i < count($online_elements); $i++)
			echo $online_elements [$i] . "<:i:>";
	}
}
?>