<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Page</title>
<link rel="stylesheet" href="delete.css" />
</head>
<body>


    <fieldset><legend>Delete a Book</legend>
	<form action="Delete.jsp" method="post">
       
        <label for="">Book Id</label>
        <input type="text" name="id" placeholder="Book Id"><br><br>
        
        <input class="sumbit" type="submit" value="Delete">
       
    </form>
</fieldset>
    <a class="logout" href="Home.jsp">Home</a>

</body>
</html>