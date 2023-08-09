<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Movie Search</title>
</head>
<body>
    <h2>Search by Movie ID</h2>
    <form action="/searchById" method="post">
        <!-- Search form inputs here -->
        <input type="text" name="movieId" placeholder="Search...">
        <button type="submit">Search</button>
    </form>
    <!-- Display search results here -->
        <a href="/">home</a>
    
</body>
</html>
