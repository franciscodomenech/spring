<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<form method="POST" action="index">
<input name="entero" type="number" placeholder="ENTERO"/>
<input name="texto" type="text" placeholder="TEXTO"/>
<input type="submit" value="ENVIAR"/>
</form>
</body>
</html>
