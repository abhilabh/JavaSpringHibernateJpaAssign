<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Movie Search</title>
    <style>
        body {
            background-color: antiquewhite;
            justify-content: center;
            display: flex;
            min-height: 200px;
        }

        .box-container {
            width: 70%;
            background-color: #C1E1C1;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
            text-align: start;
            position: relative;
            margin: 20px;
        }
        .home-link {
            position: absolute;
            right: 10px;
            top: 10px;
            color: white;
            text-decoration: none;
        }
        .internal {
            margin: 20px;
        }
    </style>
</head>
<body>
    <div class="box-container">
        <div class="internal">

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
            <a class="home-link" href="/">home</a>
        </div>

    </div>
</body>
</html>