<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>	
	
<body>
	<div id='createUser'>
		<form:form commandName="user" action="userDetails">
  			<fieldset>
				<legend>Create New User</legend>
				<label for='userName'>Username</label><form:input type='text' path='userName'/><br/>
				<label for='password'>Password</label><form:input type='password' path='password'/><br/>
				<label for='email'>Email</label><form:input type='text' path='email'/><br/>
				<label for='firstName'>First Name</label><form:input type='text' path='firstName'/><br/>
				<label for='middleName'>Middle Name</label><form:input type='text' path='middleName'/><br/>
				<label for='lastName'>Last Name</label><form:input type='text' path='lastName'/><br/>
				<label for='organization'>Organization</label><form:input type='text' path='organization'/><br/>
				<label for='jobTitle'>Job Title</label><form:input type='text' path='jobTitle'/><br/>
				<label for='phoneNumber'>Phone Number</label><form:input type='text' path='phoneNumber'/><br/>
				<label for='country'>Country</label><form:input type='text' path='country'/><br/>
				<label for='role'>Role</label>
					<form:select path='role'>
						<option value='1'>Admin</option>
						<option value='2' selected='selected'>Customer</option>
					</form:select>
  			</fieldset>
			<input type='button' value='Close' id='closeNewForm' />
			<input type='submit' value='Submit'/>
		</form:form>
	</div>
</body>
</html>
