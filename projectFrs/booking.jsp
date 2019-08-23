<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="BookingServlet">
date <input type="date" name="date">
from <input type="text" name="source">
to <input type= "text" name="destination">
bookings <input type="text" name="bookings">
<input type="submit" value="book">

</form>
</body>
</html>