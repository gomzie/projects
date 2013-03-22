<%@ page import="videosub.Address" %>



<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'address1', 'error')} ">
	<label for="address1">
		<g:message code="address.address1.label" default="Address1" />
		
	</label>
	<g:textField name="address1" value="${addressInstance?.address1}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'address2', 'error')} ">
	<label for="address2">
		<g:message code="address.address2.label" default="Address2" />
		
	</label>
	<g:textField name="address2" value="${addressInstance?.address2}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'address3', 'error')} ">
	<label for="address3">
		<g:message code="address.address3.label" default="Address3" />
		
	</label>
	<g:textField name="address3" value="${addressInstance?.address3}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'city', 'error')} ">
	<label for="city">
		<g:message code="address.city.label" default="City" />
		
	</label>
	<g:textField name="city" value="${addressInstance?.city}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'state', 'error')} ">
	<label for="state">
		<g:message code="address.state.label" default="State" />
		
	</label>
	<g:textField name="state" value="${addressInstance?.state}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'postCode', 'error')} ">
	<label for="postCode">
		<g:message code="address.postCode.label" default="Post Code" />
		
	</label>
	<g:textField name="postCode" value="${addressInstance?.postCode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'country', 'error')} ">
	<label for="country">
		<g:message code="address.country.label" default="Country" />
		
	</label>
	<g:textField name="country" value="${addressInstance?.country}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'homeAddress', 'error')} ">
	<label for="homeAddress">
		<g:message code="address.homeAddress.label" default="Home Address" />
		
	</label>
	<g:checkBox name="homeAddress" value="${addressInstance?.homeAddress}" />
</div>

