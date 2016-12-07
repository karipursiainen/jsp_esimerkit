<%-- 
    Document   : PrintMySQLOhjKieliDb_2
    Author     : Juha Peltomäki
Kyselyt oppilas-tietokantaa sekä Event-tietokantaa
Kyselyt toteutetaan erillisessä Java-luokassa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
    
    <sql:setDataSource dataSource="jdbc/h2ds" />
	<sql:query var="rs">
		select * from ohjkieli
    </sql:query>
    
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    	<h1>DB results</h1>
    	<u1>
        	<c:forEach var="lang" items="${rs.rows }">
        		<li> ${lang.nimi }, ${lang.versio }</li>
        	</c:forEach>
        </u1>
    </body>
</html>
