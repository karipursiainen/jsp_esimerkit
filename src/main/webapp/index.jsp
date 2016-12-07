<%-- 
    Document   : index
    Author     : Juha Peltomäki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP TESTIsivu</title>
    </head>
    <body>
        <h1>Esimerkit Java Web-ohjelmoinnista</h1>

        <p>Projektissa pitää käynnistää H2-tietokanta ja ladata sinne SQL-tiedosto: luo_h2_oppilas.sql. 

        <a href="minunServletti">servlet I</a><br>
        <a href="servletTesti">servlet II</a><br>
        <a href="1jsp-perus/">JSP 1</a><br>
        <a href="2jsp2/">JSP 2 ja JSTL</a><br>
        <a href="3jsp2-db/">JSP 2 ja H2 database -esimerkkejä</a><br>

        <div>Lisää esimerkkejä ajamalla JSP-tiedostoa suoraan projektissa</div>
        
        <div>
        <% String str = "Testataan JSP-sivua ihan omasta Java-koodista";
        out.write(str);        
        %>
        </div>
    </body>
</html>
