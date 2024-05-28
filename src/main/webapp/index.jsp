<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>User Form</title>
</head>
<body>
<div id="container">
    <form action="hello" method="POST">
        Shape:
        <select name="shape">
            <option value="parallelepiped">Parallelepiped</option>
            <option value="cube">Cube</option>
            <option value="sphere">Sphere</option>
        </select>
        <br><br>
        Length: <input type="text" name="length" />
        <br><br>
        Width: <input type="text" name="width" />
        <br><br>
        Height: <input type="text" name="height" />
        <br><br>
        Radius: <input type="text" name="radius" />
        <br><br>
        <input type="submit" value="Calculate Volume" />
    </form>
</div>
</body>
</html>
