<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>EasyMark-Admin</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="easymark.pe.kr admin page">
	<meta name="author" content="Muhammad Usman">

	<!-- The styles -->
	<link id="bs-css" href="css/bootstrap-cerulean.css" rel="stylesheet">
	<style type="text/css">
	  body {
		padding-bottom: 40px;
	  }
	  .sidebar-nav {
		padding: 9px 0;
	  }
	</style>
	<link href="css/bootstrap-responsive.css" rel="stylesheet">
	<link href="css/charisma-app.css" rel="stylesheet">
	<link href="css/jquery-ui-1.8.21.custom.css" rel="stylesheet">
	<link href='css/fullcalendar.css' rel='stylesheet'>
	<link href='css/fullcalendar.print.css' rel='stylesheet'  media='print'>
	<link href='css/chosen.css' rel='stylesheet'>
	<link href='css/uniform.default.css' rel='stylesheet'>
	<link href='css/colorbox.css' rel='stylesheet'>
	<link href='css/jquery.cleditor.css' rel='stylesheet'>
	<link href='css/jquery.noty.css' rel='stylesheet'>
	<link href='css/noty_theme_default.css' rel='stylesheet'>
	<link href='css/elfinder.min.css' rel='stylesheet'>
	<link href='css/elfinder.theme.css' rel='stylesheet'>
	<link href='css/jquery.iphone.toggle.css' rel='stylesheet'>
	<link href='css/opa-icons.css' rel='stylesheet'>
	<link href='css/uploadify.css' rel='stylesheet'>

	<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
	  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

	<!-- The fav icon -->
	<link rel="shortcut icon" href="img/favicon.ico">
		
</head>

<body>
	<!-- topbar starts -->
		<jsp:include page="header.jsp"></jsp:include>
	<!-- topbar ends -->
	
	<div class="container-fluid">
		<div class="row-fluid">
				
			<!-- left menu starts -->
				<jsp:include page="menu.jsp"></jsp:include>
			<!-- left menu ends -->
			
			<!-- content starts -->
			<div id="content" class="span10">
				<!-- dashboard 대시보드-->
					<jsp:include page="dashboard.jsp"></jsp:include>
				<!-- dashboard END -->
				
				<!-- membership 회원관리-->
					<jsp:include page="membership.jsp"></jsp:include>
				<!-- membership END -->
				
				<!-- statistics 통계-->
					<jsp:include page="statistics.jsp"></jsp:include>
				<!-- statistics END -->
			</div>
			<!-- content ends -->
		</div>
				
		<hr>

		<footer>
			<p class="pull-left">&copy; <a href="http://iamapark89.wordpress.com/" target="_blank">J.Y.Park</a> 2013</p>
			<p class="pull-right">Project: <a target="_blank" href="http://easymark.pe.kr">EasyMark</a></p>
			<div id="contents">contents2</div>
		</footer>
		
	</div><!--/.fluid-container-->

	<!-- external javascript
	================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	
	<!-- 자바스크립트 라이브러리 import하는 js -->
	<script src="tipJS/tipJS-MVC-dev.js"></script>
	<script>
	window.onload = function(){
		tipJS.loadApp(["EasyMarkAdmin"]);
	};
		
	 
	</script>
	
	<script src="js/main/import.js"></script>
	<script src="js/main/main.js"></script>
	<script src='js/charisma.js'></script>
</body>
</html>