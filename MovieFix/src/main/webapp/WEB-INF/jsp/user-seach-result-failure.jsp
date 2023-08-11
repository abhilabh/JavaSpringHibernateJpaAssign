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
            background-color: #ff4642;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
            text-align: start;
            position: relative;
            margin: 20px;
        }

        .home-link {
            display: flex;
            justify-content: center;
        }

        .internal {
            margin: 20px;
            display: grid;
            justify-content: center;
        }
    </style>
</head>

<body>
    <div class="box-container">
        <div class="internal">

            <h1>Sorry No result found for the search</h1>
            <a class="home-link" href="/">Back</a>
        </div>

    </div>
</body>

</html>