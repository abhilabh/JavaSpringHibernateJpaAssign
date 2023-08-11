<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Movie List</title>
    <style>
        body {
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: flex-start;
            min-height: 150vh;
        }
        .box-container {
            width: 70%;
            margin: 20px;
            background-color: #C1E1C1;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
            text-align: center;
            position: absolute;
            /* top: 50%;
            left: 50%; */
        }
        .home-link {
            position: absolute;
            right: 10px;
            top: 10px;
        }
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <div class="box-container">
        <h2>Movie List</h2>
        <table>
            <tr>
                <th>ID</th>
                <th>Movie Name</th>
                <th>Total Collection</th>
                <!-- Add more columns as needed -->
            </tr>
            <c:forEach items="${movies}" var="movie">
                <tr>
                    <td>${movie.movieId}</td>
                    <td>${movie.movieName}</td>
                    <td>${movie.movieCollection}</td>
                    <!-- Add more columns as needed -->
                </tr>
            </c:forEach>
        </table>
        <a class="home-link" href="/">Home</a>
    </div>
</body>
</html>
