<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Movie Search</title>
</head>
<body>
    <h2>Search by Movie Collection</h2>
    <form action="/searchByCollection" method="post">
        <!-- Search form inputs here -->
        <label for="collectionFrom">From:</label>
        <input type="text" name="collectionFrom" placeholder="Search...">
        <label for="collectionTo">To:</label>
        <input type="text" name="collectionTo" placeholder="Search...">
        <button type="submit">Search</button>
    </form>
    <!-- Display search results here -->
    <a href="/">home</a>
</body>
</html>
