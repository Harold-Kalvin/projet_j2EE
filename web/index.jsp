
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP index Page</title>
    </head>
    <body>
        <h1>TP noté JEE</h1>
        <h2>BASA Harold et LEROY Damien</h2>
        <hr />
        <h3>Page de connexion</h3>
        <fieldset>
            <legend>Autenthification</legend>
             <form action="ConnexionServlet" method="post">
            <p>login : <input type="text" name="login" value="" size="10" /></p>
            
            <p>mdp : <input type="password" name="mdp" value="" size="10" /></p>
            
            <p> <input type="submit" value="Valider" name="ok" /></p>
        </form>
        </fieldset>
       
    </body>
</html>
