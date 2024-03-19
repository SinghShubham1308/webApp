<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
body {
	font-family: Arial, sans-serif;
}

.login-box {
	width: 300px;
	margin: 100px auto;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 5px;
	background-color: #f9f9f9;
}

.login-box input[type="text"], .login-box input[type="password"] {
	width: calc(100% - 20px);
	padding: 8px;
	margin: 8px 0;
	border: 1px solid #ccc;
	border-radius: 3px;
}

.login-box input[type="submit"] {
	width: 100%;
	padding: 8px;
	margin: 8px 0;
	border: none;
	border-radius: 3px;
	background-color: #007bff;
	color: #fff;
	cursor: pointer;
}

.login-box input[type="submit"]:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
welcome to the login page ${name }
	<div class="login-box">
		<h2>Login</h2>
		<pre>${errorMessage }</pre>
		<form method="post">
			<input type="text" name="username" placeholder="Username" required><br>
			<input type="password" name="password" placeholder="Password"
				required><br> <input type="submit" value="Login">
		</form>
	</div>
</body>
</html>
