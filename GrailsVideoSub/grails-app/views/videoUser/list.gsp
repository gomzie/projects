
<%@ page import="videosub.VideoUser" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'videoUser.label', default: 'VideoUser')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-videoUser" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-videoUser" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<th><g:message code="videoUser.user.label" default="User" /></th>
					
						<th><g:message code="videoUser.video.label" default="Video" /></th>
					
						<g:sortableColumn property="startTime" title="${message(code: 'videoUser.startTime.label', default: 'Start Time')}" />
					
						<g:sortableColumn property="endTime" title="${message(code: 'videoUser.endTime.label', default: 'End Time')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${videoUserInstanceList}" status="i" var="videoUserInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${videoUserInstance.id}">${fieldValue(bean: videoUserInstance, field: "user")}</g:link></td>
					
						<td>${fieldValue(bean: videoUserInstance, field: "video")}</td>
					
						<td><g:formatDate date="${videoUserInstance.startTime}" /></td>
					
						<td><g:formatDate date="${videoUserInstance.endTime}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${videoUserInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
