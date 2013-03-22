<h3>Available Videos</h3>
<table>
	<thead> 
		<tr>
	      <th>User Name</th>
	      <th>Video</th>
	      <th>Start Time</th>
	      <th>End Time</th>
    	</tr>
  </thead>
	<g:each in="${currentVideos}" var="currentVideo"> 
		<tr>
			<td><modalbox:createLink controller="dashboard" action="showDetail" id="${user?.id}" title="User Details" width="800">${user}</modalbox:createLink></td>
			<td class="video">
				<iframe src="http://player.vimeo.com/video/${currentVideo.video.name}" width="200px" height="150px" frameborder="0" webkitAllowFullScreen mozallowfullscreen allowFullScreen></iframe>
				<p id="videoDesc"><a target='_blank' href='http://vimeo.com/${currentVideo.video.name}'><strong>${videosTitles.get(currentVideo.video.name)[0]}</strong></a> - (${videosDuration.get(currentVideo.video.name)[0]} minutes).</p>
				<br/>	
			</td>
			<td><g:formatDate date="${currentVideo.startTime}" type="datetime" style="MEDIUM" timeStyle="SHORT"/></td>
			<td><g:formatDate date="${currentVideo.startTime}" type="datetime" style="MEDIUM" timeStyle="SHORT"/></td>
						 
    	</tr>
  	</g:each>
</table>
