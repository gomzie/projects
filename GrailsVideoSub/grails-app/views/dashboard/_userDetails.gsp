<div class="dialog"> 
	<table>
		<tr class="prop">
			<td valign="top" class="name"><strong>Name:</strong></td> 
			<td valign="top" class="value">
				${user} 
			</td>
			<td valign="top" class="name"><strong>Email:</strong></td> 
			<td valign="top" class="value">
				${user.email} 
			</td>
		</tr>
		<tr class="prop">
			<td valign="top" class="name"><strong>Organization:</strong></td> 
			<td valign="top" class="value">
				${user.organization}
			</td> 
			<td valign="top" class="name"><strong>Job Title:</strong></td> 
			<td valign="top" class="value">
				${user.jobTitle}
			</td> 
		</tr>
		<tr class="prop">
			<td valign="top" class="name"><strong>Phone Number:</strong></td> 
			<td valign="top" class="value">
				${user.phoneNumber}
			</td> 
			<td valign="top" class="name"><strong>Country:</strong></td> 
			<td valign="top" class="value">
				${user.country}
			</td> 
		</tr>
		<tr>
		<td valign="top" class="name"><strong>Address:</strong></td> 
		<td valign="top" class="value" colspan="3">
			<g:each in="${user.addresses}" var="a">
				<span class="property-value" aria-labelledby="addresses-label">
					${a}<br/>
				</span>
			</g:each>
		</td> 
		
		</tr>
		
	</table>
</div>