<%-- 
    Document   : editnote
    Created on : 4-Oct-2020, 8:23:57 PM
    Author     : cocog
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2><br>
        
        <form method="post" action="note">
            Title:<input type="text" name="titleBox" value="${note.title}"><br>
            Content:<textarea name="contentBox" rows="4" cols="50" value="${note.contents}"></textarea><br>
            <input type="submit" value="Save">
        </form><br>
    </body>
</html>
