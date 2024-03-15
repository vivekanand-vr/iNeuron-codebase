<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <c:if test="Blogposts==null">
   No post available.</c:if>
 <center>
	<table border="1">
		<tr>
			<th>Title</th>
			<th>Description</th>
			<th>Content</th>
		</tr>
		<c:forEach items="${Blogposts}" var="blogPost">
			<tr>
				<td>${blogPost.title}</td>
				<td>${blogPost.description}</td>
				<td>${blogPost.content}</td>
			</tr>

		</c:forEach>

	</table>
	</center>
</body>
</html>