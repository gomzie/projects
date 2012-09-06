<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
</head>
<body>
	<form:form action="login" commandName="user">
		<table>
			<tr>
				<td>User Name</td>
				<td><form:input type='text' path='userName'/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:input type='password' path='password'/></td>
			</tr>
			<tr>
				<td>
					<input type='submit' value='Submit'></input>
				</td>
				<td></td>
			</tr>
			<tr>
				<td colspan='2'>
					<a href="createUser">Sign Up</a>
				</td>
			</tr>
		</table>
	</form:form>
</body>	
</html>	