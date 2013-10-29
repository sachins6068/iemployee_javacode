<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.srcdto.EmployeeInfo" %>
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
			<li><a href="#">Orders</a></li>
			<li><a href="#">Inventory</a></li>
			<li><a href="#"><b>Account Info</b></a></li>
			<li><a href="index.jsp">LogOut</a></li>
		</ul>
	</div>

	<div id="body" class="block-level drop-shadow bottom">
	<%   EmployeeInfo empinfo;
	empinfo= (EmployeeInfo) request.getAttribute("empinfo"); 
          String gender;
            %>
<form id="empform">
			<table style="text-align: left; width: 468px; height: 144px;"
				border="0" cellpadding="2" cellspacing="2">
				<tr>
					<td>First name:</td>
					<td><input type="text" name="firstname"></td>
				</tr>
				<tr>
					<td>Last name:</td>
					<td><input type="text" name="lastname"></td>
				</tr>
				<tr>
					<td>Date of Join:</td>
					<td><input type="text" name="dateofjoin"></td>
				</tr>
				<tr>
					<td>Your Manager:</td>
					<td><input type="text" name="manager"></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td><input type="radio" value="Male" name="gender">Male<input type="radio" value="Male" name="gender">Female</td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td>City:</td>
					<td><input type="text" name="city"></td>
				</tr>
				<tr>
					<td>State:</td>
					<td><input type="text" name="state"></td>
				</tr>
				<tr>
					<td>Zip:</td>
					<td><input type="text" name="zip"></td>
				</tr>
				<tr>
					<td>Location Name:</td>
					<td><input type="text" name="location"></td>
				</tr>
				
				
				<tr>
					<td></td>
					<td align="center"><input type="submit" value="Update"></td>
				</tr>
				
			</table>
			<br> 
</form>
</div>
</body>
</html>