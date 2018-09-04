<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>display image</title>
</head>
<body>
<form action="/displayingImage" method="post" modelAttribute="p" enctype="multipart/form-data">
		<label>Image display</label></br>
		product id<input type="text" name="productId"  ><br>
		
		<input type="submit">
	</form>
	
	<br>
	
</body>
</html>

