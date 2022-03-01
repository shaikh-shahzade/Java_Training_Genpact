<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>  
<body>
<c:set var="i" value="100" scope="application" />
<c:out value="${'Welcome to My Demo JSTL Page'  } +${i}"/>

<c:if test="${i > 10}">  
   <p>Value is: <c:out value="${i}"/><p>  
</c:if>  

<c:choose>  
    <c:when test="${i <10}">  
       value less than  10 .  
    </c:when>  
    <c:when test="${i > 10}">  
        value less than  10 .  
    </c:when>  
    <c:otherwise>  
       value is 10
         
    </c:otherwise>  
</c:choose>  

<br>

<c:forEach var="j" begin="1" end="3">  
   Iteration Value:  <c:out value="${j}"/><p>  
</c:forEach>  


<br>
<c:remove var="i" />
<br>
<c:out value="${'Welcome to My Demo JSTL Page'  } +${i}"/>


</body>
</html>