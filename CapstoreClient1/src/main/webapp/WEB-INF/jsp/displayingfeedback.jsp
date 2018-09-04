<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add feedback</title>
</head>
<body>
<!--provide an html table start tag -->
<form>
<table border=1 style="text-align:center">
<caption>List of feedbacks</caption>
<thead>
<tr>
<th>id</th>
<th>title</th>
<th>date</th>
<th>rating</th>
<th>description</th></tr></thead>
	<!-- iterate over the collection using forEach loop -->
	<c:forEach var="feedback" items="${feedback}">
		<!-- create an html table row -->
		<tr>
			<!-- create cells of row -->
			<td>${feedback.feedbackId}</td>
			<td>${feedback.feedbackTitle}</td>
			<td>${feedback.date}</td>
			<td>${feedback.rating}</td>
			<td>${feedback.feedbackDescription}</td>
			<!-- close row -->
		</tr>
		<!-- close the loop -->
	</c:forEach>
	<!-- close table -->
</table>
</form>
</body>
</html>