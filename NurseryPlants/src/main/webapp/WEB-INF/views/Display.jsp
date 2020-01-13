<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Page</title>
</head>
<body  bgcolor="#FFF462">

<table>
<tr>
<td>Plants Id   </td>
<td>Plants Name </td>
<td>Plants Price</td>

</tr>
<c:forEach var="p" items="${plist}">
<tr>
<td>${p.id}</td>
<td>${p.name}</td>
<td>${p.price}</td>
<td><a href="add/${p.id}">add</a>

</td>
</tr>

</c:forEach>
</table>
<a href="login"><button>logout</button></a>
<a href="history"><button>history</button></a>
</body>
</html>