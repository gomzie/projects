var urlHolder = new Object();

$('#createUser').submit(function() {
	alert('Success! Record has been added.');
	event.preventDefault();
	createUser();
});

function createUser() {
	
	$.post('createUser', {
			userName: $('#userName').val(),
			password: $('#password').val(),
			email: $('#email').val(),
			firstName: $('#firstName').val(),
			lastName: $('#lastName').val(),
			middleName: $('#middleName').val(),
			organization: $('#organization').val(),
			jobTitle: $('#jobTitle').val(),
			country: $('#country').val(),
			phoneNumber: $('#phoneNumber').val(),
			role: $('#role').val()
		}, 
		function(response) {
			if (response != null) {
//				loadTable();
//				toggleForms('hide'); ;
//				toggleCrudButtons('show');
				alert('Success! Record has been added.');
			} else {
				alert('Failure! An error has occurred!');
			}
		}
	);	
}
