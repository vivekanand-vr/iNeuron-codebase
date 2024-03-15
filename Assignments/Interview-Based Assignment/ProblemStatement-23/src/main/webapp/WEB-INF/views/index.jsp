<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome page </title>
</head>
<body>
 


  <center>
     <form:form method="get" action="./authenticate">
      <table border="1">
      <tr><th>User name</th><td><input type="text" name="username"></td></tr>
      <tr><th>password</th><td><input type="text" name="password"></td></tr>
      <tr><th></th><td><input type="submit" value="login"></td></tr>
      
      </table>
      
     
     
     </form:form>
     <a href="./registerPage">new User</a>
  
  
  
  </center>
</body>
</html>