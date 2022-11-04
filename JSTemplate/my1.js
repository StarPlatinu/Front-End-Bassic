//Cach truy cap 1 ptu trong js

//-Dua vao the
// var x1 =  document.getElementsByTagName("h4");
// console.log(x1);

var cactieude = document.getElementsByTagName('h4');
console.log(cactieude[1]);

for (let index = 0; index < cactieude.length; index++) {
    cactieude[index].innerHTML = "<button class='btn btn-primary btn-block' >Click! </button>";
}

console.log(document.getElementById('demo1'));

// console.log(document.getElementsByClassName(''))

//Query selector

var x = document.querySelector('.list-group-item');
console.log(x);

var y = document.querySelectorAll('.list-group-item');
console.log(y);

var demo = document.querySelectorAll('.card .card-title');
console.log(demo);


for (let index = 0; index < demo.length; index++) {
   if(index==0){
    console.log(demo[index]);
    demo[index].innerHTML = "You Are Selected";
   }
}

var n1 = document.querySelector('.n1');
console.log(n1);

var nall = document.querySelectorAll('.n1');
// console.log();
// nall[0].classList.remove('btn-outline-info');
// nall[0].classList.add('btn-outline-warning');

nall[0].classList.toggle('btn-outline-info');
