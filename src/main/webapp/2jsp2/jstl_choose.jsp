<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>    


<%-- Esimerkki: 
1. c:choose/when -rakenne
2. param.xyz testi
3. c:redirect - suuntaaminen uuteen URL-osoitteeseen
--%>

<html>
    <body>
        <form method="GET">
            <select name="kieli">
                <option>Java</option> <option>PHP</option>   <option>Muu</option>
            </select>
            <input type="submit"/>
        </form> 

        <h1> Esimerkki: if/else rakenne </h1>
        <p>
            <c:if test="${not empty param.kieli}" > <%-- testetaan, ettei parametri kieli ole tyhjä --%>
                <c:choose>
                    <c:when test="${param.kieli == 'Java'}">
                        Java-kieli 
                        <c:redirect url="http://www.oracle.com/technetwork/java/index.html" />            
                    </c:when>
                    <c:when test="${param.kieli == 'PHP'}">
                        PHP-kieli 
                        <c:redirect url="http://www.php.net" />
                    </c:when>
                    <c:otherwise>
                        Joku muu
                        <c:redirect url="http://www.perl.com" />
            
                    </c:otherwise>
                </c:choose>
            </c:if>
        </p>    
    </body>
</html>
