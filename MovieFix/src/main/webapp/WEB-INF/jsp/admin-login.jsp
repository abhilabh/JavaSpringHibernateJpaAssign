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
            align-items: center;
        }

        .box-container {
            width: 500px;
            height: 500px;
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

        input[type=text],
        select {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type=submit] {
            width: 100%;
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
    </style>
</head>

<body>
    <div class="box-container">
        <div class="internal">

            <h2>Enter Credential</h2>
            <form method="post" action="verifyLogin">
                <label>Enter ID:</label>
                <input type="text" name="id"><br>
                <label>Enter password:</label>
                <input type="text" name="password"><br>
                <input type="submit">
            </form>
            <a class="home-link" href="/">home</a>
        </div>

    </div>
</body>

</html>