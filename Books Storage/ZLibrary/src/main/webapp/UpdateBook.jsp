<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
<link rel="stylesheet" href="update.css">
</head>
<body>


    <fieldset><legend>Update a Book</legend>
	<form action="Update.jsp" method="post">
       
        <input type="text" name="id" placeholder="Book Id"><br><br>
        
        <input type="text" name="price" placeholder="New Price"><br><br>
        
        <input class="sumbit" type="submit" value="Update">
       
    </form>
</fieldset>
    <a class="logout" href="Home.jsp">Home</a>
</body>
</html>