<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="s" value="Hello World"/>  
  
<c:if test="${fn:contains(s, 'Hello')}">  
   <p>Yes! Found Hello<p>  
</c:if>  
String Length: <c:out value=" ${fn:length(s) }" />

<c:if test="${fn:endsWith(s, 'World')}">  
   <p>Yes ! String ends with World<p>  
</c:if>

Lower Case: ${fn:toLowerCase(s)}
<br>
Upper Case: ${fn:toUpperCase(s)}


<br>
SubString: ${fn:substring(s, 3, 10)} 
</body>
</html>