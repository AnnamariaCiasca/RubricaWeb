<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
 	<form action="${pageContext.request.contextPath}/login" method="POST">   <%--action="/RubricaWeb/LoginServlet"> --%>
		<p>
			Username: <input type="text" name="username">
		</p>
		<p>
			Password: <input type="password" name="password">
		</p>
		<button type="submit">LogIn</button>
		<button type="reset">Reset</button>
	</form>
</body>
</html>