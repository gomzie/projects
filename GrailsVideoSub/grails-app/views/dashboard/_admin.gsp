<div id="show-user" class="content scaffold-show" role="main">
	<h1>Welcome ${user}</h1>
	<ol class="property-list user">
		<li class="fieldcontain">
			<span id="email-label" class="property-label">
				<g:message code="user.email.label" default="Email" />
			</span>
			<span class="property-value" aria-labelledby="email-label">
				${user.email}
			</span>
			
		</li>	
		<li class="fieldcontain">
			<span id="firstName-label" class="property-label">
				<g:message code="user.name.label" default="Name" />
			</span>
			<span class="property-value" aria-labelledby="firstName-label">
				${user}
			</span>
			
		</li>		
	</ol>
</div>