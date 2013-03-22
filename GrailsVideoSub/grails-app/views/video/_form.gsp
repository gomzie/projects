<%@ page import="videosub.Video" %>



<div class="fieldcontain ${hasErrors(bean: videoInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="video.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${videoInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: videoInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="video.description.label" default="Description" />
		
	</label>
	<g:textArea name="description" cols="40" rows="5" maxlength="5000" value="${videoInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: videoInstance, field: 'subject', 'error')} ">
	<label for="subject">
		<g:message code="video.subject.label" default="Subject" />
		
	</label>
	<g:textField name="subject" value="${videoInstance?.subject}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: videoInstance, field: 'path', 'error')} ">
	<label for="path">
		<g:message code="video.path.label" default="Path" />
		
	</label>
	<g:field type="url" name="path" value="${videoInstance?.path}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: videoInstance, field: 'speaker', 'error')} required">
	<label for="speaker">
		<g:message code="video.speaker.label" default="Speaker" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="speaker" name="speaker.id" from="${videosub.User.list()}" optionKey="id" required="" value="${videoInstance?.speaker?.id}" class="many-to-one"/>
</div>

