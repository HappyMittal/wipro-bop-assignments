<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="SearchFlightServlet">
<input type="date" name="date">
Source : <input type="text" name="source">
Destination : <input type="text" name="destination">
Bookings : <input type="text" name="bookings">
<input type="submit" value="search">
</form>

</body>
</html>