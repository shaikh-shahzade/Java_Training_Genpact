
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head> 
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/Assessment"  
     user="root"  password="12345"/>  
     
     
<sql:query dataSource="${db}" var="result">  
select * from trainer_info; 
</sql:query>  
     
     <c:forEach var="trainer" items="${result.rows}">  
 
<c:out value="${trainer.Trainer_Name}"/><br> 
  
</c:forEach>  
</body>
</html>