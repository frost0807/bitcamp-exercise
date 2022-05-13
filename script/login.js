function login(){
    var id_get = document.getElementById("user_id_1").value;
    var pw_get = document.getElementById("user_pw_1").value;

    for(var i=1;i-1<Object.keys(user_info).length;i++)
    {
        {
            if(id_get==user_info["user"+i]["id"]&&pw_get==user_info["user"+i]["pw"])
            {
                document.write("로그인 되었습니다.");
                return true;
            }
        }
    }
    document.write("아이디 혹은 비밀번호가 잘못되었습니다.");
}