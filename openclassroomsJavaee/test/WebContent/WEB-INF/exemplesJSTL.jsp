
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ExemplesJSTL</title>
</head>
<body>

<!-- On affiche du texte -->
<p>
<c:out value="<p>Codons propre, utilisons la Java server page Standard Tag Library (jSTL)<p>"></c:out>
</p>

<!--On peut directement y définir une variable, avec son champ d'application :-->
<c:set var="pseudo" value="Javeuch" scope="page" />

<!--  On affiche la valeur de la variable -->
<p>
<c:out value="${ pseudo }">Valeur par défaut</c:out>
</p>

<!--  On peut supprimer la variable :-->
<c:remove var="pseudo" scope="page" />

<!-- On peut travailler aussi avec des Java Beans. Ici, on modifie la propriété d'un Bean puis on l'affiche : -->
<c:set target="${ keyAuteur }" property="prenom" value="Maxime" />
<p><c:out value="${ keyAuteur.prenom }" /></p>

</body>
</html>