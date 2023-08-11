<!DOCTYPE html>
<html>

<head>
    <title>Movie Form</title>
    <style>
        p {
            text-align: start;
        }

        h1 {
            text-align: start;
            margin-bottom: 0px;
            padding-left: 10px;
        }

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
        }

        .search-url {
            /* display:contents; */
            padding-left: 20px;
            display: grid;
        }
        .admin {
            position: absolute;
            right: 10px;
            top: 10px
        }
    </style>
</head>

<body>
    <div class="box-container">
        <h1>Search</h1>
        <div class="search-url">
            <li>
                <a href="/searchByIdForm">by Movie ID</a>
            </li>
            <li>
                <a href="/searchByNameForm">by Movie Name</a>

            </li>
            <li>
                <a href="/searchByCollectionForm">by Movie Collection</a>

            </li>
           
        </div>

        <a class="admin" href="/admin">admin</a>
    </div>


</body>

</html>