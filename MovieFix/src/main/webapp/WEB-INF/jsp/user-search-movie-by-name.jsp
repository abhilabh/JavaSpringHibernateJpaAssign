<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Movie Search</title>
</head>
<body>
    <h2>Search by Movie Name</h2>
    <form action="/searchByName" method="post">
        <!-- Search form inputs here -->
        <input type="text" name="movieName" placeholder="Search...">
        <button type="submit">Search</button>
    </form>
    <!-- Display search results here -->
    <a href="/">home</a>
</body>
</html>
