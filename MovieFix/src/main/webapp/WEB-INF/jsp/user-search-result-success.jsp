<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
<html>
<head>
    <title>Movie List</title>
    <style>
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
    <h2>Movie List</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Movie Name</th>
            <th>Total Collection</th>
            <!-- Add more columns as needed -->
        </tr>
       <c:forEach items="${movies}" var="optionalMovie">
    <c:choose>
        <c:when test="${optionalMovie.isPresent()}">
            <c:set var="movie" value="${optionalMovie.get()}" />
            <tr>
                <td>${movie.movieId}</td>
                <td>${movie.movieName}</td>
                <td>${movie.movieCollection}</td>
                <!-- Add more columns as needed -->
            </tr>
        </c:when>
        <c:otherwise>
            <!-- Handle case when movie is not found -->
        </c:otherwise>
    </c:choose>
</c:forEach>


    </table>
</body>
</html>
