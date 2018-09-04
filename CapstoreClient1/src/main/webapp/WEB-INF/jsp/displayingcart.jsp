<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>displaying cart</title>
</head>
<body>
<!--provide an html table start tag -->
<form>
<table border=1 style="text-align:center">
<caption>List of products</caption>
<thead>
<tr>
<th>id</th>
<th>name</th>
<th>price</th>
<th>quantity</th>
</tr></thead>
	<!-- iterate over the collection using forEach loop -->
	<c:forEach var="cart" items="${cart}">
		<!-- create an html table row -->
		<tr>
			<!-- create cells of row -->
			<td>${cart.productId}</td>
			<td>${cart.productName}</td>
			<td>${cart.price}</td>
			<td>${cart.quantity}</td>
			<!-- close row -->
		</tr>
		<!-- close the loop -->
	</c:forEach>
	<!-- close table -->
</table>
</form>
</body>
</html>