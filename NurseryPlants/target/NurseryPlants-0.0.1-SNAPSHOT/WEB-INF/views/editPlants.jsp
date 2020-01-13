<%@page import="com.training.beans.Plants"%>
<%@ page language="java" import="com.training.beans.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit plant details</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script> 

</head>
<body margin: 0 auto; width:250px;text-align: center;  bgcolor="#FFF462">
<%
Plants p=(Plants)request.getAttribute("p");
%>
<form action="/NurseryPlants/updatePlants">
	<table border="1" align="center" class="table table-striped table-primary">
		<tr><td>Id</td><td><input type="text" name="id" value="${p.id}" readonly></td></tr>
		<tr><td>Name</td><td><input type="text" name="nm" value="${p.name }" ></td></tr>
		<tr><td>Price</td><td><input type="text" name="price" value="${p.price}" ></td></tr>
		<tr><td colspan="2" align="center"><input type="submit" name="btn" value="submit"></td></tr>
	</table>
</form>
</body>
</html>