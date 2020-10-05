<%-- 
    Document   : viewnote
    Created on : 4-Oct-2020, 8:23:48 PM
    Author     : cocog
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        
        <b>Title:</b>${note.title}<br><br>
        <b>Contents:</b>${note.contents}<br><br>
        <a href="note?edit">Edit</a>
    </body>
</html>
