<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>testConditionnel</title>
</head>
<body>

	<!-- Un test en JSTL : -->
	<c:if test="${ 50 > 10 }" var="variable">
    C'est vrai !
    </c:if>
    
    <!-- Un test multiple en JSTL : -->
		<c:set var="salaire" scope = "page" value="${2*1000}" />
		<p>
			Votre salaire est de :
			<c:out value="${salaire}" />
			euros.
		</p>

		<c:choose>

			<c:when test="${salaire <= 1000}">
            Vous avez un salaire minable...
         	</c:when>

			<c:when test="${salaire <= 2000}">
            Vous avez un salaire moyen.
         	</c:when>

			<c:when test="${salaire <= 4000}">
            Vous avez un bon salaire !
         	</c:when>

			<c:otherwise>
            Vous faites partie de la mafia ?
         	</c:otherwise>

		</c:choose>
		
</body>
</html>

