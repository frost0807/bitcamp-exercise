function check_id(){
    let compare_id = document.getElementById('user_id_1').value;
    let pw = document.getElementById('user_pw_1').value;
    let pw_check = document.getElementById('user_pw_check_1').value;
    const id_list = ['frost', 'fire', 'water', 'wood'];
    
    for(var i=0;i<id_list.length;i++)
    {
        if(compare_id.search(' ')!=-1)
        {
        alert("이름에 공백이 있습니다.");
        return false;
        }
        if(compare_id==id_list[i])
        {
        alert('중복된 아이디입니다.');
        return false;
        }
    }

    if(pw!=pw_check)
    {
        alert("비밀번호가 일치하지 않습니다.")
        return false;
    }
}