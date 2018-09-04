<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>generate coupons</title>
</head>
<body>
<form action="/generatingcoupons" method="post" modelAttribute="coupons" enctype="multipart/form-data">
<table width="30%" ><br>


<font color="red"><h3>Generate Coupons</h3></font>
<tr>
<td><b>Emil Id</b></td>
<td><input type="text" size=25 placeholder="Enter EmailId" name="emailId" required></td>
</tr>

<tr>
<td><b>Coupon Code</b></td>
<td><input type="text" size=25 placeholder="Enter couponCode" name="couponCode" required></td>
</tr>

<tr>
<td><b>Coupon Amount</b></td>
<td><input type="text" size=25 placeholder="Enter couponAmount" name="couponAmount" required></td>
</tr>

<tr>
<td><b>Start Date</b></td>
<td><input type="text" size=25 placeholder="Enter startDate" name="startDate" required></td>
</tr>	

<tr>
<td><b>End Date</b></td>
<td><input type="text" size=25 placeholder="Enter endDate" name="endDate" required></td>
</tr>	


</table><br>
<input type="submit" value="Generate coupon">
</form>


</body>
</html>