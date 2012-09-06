<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>	
	
<body>
	<table>
		<tr>
			<td>Name</td>
			<td><c:out value="${user.userName }"/></td>
			
		</tr>
		<tr>
			<td>Email</td>
			<td><c:out value="${user.email }"/></td>
			
		</tr>
		<tr>
			<td>First Name</td>
			<td><c:out value="${user.firstName}"/></td>
			
		</tr>
		<tr>
			<td>Middle Name</td>
			<td><c:out value="${user.middleName }"/></td>
			
		</tr>
		<tr>
			<td>Last Name</td>
			<td><c:out value="${user.lastName }"/></td>
			
		</tr>
		<tr>
			<td>Telephone</td>
			<td><c:out value="${user.phoneNumber }"/></td>
			
		</tr>
		<tr>
			<td>Organization</td>
			<td><c:out value="${user.organization }"/></td>
			
		</tr>
		<tr>
			<td>Role</td>
			<td><c:out value="${user.role.role }"/></td>
			
		</tr>
	</table>
</body>
</html>
	