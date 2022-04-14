
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>envoiDeFichier</title>
</head>
<body>

	<!--  Formulaire avec un attribut de balise en + enctype -->

	<form method="post" 
		  action="envoiDeFichier" 
		  enctype="multipart/form-data">

		<p>
			<label for="description">Description du fichier : </label> 
			<input type="text" id="description" name="inputDescription" />
		</p>
		<p>
			<label for="fichier">Fichier a envoyer : </label> 
			<input type="file" id="fichier" name="inputFichier" />
		</p>

		<input type="submit" />

	</form>

	<!-- Vérification du succès du téléchargement: -->
	<c:if test="${ !empty inputFichier }">
		<p>
			<c:out value="Le fichier ${ inputFichier } (${ inputDescription }) a ete uploade !" />
		</p>
	</c:if>

</body>
</html>