
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LA SESSION Avec GET</title>
</head>
<body>



	<form method="get" action="formulaireDeSessionAvecGET">
	<p>
	<label for="prenom">Votre prenom :</label>
	<input type="text" id="prenom" name="inputPrenom" />
	</p>
	
	<p>
	<label for="nom">Votre Nom :</label>
	<input type="text" id="nom" name="inputNom" />
	</p>
	
	<input type="submit" value="Connexion" /> <!-- Ajouter l'attibut value pour changer le nom du bouton -->
	<div style='float: right'><button onclick="${session.invalidate()}">Deconnexion</button></div>	<!-- Ajouter par moi pour supprimer les champs enregistrés -->

	<c:if test="${!empty keyPrenom  && !empty keyNom }">
		<p>
		<c:out value="Bonjour ${keyPrenom } ${keyNom }, et bienvenu dans cette session !" ></c:out>
		</p>
	</c:if>

	</form>

	
	
</body>
</html>