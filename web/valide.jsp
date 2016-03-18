<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulaire validé</title>
    </head>
    <body>
        <h1>Merci de nous avoir noté !</h1>
        Récapitulatif : 
        <table border=1 cellapdding=4 cellespacing=4>
            <tr><th>maths</th><th>physique</th><th>chimie</th></tr>
            <tr>
                <%
                    HttpSession ses = request.getSession();
                    out.print("<td>" + ses.getAttribute("maths").toString() + "</td><td>" + ses.getAttribute("physique").toString() + "</td><td>" + ses.getAttribute("chimie").toString() + "</td>");
                %>
            </tr>
        </table>
    </body>
</html>
