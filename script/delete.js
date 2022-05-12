function delete_user()
{
    var search_id = document.getElementById('user_id_2').value;
    var search_pw = document.getElementById('user_pw_1').value;

    for(var i=1;i-1<Object.keys(user_info).length;i++)
    {
        if(search_id==user_info["user"+i]["id"]&&search_pw==user_info["user"+i]["pw"])
        {
            document.write(user_info["user"+i]["id"]+'의 회원정보가 삭제되었습니다.');
            delete user_info["user"+i];
            return true;
        }
    }
    document.write("회원정보가 존재하지 않습니다.");
    return false;
}