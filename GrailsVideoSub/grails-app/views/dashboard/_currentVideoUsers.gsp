<h3>Current Video Users</h3>
<table>
	<thead> 
		<tr>
	      <th>User Name</th>
	      <th>Video</th>
	      <th>Start Time</th>
	      <th>End Time</th>
    	</tr>
  </thead>
	<g:each in="${currentVideoUsers}" var="currentVideoUser"> 
		<tr>
			<td><modalbox:createLink controller="dashboard" action="showDetail" id="${user?.id}" title="User Details" width="800">${currentVideoUser.user}</modalbox:createLink></td>
			<td>
				<iframe src="http://player.vimeo.com/video/${currentVideoUser.video.name}" width="200px" height="150px" frameborder="0" webkitAllowFullScreen mozallowfullscreen allowFullScreen></iframe>
				<p id="videoDesc"><a target='_blank' href='http://vimeo.com/${currentVideoUser.video.name}'>${currentVideoUser.video.description}</a> <br/>by <strong>${currentVideoUser.video.speaker}</strong>.</p>
				<br/>	
			</td>
			<td><g:formatDate date="${currentVideoUser.startTime}" type="datetime" style="MEDIUM" timeStyle="SHORT"/></td>
			<td><g:formatDate date="${currentVideoUser.startTime}" type="datetime" style="MEDIUM" timeStyle="SHORT"/></td>
						 
    	</tr>
  	</g:each>
</table>
