<%@ page import="videosub.VideoUser" %>



<div class="fieldcontain ${hasErrors(bean: videoUserInstance, field: 'user', 'error')} required">
	<label for="user">
		<g:message code="videoUser.user.label" default="User" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="user" name="user.id" from="${videosub.User.list()}" optionKey="id" required="" value="${videoUserInstance?.user?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: videoUserInstance, field: 'video', 'error')} required">
	<label for="video">
		<g:message code="videoUser.video.label" default="Video" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="video" name="video.id" from="${videosub.Video.list()}" optionKey="id" required="" value="${videoUserInstance?.video?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: videoUserInstance, field: 'startTime', 'error')} required">
	<label for="startTime">
		<g:message code="videoUser.startTime.label" default="Start Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="startTime" precision="day"  value="${videoUserInstance?.startTime}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: videoUserInstance, field: 'endTime', 'error')} required">
	<label for="endTime">
		<g:message code="videoUser.endTime.label" default="End Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="endTime" precision="day"  value="${videoUserInstance?.endTime}"  />
</div>

