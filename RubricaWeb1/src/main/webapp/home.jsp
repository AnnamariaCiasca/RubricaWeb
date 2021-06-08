<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     
<%@ page import="java.util.List" %>
<%@ page import="dto.User" %>
<%@ page import="model.entities.Contact" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- 		<jsp:setProperty name="user" property="*"/> --%>
<%-- 	</jsp:useBean> --%>
	
<%-- 	<%=user.getUsername()  + " " + user.getPassword() %> --%>
	<%  
		List<User> users = (List<User>) request.getSession().getAttribute("users");
 	%>
	<table>
	<thead>
		<tr><td>Elenco Contatti</td></tr>
	</thead>
	<tbody>
	<c:forEach items="${users}" var="u">
		<tr>
			<td><c:out value="${u.username }"></c:out></td>
			<td><c:out value="${u.password }"></c:out></td>
		</tr>
	</c:forEach>
	</tody>
	</table>

<a href="secure/SecureResourceServlet">Clicca per accedere</a>
</body>
</html>
