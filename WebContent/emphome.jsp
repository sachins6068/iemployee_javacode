<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>itrendz</title>
<link rel="stylesheet" href="css/homemenu.css" type="text/css" />


</head>
<body>
	<div id="nav">
		<p class="title">
			<img src="images/logo.png" height="40px" width="130px"/>
		</p>
		<ul id="navigation">
			<li><a href="#"><b>Orders</b></a></li>
			<li><a href="#">Inventory</a></li>
			<li><a href="EmployeeInfoServlet?empid=<%=request.getAttribute("empid")%>" >Account Info</a></li>
			<li><a href="index.jsp">LogOut</a></li>
		</ul>
	</div>

	<div id="body">
	
	Welcome <%=request.getAttribute("empid")%>
	
	</div>
</body>
</html>