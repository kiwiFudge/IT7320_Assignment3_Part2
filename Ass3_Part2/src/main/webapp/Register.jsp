<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">

<script type="text/javascript">
	function viewPassword() {
		var passwordInput = document.getElementById('pass');
		var passStatus = document.getElementById('fa-img');
		
		if (passwordInput.type == 'password') {
			passwordInput.type='text';
			passStatus.className='fa fa-eye-slash';
		} else {
			passwordInput.type='password';
			passStatus.className='fa fa-eye';
		}
	}
</script>
</head>
<body>
	<div class="formTemplate">
		<form action="Login.jsp" method="post" name="reg-form">
			<h1>&emsp; Register &emsp;</h1>
			
			<p class="para">Username: <br><input type="text" name="username" 
			required="required"/></p>
			
			<p class="para">Email: <br><input type="email" name="email" 
			required="required" id="email1"/></p>
			<p class="para">Re-enter Email: <br><input type="email" name="email2" 
			required="required" id="email2"/></p>
			
			<p class="para">Password: <br><input type="password" name="password" 
			required="required" id="pass"/>
			<i id="fa-img" class="fa fa-eye" aria-hidden="true" onClick="viewPassword()"></i>
			</p>
			<div id="validate-pass"></div>
			
			<input type="submit" value=" Register "/>
			<input type="reset" value=" Reset "/>
			<p>Have have an account? <a href="Login.jsp">Login</a> here</p>
		</form>
	</div>
</body>
</html>