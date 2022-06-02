$(document).ready(function(){
    $('#menu_table tr td:first-child').hover(function(){
        $('.cl_best').slideDown(100);
    }, function(){
        $('.cl_best').slideUp(100);
    });
    $('#menu_table tr:nth-child(2) td:first-child').hover(function(){
        $('.cl_best').stop();
    }, function(){
        $('.cl_best').slideUp();
    });
    $('#menu_table tr:nth-child(3) td:first-child').hover(function(){
        $('.cl_best').stop();
    }, function(){
        $('.cl_best').slideUp();
    });
});