<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<link rel="stylesheet" type="text/css" href="css/home.css" />
<title>iEmployee Login</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script language="JavaScript" type="text/javascript"></script><script language="javascript">
<!--
function authenticateValidate()
{
if(document.loginform.username.value=="")
{
	alert("Please fill username field");
	return false;
}
else if(document.loginform.password.value==""){
	alert("Please fill password field");
	return false;
}
else{
	
return true;
}
}//end of function
//-->
</script>
</head>
<body>
<div id="box">
 <%
 if(request.getAttribute("authenticationmsg")!=null){
 //out.println(request.getAttribute("authenticationmsg"));
 %>
 <script type="text/javascript">
alert("Incorrect Details, Please try again!");
</script>
 <%
 }
 %>
 <form id="loginform" name="loginform" method="post"
 action="LoginServlet">
<table>
    <tr>
      <td align="right"><p id="text">Username:</p></td>
      <td align="left">
		<input type="text" name="username" id="username">
	</td>
    </tr>
    <tr>
      <td align="right"><p id="text">Password:</p></td>
      <td align="left"><input name="password" id="password"
 type="password" /></td>
    </tr>
    <tr>
      <td align="right"><input type="submit" value="Log In" onclick="return authenticateValidate()"></td>
      <td align="left"><input type="reset" value="Reset"></td>
    </tr>
</table>
</form>
</div> 
</body>
</html>