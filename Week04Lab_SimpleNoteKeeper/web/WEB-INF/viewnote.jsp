<%-- 
    Document   : viewnote
    Created on : Oct 4, 2020, 11:39:04 PM
    Author     : 829468
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
        Title: ${note.title}<br><br>
        Contents: <br>${note.contents}<br><br>
        
        <a href="note?edit">Edit</a>
    </body>
</html>
