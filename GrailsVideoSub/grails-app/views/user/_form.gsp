<%@ page import="videosub.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="user.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="email" required="" value="${userInstance?.email}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'password', 'error')} required">
	<label for="password">
		<g:message code="user.password.label" default="Password" />
		<span class="required-indicator">*</span>
	</label>
	<g:passwordField name="password" required="" type="password" value="${userInstance?.password}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'salutation', 'error')} ">
	<label for="salutation">
		<g:message code="user.salutation.label" default="Salutation" />
		
	</label>
	<g:textField name="salutation" value="${userInstance?.salutation}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'firstName', 'error')} required">
	<label for="firstName">
		<g:message code="user.firstName.label" default="First Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="firstName" required="" value="${userInstance?.firstName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'middleName', 'error')} ">
	<label for="middleName">
		<g:message code="user.middleName.label" default="Middle Name" />
		
	</label>
	<g:textField name="middleName" value="${userInstance?.middleName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'lastName', 'error')} required">
	<label for="lastName">
		<g:message code="user.lastName.label" default="Last Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lastName" required="" value="${userInstance?.lastName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'organization', 'error')} ">
	<label for="organization">
		<g:message code="user.organization.label" default="Organization" />
		
	</label>
	<g:textField name="organization" value="${userInstance?.organization}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'phoneNumber', 'error')} ">
	<label for="phoneNumber">
		<g:message code="user.phoneNumber.label" default="Phone Number" />
		
	</label>
	<g:textField name="phoneNumber" value="${userInstance?.phoneNumber}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'jobTitle', 'error')} ">
	<label for="jobTitle">
		<g:message code="user.jobTitle.label" default="Job Title" />
		
	</label>
	<g:textField name="jobTitle" value="${userInstance?.jobTitle}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'country', 'error')} ">
	<label for="country">
		<g:message code="user.country.label" default="Country" />
		
	</label>
	<g:textField name="country" value="${userInstance?.country}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'addresses', 'error')} ">
	<label for="addresses">
		<g:message code="user.addresses.label" default="Addresses" />
		
	</label>
	<g:select name="addresses" from="${videosub.Address.list()}" multiple="multiple" optionKey="id" size="5" value="${userInstance?.addresses*.id}" class="many-to-many"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'dateUpdated', 'error')} required">
	<label for="dateUpdated">
		<g:message code="user.dateUpdated.label" default="Date Updated" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dateUpdated" precision="day"  value="${userInstance?.dateUpdated}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'type', 'error')} required">
	<label for="type">
		<g:message code="user.speaker.label" default="User Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="type" name="type" from="${['admin','customer']}" required="" value="${userInstance?.type}"/>
</div>