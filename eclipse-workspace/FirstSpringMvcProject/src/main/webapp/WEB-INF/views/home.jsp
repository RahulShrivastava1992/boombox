<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html style="background-color:silver; ">
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello user verify your credentials!  
</h1>
	<div align="center">
	<form name="login" method="get" >
	<div align="left">
	<br><br>
	<input type ="text" name="id" id="id">
	<br><br><br>
	<input type ="password" name="password" id="password">
	<br><br><br>
	<input type="submit" name="btn" value="Login">
	
	</div>
	</form>
	</div>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
