<h3>Previously Subscribed Videos</h3>
<table>
	<thead> 
		<tr>
	      <th>User Name</th>
	      <th>Video</th>
	      <th>Start Time</th>
	      <th>End Time</th>
    	</tr>
  </thead>
	<g:each in="${pastVideos}" var="pastVideo"> 
		<tr>
			<td><modalbox:createLink controller="dashboard" action="showDetail" id="${user?.id}" title="User Details" width="800">${user}</modalbox:createLink></td>
			<td class="video">
				<g:img uri="${videosThumbs.get(pastVideo.video.name)[0]}"/>
				<p id="videoDesc"><strong>${videosTitles.get(pastVideo.video.name)[0]}</strong> - (${videosDuration.get(pastVideo.video.name)[0]} minutes).</p>
				<br/>	
			</td>
			<td>
				<g:formatDate date="${pastVideo.startTime}" type="datetime" style="MEDIUM" timeStyle="SHORT"/>
			</td>
			<td>
				<g:formatDate date="${pastVideo.endTime}" type="datetime" style="MEDIUM" timeStyle="SHORT"/>
			</td>
    	</tr>
  	</g:each>
</table>
