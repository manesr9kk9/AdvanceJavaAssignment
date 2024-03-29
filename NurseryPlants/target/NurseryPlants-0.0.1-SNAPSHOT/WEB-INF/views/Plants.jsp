<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script> 

<title>Show plants</title>
</head>
<body  bgcolor="#FFF462">

<h2 align="center">Admin Home Page</h2>
<h1 align="center"> Plant Details</h1>

<table  border="1" align="center" class="table table-striped table-primary">
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
<td><a href="delete/${p.id}">delete</a>
<a href="edit/${p.id}">edit</a>
</td>
</tr>

</c:forEach>
</table>
<a href="addPlants"><button class="btn btn-primary" align="center">Add Plants</button></a>
<a href="./"><button class="btn btn-danger" align="center">Logout</button></a>
</body>
</html>