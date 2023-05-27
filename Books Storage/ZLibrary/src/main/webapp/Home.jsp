<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" href="homepage.css">
</head>
<body>

	
	<h1>Z Library</h1>

	<section class="home" id="home">
		<div class="crud1">
			<a href="AddBook.jsp" style="position: absolute; top: 7rem; left: 50px;">Add Book</a>
			<a href="DeleteBook.jsp" style="position: absolute; top: 7rem; right: 50px;">Delete Book</a>
		</div>
		<div class="crud2">
			<a href="UpdateBook.jsp" style="position: absolute; top: 35rem; left: 50px;">Update Price</a>
			<a href="View.jsp"  style="position: absolute; top: 35rem; right: 50px;">View Book List</a>
		</div>
		</div>
	</section>
		

	<a href="FIrst.html" class="logout"  style="position: absolute; top: 50%; left: 50%;">Logout</a>

</body>
</html>