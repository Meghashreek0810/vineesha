<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add feedback</title>

</head>

<body>

<form action="/addanfeedback" method="post" modelAttribute="feedback" enctype="multipart/form-data">
		<table width="30%" align="center"><br>
<br>

<h2><center>Feedback</center></h2>
<tr>
<td><b>Product id</b></td>
<td><input type="text" size=25 name="productId" required></td>
</tr>

<tr>
<td><b>Feedback id</b></td>
<td><input type="text" size=25 name="feedbackId" required></td>
</tr>

<tr>
<td><b>Feedback title</b></td>
<td><input type="text" size=25 name="feedbackTitle"></td>
</tr>

<tr>
<td><b>Feedback description</b></td>
<td><textarea name="description" rows="5" cols="27">
</textarea></td>
</tr>

<tr>
<td><b>Date</b></td>
<td><input type="text" size=25 name="date"></td>
</tr>

<tr>
<td><b>Rating</b></td>
<td><input type="text" size=25 name="rating"></td>
</tr>
</table><br><br>
<center><input type="submit" value="Submit"></center>
</form>
</body>
</html>