<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
</head>
<body>
<table   align="centre" >
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

</tr></c:forEach>
</table>
<a href="Display"><button>Add Plants</button></a>
</body>
</html>