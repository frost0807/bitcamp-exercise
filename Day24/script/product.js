let product_info=new Array();

function product_register(){
    let temp=new product_temp(document.getElementById('id_product').value,
    document.getElementById('id_price').value,
    document.getElementById('id_stock').value,
    document.querySelector('input[name="n_maker"]:checked').value,
    document.querySelector('#id_due').value);

    product_info[product_info.length]=temp;

    document.getElementById('display').innerHTML=
        '입력된 정보를 출력합니다.<br>상품명 : '+temp.product+'<br>가격 : '+temp.price+
        '<br>재고 : '+temp.stock+'<br>제조사 : '+temp.maker+'<br>유통기한 : '+temp.due;
    return false;
}
function search_product(){
    let product_name=document.getElementById('id_search').value;
    let result=product_name+'의 검색결과를 출력합니다 <br><table><tr><th>유통기한</th><th>가격</th><th>재고</th></tr>';
    for(var i=0;i<product_info.length;i++){
        if(product_info[i].get_product()===product_name){
            result+='<tr><td>'+product_info[i].get_due()+'</td><td>'+product_info[i].get_price()+
            '</td><td>'+product_info[i].get_stock()+'</td></tr>';
        }
    }
    return result+'</table>';
}
function check_due_date(){
    let temp=(document.querySelector('#due_check').value).split('-');
    let today=parseInt(temp[0]+temp[1]+temp[2]);
    let result='유통기한이 약 1달 이내로 남은 상품들을 출력합니다. <br><table><tr><th>상품명</th><th>유통기한</th><th>가격</th><th>재고</th></tr>';
    for(var i=0;i<product_info.length;i++){
        temp=product_info[i].get_due().split('-');
        d=parseInt(temp[0]+temp[1]+temp[2]);
        if(((d%1000)/100!=1&&d-100<today)||((d%1000)/100===1&&d-8900<today)){
            result+='<tr><td>'+product_info[i].get_product()+'</td><td>'+product_info[i].get_due()+
            '</td><td>'+product_info[i].get_price()+'</td><td>'+product_info[i].get_stock()+'</td></tr>';
        }
    }
    return result+'</table>';
}
function product_temp(p1, p2, s, m, d){
    this.product=p1;
    this.price=p2;
    this.stock=s;
    this.maker=m;
    this.due=d;
}
product_temp.prototype.set_product=function(p1){
    this.product=p1;
}
product_temp.prototype.set_price=function(p2){
    this.price=p2;
}
product_temp.prototype.set_stock=function(s){
    this.stock=s;
}
product_temp.prototype.set_maker=function(m){
    this.maker=m;
}
product_temp.prototype.set_due=function(d){
    this.due=d;
}
product_temp.prototype.get_product=function(){
    return this.product;
}
product_temp.prototype.get_price=function(){
    return this.price;
}
product_temp.prototype.get_stock=function(){
    return this.stock;
}
product_temp.prototype.get_maker=function(){
    return this.maker;
}
product_temp.prototype.get_due=function(){
    return this.due;
}