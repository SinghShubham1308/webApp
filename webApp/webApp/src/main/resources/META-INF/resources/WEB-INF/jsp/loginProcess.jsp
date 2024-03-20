<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Todo App</title>
<style>
body {
	font-family: Arial, sans-serif;
	margin: 20px;
}

h1 {
	color: #007bff;
}

ul {
	list-style-type: none;
	padding: 0;
}

li {
	margin-bottom: 10px;
}

.todo-item {
	display: flex;
	align-items: center;
}

.todo-checkbox {
	margin-right: 10px;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Welcome to Todo App ${name}</h1>
		<div>
			<a href="list-todos">manage your list</a>
		</div>
	</div>
</body>
</html>