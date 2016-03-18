<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Vote Chimie</title>
    </head>
    <body>
        <h1>Chimie</h1>
        <hr/>
        <fieldset><legend>Donner une note sur 5</legend>
            <form action="NoteFormServlet">
                <select name="chimie">
                    <option>5</option>
                    <option>4</option>
                    <option>3</option>
                    <option>2</option>
                    <option>1</option>
                </select>
                <input type="submit" value="Suite" name="suite" /> 
            </form>
        </fieldset>
    </body>
</html>
