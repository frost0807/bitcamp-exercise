<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    $id = $_POST["user_id"];
    $pw = $_POST["user_pw"];
    $mail = $_POST["user_mail"];
    echo ("아이디 = ".$id."<br>");
    echo ("비밀번호 = ".$pw."<br>");
    echo ("메일주소 = ".$mail);
    ?>
</body>
</html>