<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

    <body>

        <h4>Exception happens!</h4>

		<c:catch var ="catchException">
		   <% int x = 5/0;%>
		</c:catch>

		<c:if test = "${catchException != null}">
		   <p style="background-color:red; font-style: italic; border: 5px solid green">
		   The exception is : ${catchException} <br />
		   There is an exception: ${catchException.message}</p>
		</c:if>

	</body>
</html>