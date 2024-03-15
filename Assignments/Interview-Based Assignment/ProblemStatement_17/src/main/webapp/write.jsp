<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Create Blog Post</h1>
    <form action="./blog" method="post">
        <label for="title">Title:</label>
        <input type="text" name="title" id="title" required><br>

        <label for="description">Description:</label>
        <input type="text" name="description" id="description" required><br>

        <label for="content">Content:</label><br>
        <textarea name="content" id="content" rows="5" required></textarea><br>

        <input type="submit" value="Create">
    </form>
</body>
</html>