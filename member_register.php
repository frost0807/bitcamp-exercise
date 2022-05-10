<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- <script defer type="text/javascript" src="script/member_register.js"></script> -->
    <title>Document</title>
</head>
<body>
    <?php
        $name=(string)$_POST["user_name"];
        $id=$_POST["user_id"];
        $pw=(string)$_POST["user_pw"];
        $add=$_POST["user_address"];
        $phone=$_POST["user_phone"];
        
        // for($i=0;$i<strlen($name);$i++)
        // {
        //     if(ord(substr($name,$i,1))==32)
        //     {
        //     echo "<script>alert('이름에 공백이 있습니다.');</script>";
        //     echo "<script>location.href='member_register.html'</script>";
        //     break;
        //     }
        // }
        echo "$name";

        if($id=='admin')
        echo "<font color='green'><h5>$id</h5></font><hr>";
        else
        echo "<font color='blue'><h5>$id</h5></font><hr>";
        // for($i=0;$i<strlen($pw);$i++)
        // {
        //     if(48>ord(substr($pw,$i,1))||ord(substr($pw,$i,1)>57))
        //     {
        //     echo "<script>alert('비밀번호에 숫자가 아닌 부분이 있습니다.');</script>";
        //     echo "<script>location.href='member_register.html'</script>";
        //     break;
        //     }
        // }
        for($i=0;$i<strlen($pw);$i++)
        echo "<font color='red'><h5 style='display:inline'>*</h5></font>";
        echo "<hr>";
        echo "<h2>$add</h2><hr>";
        echo "<h2>$phone</h2>";
    ?>
</body>
</html>