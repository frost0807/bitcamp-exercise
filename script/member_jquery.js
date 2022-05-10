$(document).ready(function()
{
    $("#submit_button").click(function()
    {
        if($("#user_name_1").val().search(' ')!=-1)
        {
        alert("이름에 공백이 있습니다.");
        return false;
        }

        for(let i=0;i<$("#user_pw_1").val().length;i++)
        {
            if($("#user_pw_1").val().charAt(i).charCodeAt()<48||$("#user_pw_1").val().charAt(i).charCodeAt()>57)
            {
            alert("비밀번호에 숫자가 아닌 부분이 있습니다.");
            return false;
            }
        }
    })
})