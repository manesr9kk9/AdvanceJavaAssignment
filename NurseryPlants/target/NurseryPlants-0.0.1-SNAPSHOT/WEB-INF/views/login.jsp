<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script> 
<title>Login Page</title>
</head>
<body>
<form  action="login">
<table border="1" align="center" class="table table-striped table-primary">
<tr><h1 class="text-Success" align="center">Login Page</h1></tr>
<tr><td>UserName</td><td><input type="text" class="text-Success" name="uname"></td></tr>
<tr><td>Password</td><td><input type="password" class="text-Success" name="upass"></td></tr>
<tr><td>UserType</td><td><input type="text" class="text-Success" name="utype"></td></tr>
<tr><td colspan="2" align="center"><input type="submit" class="btn btn-success" name="btn1" value="submit">
<input type="reset" name="btn1" class="btn btn-danger" value="Cancel"></td></tr>
</table>
</form>
</body>
</html>