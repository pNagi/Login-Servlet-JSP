<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
	<div>
		<h2>Register</h2>
		<p>${error}</p>
		<form method="post" action="/app/create">
			<label for="username">Username</label>
			<input type="text" name="username" size="20" />
				<label for="username">Password</label>
			<input type="password" name="password" size="20"/>
			<input type="submit"
				value="submit"/>
		</form>
		<a href="/app/">Back to login page</a>
	</div>
</body>
</html>