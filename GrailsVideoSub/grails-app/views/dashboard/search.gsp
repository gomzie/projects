<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/> 
		<meta name="layout" content="main" />
		<title>SAGE Search Results</title>
	￼￼</head>
	<body>
		<div class="nav">
			<span class="menuButton">
				<a class="home" href="${resource(dir:'')}">Home</a>
			</span>
		 </div>
		<div class="searchResults"> 
			<h1>Search Results</h1>
			<ul>
				<g:if test="${videos}">
					<g:each in="${videos}" var="video"> 
						<li><g:link controller="video" action="show" id="${video.id}">${video}</g:link> </li>
					￼</g:each>
				</g:if>
				<g:if test="${users}">
					<g:each in="${users}" var="user"> 
						<li><g:link controller="user" action="show" id="${user.id}">${user}</g:link> </li>
					￼</g:each>
				</g:if>
				<g:if test="${addresses}">
					<g:each in="${addresses}" var="address"> 
						<li><g:link controller="address" action="show" id="${address.id}">${address}</g:link> </li>
					￼</g:each>
				</g:if>
				
		   </ul> 
		</div>
  </body>
</html>	