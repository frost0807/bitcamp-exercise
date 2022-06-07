let articleArray =new Array();
articleArray[0]="";
let Newarray = new Array();

function save(){
    var name = document.getElementById('name').value;
    var price = document.getElementById('price').value;
    var made = document.getElementById('made').value;
    var usebydate = document.getElementById('usebydate').value;
    if(name==''||price==''||made==''||usebydate==''){
    alert("입력하지 않은 칸이 있습니다.");
    return false;
    }else{
    Newarray=[name,price,made,usebydate];
    articleArray[0]=Newarray;
    alert("값이 저장되었습니다.");
    alert(articleArray.length);
    }
}
function load(){
    alert(articleArray.length);
    document.getElementById("tables").innerHTML="";
    var str="<table><tr><th>물건이름</th><th>물건가격</th><th>제조사이름</th><th>유통기한</th></tr>";
    for(var i=0; i<articleArray.length; i++){  
        str+='<tr><td>'+articleArray[i][0]
        +'</td><td>'+articleArray[i][1]+'</td><td>'+articleArray[i][2]+'</td><td>'+articleArray[i][3]+'</td></tr>';
    }
    str+="</table>";
    document.getElementById("tables").innerHTML=str;
}