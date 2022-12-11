function take_over()
{
    var id = [(document.getElementById("user_id_1").value),
    (document.getElementById("user_id_2").value),
    (document.getElementById("user_id_3").value)]
    var pw = [(document.getElementById("user_pw_1").value),
    (document.getElementById("user_pw_2").value),
    (document.getElementById("user_pw_3").value)]
    var name = [(document.getElementById("user_name_1").value),
    (document.getElementById("user_name_2").value),
    (document.getElementById("user_name_3").value)]
    var phone = [(document.getElementById("user_phone_1").value),
    (document.getElementById("user_phone_2").value),
    (document.getElementById("user_phone_3").value)]
    var mail = [(document.getElementById("user_mail_1").value),
    (document.getElementById("user_mail_2").value),
    (document.getElementById("user_mail_3").value)]

    var user_info = [[id[0], pw[0], name[0], phone[0], mail[0]],
    [id[1], pw[1], name[1], phone[1], mail[1]],
    [id[2], pw[2], name[2], phone[2], mail[2]]];
    document.write('<p>'+user_info[0]+'</p>');
    document.write('<p>'+user_info[1]+'</p>');

    document.write('<table style="border:1px solid black">');
    document.write('<tr>');
    for(var row=0;row<user_info.length;row++)
            {
                document.write('<tr>');
                for(var col=0;col<user_info[0].length;col++)
                {
                    document.write('<td style="border:1px solid black">');
                    document.write(user_info[row][col]);
                    document.write('</td>');
                }
                document.write('</tr>');
            }        
}