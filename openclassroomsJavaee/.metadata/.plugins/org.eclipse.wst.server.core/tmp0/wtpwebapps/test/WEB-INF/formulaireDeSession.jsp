
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LA SESSION</title>
</head>
<body>



	<form method="post" action="formulaireDeSession">
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

	<c:if test="${!empty sessionScope.keyPrenom && !empty sessionScope.keyNom }">
		<p>
		Bonjour ${sessionScope.keyPrenom } ${sessionScope.keyNom }, et bienvenu dans cette session !
		</p>
	</c:if>

	</form>

	
	
</body>
</html>