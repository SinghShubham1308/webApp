<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="container">
		<h1>Add your Todo</h1>
		<form action="post">
			<input type="text" id="description" name="description"
				placeholder="Enter the description"><br> <input type="date"
				id="targetdate" name="targetdate"> <br><input type="radio"
				id="done" name="isDone" value="IsDone"> <label for="done">IsDone</label><br>
			<input type="submit" class="btn btn-success">
		</form>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>