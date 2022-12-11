let product_info=new Array();

function product_register(){
    let temp=new product_temp(document.getElementById('id_product').value,
        document.getElementById('id_price').value,
        document.getElementById('id_maker').value,
        document.getElementById('id_due').value)
    product_info[product_info.length]=temp;

    return false;
}

function get_All_Info(){
    let result='<table><tr><th>상품명</th><th>가격</th><th>제조사</th><th>유통기한</th></tr>'
    for(let i=0;i<product_info.length;i++){
        result+='<tr><td>'+product_info[i].get_product()+
        '</td><td>'+product_info[i].get_price()+
        '</td><td>'+product_info[i].get_maker()+
        '</td><td>'+product_info[i].get_due()+
            '</td></tr>';
    }
    return result+'</table>';
}

function product_temp(p1, p2, m, d){
    this.product=p1;
    this.price=p2;
    this.maker=m;
    this.due=d;
}

product_temp.prototype.set_product=function(p1){
    this.product=p1;
}
product_temp.prototype.set_price=function(p2){
    this.price=p2;
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
product_temp.prototype.get_maker=function(){
    return this.maker;
}
product_temp.prototype.get_due=function(){
    return this.due;
}