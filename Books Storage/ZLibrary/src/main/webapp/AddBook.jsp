<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Adding Page</title>
<link rel="stylesheet" href="Add.css" />
</head>
<body>
    <fieldset>
        <legend>Add A Book</legend>
    <form action="Add.jsp">
      
       
        <input type="text" name="id" placeholder="Book Id" /> <br /><br />

        <input type="text" name="title" placeholder="Book Title" /> <br /><br />

        <input type="text" name="author" placeholder="Book Author" /> <br /><br />

        <input type="text" name="price" placeholder="Book Price" /> <br /><br />

        <input class="sumbit" type="submit" value="Click here to Add" />
    </form>
    </fieldset>

    <a class="logout" href="Home.jsp">Home</a>
	
</body>
</html>