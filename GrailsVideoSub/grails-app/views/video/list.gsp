
<%@ page import="videosub.Video" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'video.label', default: 'Video')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
		<g:javascript library="jquery" />
		
	</head>
	<body>
		<a href="#list-video" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-video" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<div id="video">
				<table>
					<g:render template="videoList"/>
				</table>
			</div>	
			<div class="pagination"> 
				<g:paginate total="${videoTotal}" />
			</div>
		</div>
		<!-- script>
			var count = 1;
			$(window).scroll(function () {
			   if ($(window).scrollTop() >= $(document).height() - $(window).height() - 10) {
				
				$.ajax({
			    	 url:"${createLink(controller: 'video', action: 'ajaxList')}",
			    	 type:'GET',
			    	 data:'offset=8&max=8' ,
			    	 success:function (result) {
			    		 //alert('1'+result);
			    		 //alert('234 '+result);
			    		 //$("#videos").append(result);
			    		 //println result 
			    	 },
			    	 error:function (jqXHR, textStatus, errorThrown) {
			    		 alert('error ');
			    	 }
			    })
			     
			   }       
			     
			});
		 </script-->
	</body>
	
</html>
