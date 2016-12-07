<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

    <body>
        <form method="GET">
            Yläraja: <input type="text" name="yla"/>
            <input type="submit"/>
        </form> 
  
        <h4>Parametrien välitys - numerot 1 - YLÄRAJA tulostetaan</h4>

        <c:catch var ="error">  
            <c:if test="${not empty param.yla && param.yla > 0}">
                <c:forEach var="i" begin="1" end="${param.yla}" step="1">
                    <b>${i}</b>  
                </c:forEach>
            </c:if>
        </c:catch>

        <c:if test = "${not empty error}">
           <p style="background-color:red; font-style: italic; border: 5px solid green;">Exception: ${error} <br />
           Message: ${error.message}</p>
        </c:if> 
    
    </body>
</html>
