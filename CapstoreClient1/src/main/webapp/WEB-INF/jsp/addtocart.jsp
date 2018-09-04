<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding products to cart</title>
</head>

<body>

<form name="addingProductToCart" action="/addingtocart" method="post" >
<table width="30%" ><br>
<br>

<font color="red"><h3>Adding products to cart</h3></font>

<tr>
<td><b>Email Id</b></td>
<td><input type="text" size=25 placeholder="Enter EmailId" name="emailId" required></td>
</tr>

<tr>
<td><b>Product Id</b></td>
<td><input type="text" size=25 placeholder="Enter productId" name="productId" required></td>
</tr>


</table><br>
<input type="submit" value="Add to cart">
</form>
</body>
</html>