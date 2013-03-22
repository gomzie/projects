<g:each in="${videos}" status="i" var="video">
	<g:if test="${i%4==0}">
		<tr>
		<td>
			<g:img uri="${videosThumbs.get(video.name)[0]}"/>
			<p id="videoDesc"><strong>${videosTitles.get(video.name)[0]}</strong> - (${videosDuration.get(video.name)[0]} minutes).</p>
		</td>
	</g:if>
	<g:if test="${i%4==1}">
		<td>
			<g:img uri="${videosThumbs.get(video.name)[0]}"/>
			<p id="videoDesc"><strong>${videosTitles.get(video.name)[0]}</strong> - (${videosDuration.get(video.name)[0]} minutes).</p>
		</td>
	</g:if>
	<g:if test="${i%4==2}">
		<td>
			<g:img uri="${videosThumbs.get(video.name)[0]}"/>
			<p id="videoDesc"><strong>${videosTitles.get(video.name)[0]}</strong> - (${videosDuration.get(video.name)[0]} minutes).</p>
		</td>
	</g:if>
	<g:if test="${i%4==3}">
		<td>
			<g:img uri="${videosThumbs.get(video.name)[0]}"/>
			<p id="videoDesc"><strong>${videosTitles.get(video.name)[0]}</strong> - (${videosDuration.get(video.name)[0]} minutes).</p>
		</td>
		</tr>
	</g:if>
</g:each>
<ul class="videos" id="videos">
</ul>