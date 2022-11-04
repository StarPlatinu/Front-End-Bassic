
var check = document.getElementById("login");
check.addEventListener("click",function () {
    var checkEmail = document.getElementById("email").value;
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    var checkPassword = document.getElementById("password").value;

    if (checkEmail.match(mailformat) && checkPassword !== "") {
        document.getElementById("email").style.border = '3px solid Green';
    } else if (checkEmail == "" || checkEmail.match(mailformat)==false) {
        alert( "Please insert your email!" );
        document.getElementById("email").style.backgroundColor = 'Red';
    } else if (checkPassword == "") {
        alert( "Please insert your password!" );
        document.getElementById("password").style.backgroundColor = 'Red';
    } else{
        alert("Please insert your information correctly!")
        document.getElementById("password").style.backgroundColor = 'Red';
    }

})