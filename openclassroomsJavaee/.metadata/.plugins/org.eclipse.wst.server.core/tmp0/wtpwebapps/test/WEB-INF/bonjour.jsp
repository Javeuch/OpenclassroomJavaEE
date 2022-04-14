<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bonjour</title>
</head>
<body>
	<%@ include file="menu.jsp"%>
	
	<!-- utlisisation de la JSTL -->
	<p><c:out value="Bonjour et bienvenu dans le chapitre d'utilisation de la JSTL !" /></p>
	
	<p>
		Bonjour à vous !
		<!-- en dur ! -->
	<p>
	<p>
		<%
			String salutationSelonHeure = (String) request.getAttribute("keyHeure");
			if (salutationSelonHeure.equals("jour")) {
				out.println("Bonjour et oui c'est le matin !");
			} else {
				out.println("Veuillez m'excuser, plutôt bonsoir, il fait déjà nuit");
			}
		%>
	
	<p>
		<%
			String messageRecuDeLaServlet = (String) request.getAttribute("key");
			out.println(messageRecuDeLaServlet);
		%>
	</p>
	<p>
		<%
			for (int i = 1; i <= 3; i++) {
				int compteur = i;
				out.println("Je crée la ligne " + compteur + " de ma boucle dans ma JSP !</br >");
			}
		%>
	</p>
	<p>
	Les informations contenues dans le Java bean Auteur récupérées avec des EL:<br />
	Le nom de l'auteur est : ${keyAuteur.nom}<br />
	Le prénom de l'auteur est : ${keyAuteur.prenom}<br />
	Le statut de l'auteur est : ${keyAuteur.actif ? 'Très actif en ce moment !' : 'Pour le moment, il ne publie plus...' }
	<p>

</body>
</html>