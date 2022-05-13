function register(){
    var name_get = document.getElementById("user_name_1").value;
    var pw_get = document.getElementById("user_pw_1").value;
    var id_get = document.getElementById("user_id_1").value;
    var phone_get = document.getElementById("user_phone_1").value;
    var mail_get = document.getElementById("user_mail_1").value;
    user_info[("user"+(Object.keys(user_info).length+1))] = {"name":name_get, "id":pw_get, "pw":id_get, "phone:":phone_get, "mail":mail_get};
    alert("가입이 완료되었습니다."+user_info[("user"+(Object.keys(user_info).length))]["name"]+Object.keys(user_info).length);
}