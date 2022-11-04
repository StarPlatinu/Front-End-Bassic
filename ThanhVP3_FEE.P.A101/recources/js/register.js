var check = document.getElementById("register")
check.addEventListener("click",function () {
    var checkUserName = document.getElementById("username").value
    var checkEmail = document.getElementById("email").value;
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/
    var checkPassword = document.getElementById("password").value
    var checkRePassword = document.getElementById("re-password").value

    if (checkEmail.match(mailformat) && checkPassword !== "" && checkUserName !==""
        && checkRePassword===checkPassword) {
        alert("Login successful!");
    } else if(checkUserName == "") {
        alert("Please insert your username!")
    } else if (checkEmail == "" || checkEmail.match(mailformat)==false) {
        alert( "Please insert your email!" )
    } else if (checkPassword == "") {
        alert( "Please insert your password!" )
    } else if (checkRePassword !== checkPassword) {
        alert( "Please check your password!" )
    } else{
        alert("Please insert your information correctly!")
    }

})