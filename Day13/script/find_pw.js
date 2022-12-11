function find_pw()
{
    var search_id = document.getElementById('user_id_1').value;
    var search_mail = document.getElementById('user_mail_1').value;

    for(var i=1;i-1<Object.keys(user_info).length;i++)
    {
        if(search_id==user_info["user"+i]["id"]&&search_mail==user_info["user"+i]["mail"])
        {
            document.write(user_info["user"+i]["mail"]+' 로 비밀번호가 전송되었습니다.');
            return true;
        }
    }
    document.write("회원정보가 존재하지 않습니다.");
    return false;
}