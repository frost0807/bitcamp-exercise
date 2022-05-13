function login_member()
{ //######################
  var member_id_js=document.getElementById("ID__login_id").value;//아이디
  members_info=
  { member1:
    {"Name":"KYOUNG-SOO","Addr":"Seoul","Mobile":"010-7641-2215",
      "Member_ID":"admin","Member_PW":"1234##"},
    member2:
    {"Name":"Moon-Knight","Addr":"NewYork","Mobile":"010-7777-9999",
      "Member_ID":"guardian","Member_PW":"moon!$"}
  };//########################
  for(rec in members_info)//회원정보를 전부 찾아본다.(회원수만큼 반복된다)
  {
    if(members_info[rec].Member_ID==member_id_js)//아이디일치함
    {
      document.write("찾았습니다! "+members_info[rec].Name+members_info[rec].Addr+members_info[rec].Mobile+members_info[rec].Member_ID+members_info[rec].Member_PW);
      return true;
    }
  }//########################
  document.write("not found");
  //########################
  return false;//못찾으면 실패(false)다.
}


