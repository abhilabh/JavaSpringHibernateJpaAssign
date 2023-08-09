<!DOCTYPE html>
<html>
<head>
    <title>Admin Movie Form</title>
</head>
<body>
    <h2>Enter new movie details</h2>
   <form action="addMovie" method="post">
    <label for="movieId">Movie ID:</label>
        <input type="text" id="movieId" name="movieId" value="" /><br>
        <label for="movieName">Movie Name:</label>
        <input type="text" id="movieName" name="movieName" value="" /><br>
        
        <label for="movieCollection">Collection:</label>
        <input type="text" id="movieCollection" name="movieCollection" value="" /><br>
        
        <!-- Add more fields as needed -->
        
        <input type="submit" value="Submit" />
    </form> 
</body>
</html>
