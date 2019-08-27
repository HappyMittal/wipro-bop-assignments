<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
    <%@page import="com.wipro.frs.bean.*"%>
    <%@page import="javax.servlet.http.*"%>
     <%@page import="javax.servlet.*"%>
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="login.jsp">
<%
ArrayList <FlightDetailBean> flightList= (ArrayList<FlightDetailBean>)session.getAttribute("flightlist");
for(FlightDetailBean fdb : flightList)
{
	out.println(fdb.getFlightId()+"&nbsp&nbsp;"+fdb.getSource()+"&nbsp&nbsp;"+fdb.getDestination()+"&nbsp&nbsp;"+fdb.getPrice()+"&nbsp&nbsp;"+fdb.getDepTime()+"&nbsp&nbsp;"+fdb.getArrTime());
	out.println("<br>");
}

%>
<input type="submit" value="Continue Booking">

</form>

</body>
</html>