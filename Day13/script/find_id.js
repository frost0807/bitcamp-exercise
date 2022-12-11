function find_id()
{
        var search_name = document.getElementById('user_name_1').value;
        var search_phone = document.getElementById('user_phone_1').value;

    for(var i=1;i-1<Object.keys(user_info).length;i++)
    {
        {
            if(search_phone==user_info["user"+i]["phone"]&&search_name==user_info["user"+i]["name"])
            {
                document.write("당신의 아이디는 "+user_info["user"+i]["id"]+" 입니다.");
                return true;
            }
        }
    }
    document.write("회원정보가 존재하지 않습니다.");
    return false;
}