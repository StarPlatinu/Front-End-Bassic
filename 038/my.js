document.addEventListener("DOMContentLoaded",function(){
    // khai bao bien can su dung trong app nay

    var tg = document.getElementsByClassName('tamgiac');
    var tamgiac = tg[0];
    // console.log(tg[0]);
    var ds = document.getElementsByClassName('danhsach');
    var danhsach = ds[0];

    //Su dunh ham onclick va togger class cho tam giac doi mau
    tamgiac.onclick = function(){
        // console.log('ban vua click');
       this.classList.toggle('tamgiactrang');
       danhsach.classList.toggle('ra');
    }

},false)