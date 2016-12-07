<%-- 
    Document   : PrintMySQLOhjKieliDb_1
    Author     : Juha Peltomäki
Kyselyt oppilas-tietokantaa sekä Event-tietokantaa
Kyselyt toteutetaan erillisessä Java-luokassa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*, h2db.H2MemDb"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>MySQL kysely</h1>
        <%
        out.write("<h3>sorted by ID</h3>");
	try {
            H2MemDb dbObj = new H2MemDb();
            //dbObj.connectDb();  //
            ResultSet rs = dbObj.Query("select id, nimi, versio, suunnittelija, julkaistu from ohjkieli order by id");
            //dbObj.printOppilaat(rs, out);
            
            rs.beforeFirst();
            out.write(dbObj.getResultSet(rs));

            
            out.write("<h3>sorted by ID</h3>");
            
            rs = dbObj.Query("select id, nimi, versio, suunnittelija, julkaistu from ohjkieli order by julkaistu");
            //dbObj.printOppilaat(rs, out);
            rs.beforeFirst();
            out.write(dbObj.getResultSet(rs));
			
            dbObj.disconnectDb();
            
	} catch (SQLException sqle) {
	    while (sqle != null) {
		System.out.println(sqle.toString());
		sqle = sqle.getNextException();
	    }
	}
	catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}
	catch (Exception e) {
	    e.printStackTrace();
	}

        %>
    </body>
</html>
