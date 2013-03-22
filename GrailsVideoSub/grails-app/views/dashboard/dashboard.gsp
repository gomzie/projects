<html>
  <head>
    <title>Dashboard</title>
	<meta name="layout" content="main" />
	<g:javascript library="jquery" />
	
	</head>
	<body>
		<g:if test="${currentVideoUsers}">
			<div class="nav" role="navigation">
				<ul>
					<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
					<li><g:link class="list" controller="video" action="list">Video</g:link></li>
					<li><g:link class="list" controller="user" action="list">Users</g:link></li>
					<li><g:link class="create" controller="user" action="create">New User</g:link></li>
				</ul>
			</div>
		</g:if>
		<div id="user" style='margin:10px 10px 10px 10px'> 
			<g:render template="admin" model="${['admin':admin]}" />
		</div>
		<g:if test="${currentVideoUsers}">
			<div id="currentVideoUsers" style='margin:10px 10px 10px 10px'>
				<g:render template="currentVideoUsers" model="${['currentVideoUsers':currentVideoUsers]}" /> 
			</div>
		</g:if>	
		<g:if test="${currentVideos}">
			<div id="currentVideos" style='margin:10px 10px 10px 10px'>
				<g:render template="currentVideos" model="${['currentVideos':currentVideos]}" /> 
			</div>
		</g:if>
		<g:if test="${pastVideos}">
			<div id="pastVideos" style='margin:10px 10px 10px 10px'>
				<g:render template="pastVideos" model="${['pastVideos':pastVideos]}" /> 
			</div>
		</g:if>
		<div id="userDetails"> </div>
	</body>
</html>