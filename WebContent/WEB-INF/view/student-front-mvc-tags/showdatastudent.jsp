<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p>FirstName : ${student.fName}</p>
<p>LastName :  ${student.lName}</p>
<p>Age :  ${student.age}</p>
<p>Code :  ${student.code}</p>
<p>Code :  ${student.indexCountry}</p>
<p>email :  ${student.email}</p>
<p>Country : ${student.country}</p>
<p>language : ${student.language}</p>

<p>Players : 
	<c:forEach var="pl" items="${student.players}">
		${pl}
	</c:forEach>
</p>



</body>
</html>