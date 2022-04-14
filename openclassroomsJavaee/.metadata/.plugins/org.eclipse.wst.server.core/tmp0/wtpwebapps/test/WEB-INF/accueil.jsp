<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Accueil</title>
</head>

<body>
    <%@ include file="menu.jsp" %>
    
    <!-- En code Java dans une JSP (mauvaise pratique -->
    <p>Bonjour
        <%
 String myName = (String) request.getAttribute("keyName");
 out.println(myName);
 %>
        et bienvenu sur l'Openclassroom Java EE<P>
        
         <!-- En cutilisant des EL (Expression Language) -->
         <p>Bonjour ${empty keyName ? 'Tout le monde' : keyName}</p>
         
         <p>Un OpenClassroom présenté par ${keyNoms[1]}<p> <!-- Attention on utilise le K pas le V -->
</body>

</html>