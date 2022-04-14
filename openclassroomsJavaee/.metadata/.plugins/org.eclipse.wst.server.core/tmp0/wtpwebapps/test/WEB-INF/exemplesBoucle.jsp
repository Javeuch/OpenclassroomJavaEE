<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exemplesBoucle</title>
</head>
<body>
	<c:out value="Mes bouclettes !"></c:out>
<br />	
----------------------------------------------------------------------

	<!-- Une boucle qui s'exécute un certain nombre de fois en JSTL : -->
	<c:forEach var="i" begin="0" end="10" step="2">
		<p>
			Un message n°
			<c:out value="${ i }" />
			!
		</p>
	</c:forEach>
	
----------------------------------------------------------------------
	<!-- Une boucle sur un array (tableau) : -->
	<c:forEach items="${ keyTitres }" var="titre" varStatus="status">
		<p>
			N°
			<c:out value="${ status.count }" />
			:
			<c:out value="${ titre }" />
			!
		</p>
	</c:forEach>
	
----------------------------------------------------------------------

	<!-- Une boucle qui travaille sur une chaîne de caractères découpée : -->
	<c:forTokens var="morceau"
		items="Un élément/Encore un autre élément/Un dernier pour la route"
		delims="/ ">
		<p>${ morceau }</p>
	</c:forTokens>

</body>
</html>