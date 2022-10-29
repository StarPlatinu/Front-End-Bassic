 $(function(){
    $('.navbar-nav li:nth-child(2) a').click(function(){
           $('body').animate({scrollTop:750});
           return false;
     })

     $('.navbar-nav li:nth-child(3) a').click(function(){
        $('body').animate({scrollTop:1200});
        return false;
  })
})  
 