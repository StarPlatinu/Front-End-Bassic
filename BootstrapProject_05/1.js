$(function(){

$(window).resize(function(){
	var docao = $(window).height();
	$('.top1').css({'height':docao})
});

//Khi click vao nutmenu
$('.nutmenu').click(function(){
	$('.menuphai').addClass('ra');
	return false;
});

$('.tat').click(function(){
	$('.menuphai').removeClass('ra');
	return false;
});

});
 