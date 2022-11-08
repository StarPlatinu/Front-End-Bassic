document.addEventListener("DOMContentLoaded",function(){
    var nut = document.getElementById('nuthieuung');
    var trangthai = 'lan1';
    var khoi = document.getElementById('kcd');
    nut.onclick = function(){
     if(trangthai == 'lan1'){
        console.log('Ban Vua CLick Vao Nut Lan 1');
        trangthai = 'lan2';
        khoi.classList.remove('ko-dong');
        khoi.classList.add('chieuso1');
     }else if(trangthai == 'lan2'){
        console.log('Ban Vua CLick Vao Nut Lan 2');
        trangthai = 'lan1';
        khoi.classList.remove('chieuso1');
     }
    }
},false)