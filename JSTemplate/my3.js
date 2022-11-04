document.addEventListener("DOMContentLoaded",function(){
    //Code here
    var nut = document.getElementById('nut1');
    var khoi = document.getElementsByClassName('cdemo');

     console.log(khoi[0]);
    //goi su kien click
    nut.onclick = function(){
      khoi[0].classList.add('diphai');
    }
},false)