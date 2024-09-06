<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="WelcomeServlet">

<table class="center" width="345" border="3" bgcolor="pink">

<tr>

<th height="34">Enter your Email</th>

<td><input type="email" name="email"/></td>

</tr>

<tr>
<th height="33">Enter your passowrd</th>

<td><input type="password" name="password" /></td>

</tr>

<br>
<tr>
<%
if(request.getParameter("email")== null && request.getParameter("password")== null){
	%>
	<marquee width="40%" direction="left" behavior="alternate" scrollamount="50" height="30%"><a href="welcome.jsp"><input type="submit" value="Login"/></marquee>
  
  <%
}
else{%>

<a href="welcome.jsp"><input type="submit" value="Login"/>

 <%	
}
%>



</tr>
<br>
<tr>
 <h4>New User?<a href="Signup.jsp">Create_New_Account</a></h4><br/>
<a href="resetPass.jsp">Forget Password</a></th>

</tr>
</table>
</form>
</body>
</html>