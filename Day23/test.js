let user_info=new Array();

function signup_process(){
    let temp=new signup_temp;
    temp.set_All(document.getElementById('name_val').value,
        document.getElementById('id_val').value,
        document.getElementById('pw_val').value,
        document.getElementById('mail_val').value,
        document.getElementById('phone_val').value,
        document.getElementById('address_val').value);

        user_info[user_info.length]=temp;

        return false;
}
function searching_id(){
    var check=document.getElementById('search_id').value;
    for(var i=0;i<user_info.length;i++){
        if(check===user_info[i].get_id()){
            return (user_info[i].get_id()+'의 회원정보를 출력합니다<br>'+
            user_info[i].name+'<br>'+
            user_info[i].id+'<br>'+
            user_info[i].pw+'<br>'+
            user_info[i].mail+'<br>'+
            user_info[i].phone+'<br>'+
            user_info[i].address);
        }
    }
    return ('해당하는 아이디가 없습니다');
}
function get_user_info(){
    return (user_info.length-1)+'번째 회원정보를 출력합니다<br>'+
        user_info[user_info.length-1].name+'<br>'+
        user_info[user_info.length-1].id+'<br>'+
        user_info[user_info.length-1].pw+'<br>'+
        user_info[user_info.length-1].mail+'<br>'+
        user_info[user_info.length-1].phone+'<br>'+
        user_info[user_info.length-1].address;
}
function get_Nth_user_info(){
    var n=document.getElementById('nn').value;
    return ((n)+'번째 회원정보를 출력합니다<br>'+
        user_info[n].name+'<br>'+
        user_info[n].id+'<br>'+
        user_info[n].pw+'<br>'+
        user_info[n].mail+'<br>'+
        user_info[n].phone+'<br>'+
        user_info[n].address);
}

function signup_temp(name, id, pw, mail, phone, address){
    this.name=name;
    this.id=id;
    this.pw=pw;
    this.mail=mail;
    this.phone=phone;
    this.address=address;
}
signup_temp.prototype.set_All=function(na, id, pw, ma, ph, ad){
    this.name=na;
    this.id=id;
    this.pw=pw;
    this.mail=ma;
    this.phone=ph;
    this.address=ad;
}
signup_temp.prototype.set_name=function(na){
    this.name=na;
}
signup_temp.prototype.set_id=function(id){
    this.id=id;
}
signup_temp.prototype.set_pw=function(pw){
    this.pw=pw;
}
signup_temp.prototype.set_mail=function(ma){
    this.mail=ma;
}
signup_temp.prototype.set_phone=function(ph){
    this.phone=ph;
}
signup_temp.prototype.set_address=function(ad){
    this.address=ad;
}
signup_temp.prototype.get_name=function(){
    return this.name;
}
signup_temp.prototype.get_id=function(){
    return this.id;
}
signup_temp.prototype.get_pw=function(){
    return this.pw;
}
signup_temp.prototype.get_mail=function(){
    return this.mail;
}
signup_temp.prototype.get_phone=function(){
    return this.phone;
}
signup_temp.prototype.get_address=function(){
    return this.address;
}