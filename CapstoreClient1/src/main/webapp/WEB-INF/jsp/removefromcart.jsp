<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">




<html>
<head>
<title>Remove products from cart</title>

</head>

<body>

<form name="removingFromCart" method="post" action="/removingfromcart" >
<table width="30%" ><br>
<br>

<font color="red"><h3>Removing products from cart</h3></font>

<tr>
<td><b>Emil Id</b></td>
<td><input type="text" size=25 placeholder="Enter EmailId" name="emailId" required></td>
</tr>

<tr>
<td><b>Product Id</b></td>
<td><input type="text" size=25 placeholder="Enter productId" name="productId" required></td>
</tr>

</table><br>
<input type="submit" value="Remove from cart">
</form>
</body>
</html>