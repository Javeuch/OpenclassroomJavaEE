<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Les Cookies</title>
</head>
<body>

<c:out value="${ prenom }" />

	<form method="post" action="lesCookies">
		<p>
		<label for="prenom">Prénom : </label> 
		<input type="text" id="prenom" name="prenom">
		</p>
		<p>
		<label for="nom">nom : </label> 
		<input type="text" id="om" name="nom"> <br />
		</p>
		<input type="submit" />

	</form>

</body>
</html>