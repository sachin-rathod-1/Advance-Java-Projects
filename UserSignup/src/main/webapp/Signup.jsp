<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<form method="post" action="/UserSignup/MySearvlet" enctype="multipart/form-data">
	<center>
		<table>
		<tr>
			<th colspan="2" style="color:green;"><h2>Signup Form</h2></th>
		</tr>
		<br>
			<tr>
				<td>First Name: </td>
				<td>
					<input type="text" name="First_name" style="width:370px;" placeholder="Enter First Name"/>
				</td>
			</tr>
			<br>
			<tr>
				<td>Last Name: </td>
				<td>
					<input type="text" name="Last_name" style="width:370px;" placeholder="Enter Last Name"/>
				</td>
			</tr>
			<br>
			<tr>
				<td>Gender:</td>
				<td>
					<select name="Gender" style="width:370px;">
						<option value="">--SELECT Gender--</option>
						<option value="Gender">Male</option>
						<option value="Gender">Female</option>
					</select>
				</td>
			</tr>
			<br>
			<tr>
				<td>Mobile Number: </td>
				<td>
					<input type="text"" name="Contact_no" style="width:370px;" placeholder="Enter Mobile Number"/>
				</td>
			</tr>
			<br>
			<tr>
				<td>Email ID: </td>
				<td>
					<input type="email" name="Email_id" style="width:370px;" placeholder="Enter Email Adress"/>
				</td>
			</tr>	
			<br>
			<tr>
				<td>Enter Password: </td>
				<td>
					<input type="password"" name="Password" style="width:370px;" placeholder="Enter Password"/>
				</td>
			</tr>
			<br>	
			<tr>
				<td>Confirm Password: </td>
				<td>
					<input type="text"" name="Confirm_Password" style="width:370px;" placeholder="Confirm Password"/>
				</td>
			</tr>
			<br>
			<tr>
				<td>Upload Image</td>
				<td>
					<input type="file" name="photo" />
				</td>
			</tr>
			<br>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="SignUp" name="Signup" />
				</td>
			</tr>
			<br>
			<tr>
				<td></td>
				<td>
					<h4>Existing User?<a href="Login.jsp"> Login </a> here</h4>
				</td>
			</tr>
						
		</table>
	</center>
	</form>
	
	

</body>
</html>