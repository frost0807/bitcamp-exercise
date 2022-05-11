const user_info = [["frost", "123", "최준석", "서울", "01012345678", "abc@abc.com"],
    ["fire", "456", "김준석", "대구", "01011112222", "qwe@abc.com"],
    ["water", "789", "문준석", "부산", "01012341234", "zxc@abc.com"]]

function find_id()
    {
        var search_name = document.getElementById('user_name_1').value;
        var search_phone = document.getElementById('user_phone_1').value;

    for(var i=0;i<user_info.length;i++)
    {
        if(search_phone==user_info[i][4]&&search_name==user_info[i][2])
        {
            document.write("당신의 아이디는 "+user_info[i][0]+" 입니다.");
            return true;
        }
    }
    document.write("회원정보가 존재하지 않습니다.");
    return false;
}

function find_pw()
{
    var search_id = document.getElementById('user_id_1').value;
    var search_mail = document.getElementById('user_mail_1').value;

    for(var i=0;i<user_info.length;i++)
    {
        if(search_id==user_info[i][0]&&search_mail==user_info[i][5])
        {
            document.write(user_info[i][5]+' 로 비밀번호가 전송되었습니다.');
            return true;
        }
    }
    document.write("회원정보가 존재하지 않습니다.");
    return false;
}