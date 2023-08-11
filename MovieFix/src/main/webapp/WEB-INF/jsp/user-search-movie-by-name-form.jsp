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
        }

        .internal {
            margin: 20px;
        }
    </style>
</head>

<body>
    <div class="box-container">
        <div class="internal">

            <h2>Search by Movie Name</h2>
            <form action="/searchByName" method="post">
                <!-- Search form inputs here -->
                <input type="text" name="movieName" placeholder="Search...">
                <button type="submit">Search</button>
            </form>
            <a class="home-link" href="/">home</a>
        </div>

    </div>
</body>

</html>