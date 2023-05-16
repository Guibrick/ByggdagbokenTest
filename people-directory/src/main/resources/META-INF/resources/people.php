<!doctype html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>Byggdagboken Test Project</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/wingcss/0.1.8/wing.min.css"/>
</head>
<body>

<div class="container">
    <h1>People Directory</h1>

    <h3>Add a person</h3>
    <form method="POST" action='http://localhost:8080/people'>
        <div class="row">
            <div class="col-6"><input type="text" placeholder="Name" name="name" size="60"/></div>
        </div>
        <div class="row">
            <div class="col-6"><input type="text" placeholder="Country" name="country" size="60"/></div>
        </div>
        <input type="submit" value="Save"/>
    </form>

    <h3>Person List</h3>
    <div class="row">
        <div class="col-2">Id</div>
        <div class="col-4">Name</div>
        <div class="col-6">Country</div>
    </div>
    <?php
        $people = json_decode(file_get_contents('http://localhost:8080/people'), true);
        foreach ($people as $person) {
            echo "<div class='row'>";
            echo "<div class='col-2'>" . $person['id'] . "</div>";
            echo "<div class='col-4'>" . $person['name'] . "</div>";
            echo "<div class='col-6'>" . $person['country'] . "</div>";
            echo "</div>";
        }
    ?>
</div>

</body>
</html>