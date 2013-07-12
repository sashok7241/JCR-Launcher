<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8">
<meta http-equiv="Content-Language" content="ru">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>�������</title>
<style type="text/css">
html,body {
	font-family: Arial, Tahoma, Helvetica, sans-serif;
	font-size: 9px;
	color: <?php echo$_GET['color']; ?>;
	margin: 0;
}

.title {
	font-size: 10px;
}

.text {
	font-size: 9px;
}

a {
	color: <?php echo$_GET['color']; ?>;
	text-decoration: none;
}

img {
	border: 0;
	margin: 0;
}
</style>
</head>
<body>
  <?php
		
$file = fopen("../news/news.txt", "r");
		while(!feof($file))
		{
			$line = fgets($file);
			$news = str_replace('[title]', '<b><span class="title">', $line);
			$news = str_replace('[/title]', '</span></b><br />', $news);
			$news = str_replace('[text]', '<span class="text">', $news);
			$news = str_replace('[/text]', '</span>', $news);
			$news = str_replace('[url="', '<a href="', $news);
			$news = str_replace('[/url]', '</a>', $news);
			$news = str_replace('"]', '">', $news);
			$news = str_replace('[n]', '<div></div>', $news);
			$news = str_replace(':)', '<img src="../news/data/smile.png"></img>', $news);
			$news = str_replace(':(', '<img src="../news/data/frown.png"></img>', $news);
			$news = str_replace('[rage]', '<img src="../news/data/mad.png"></img>', $news);
			$news = str_replace('>:\\', '<img src="../news/data/mad.png"></img>', $news);
			$news = str_replace(':\\', '<img src="../news/data/confused.png"></img>', $news);
			$news = str_replace(':D', '<img src="../news/data/biggrin.png"></img>', $news);
			$news = str_replace('B)', '<img src="../news/data/cool.png"></img>', $news);
			$news = str_replace(':O', '<img src="../news/data/eek.png"></img>', $news);
			$news = str_replace(':P', '<img src="../news/data/tongue.png"></img>', $news);
			$news = str_replace(';D', '<img src="../news/data/wink.png"></img>', $news);
			$news = str_replace('8)', '<img src="../news/data/rolleyes.png"></img>', $news);
			$news = str_replace('[redface]', '<img src="../news/data/redface.png"></img>', $news);
			$news = str_replace('[facepalm]', '<img src="../news/data/facepalm.gif"></img>', $news);
			echo ($news);
		}
		fclose($file);
		?>
	</body>
</html>