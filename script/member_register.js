var name_check=document.getElementById("user_name_1").value;
var pw_check=document.getElementById("user_pw_1").value;


function check_process()
{
    if(name_check.search(' ')!=-1)
    alert("이름에 공백이 있습니다.");

    for(let i=0;i<pw_check.length;i++)
    {
        if(pw_check.charAt(i).charCodeAt()<48||pw_check.charAt(i).charCodeAt()>57)
        {
        alert("비밀번호에 숫자가 아닌 부분이 있습니다.");
        break;
        }
    }
    return false;
}