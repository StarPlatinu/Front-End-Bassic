
function loadDataPosition(){
    var position = document.getElementById("position");
    var list = ["Operator", "Manager", "Developer", "Designer", "Tester"];
    for (let i = 0; i < list.length; i++) {
        let option = document.createElement("option");
        option.value = list[i];
        option.innerText = list[i];
        position.appendChild(option);
    }
}

function loadDataCountry(){
    var country = document.getElementById("country");
    var list = ["Viet Nam", "Singapore", "Malaysia", "Indonesia", "Philippine", "Lao", "Cambodia"];
    for (let i = 0; i < list.length; i++) {
        let option = document.createElement("option");
        option.value = list[i];
        option.innerText = list[i];
        country.appendChild(option);
    }
}

function validation(){

    var cfirstname = document.getElementById("firstname").value;
    var clastname = document.getElementById("lastname").value;
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/
    var phoneformat =  /^\(?(\d{3})\)?[- ]?(\d{3})[- ]?(\d{4})$/
    var cemail = document.getElementById("email").value;
    var cphone = document.getElementById("phone").value;
  
    if (cfirstname=="" && clastname == "" && cemail =="" && cphone == "") {
        document.getElementById("firstname").style.borderColor = "red";
        document.getElementById("lastname").style.borderColor = "red";
        document.getElementById("email").style.borderColor = "red";
        document.getElementById("phone").style.borderColor = "red";
       
        // document.getElementById("position").style.borderColor = "red";
        // document.getElementById("country").style.borderColor = "red";

        document.getElementById("error_msg_firstname").innerHTML = 'The Firstname should not be blank';
        document.getElementById("error_msg_lastname").innerHTML = 'The Lastname should not be blank';
        document.getElementById("error_msg_email").innerHTML = 'The Email should not be blank';  
        document.getElementById("error_msg_phone").innerHTML = 'The Phone should not be blank';  
        // document.getElementById("error_msg_re-password").innerHTML = 'Re-password is invalid';
    }

    if(cemail.match(mailformat) == false ){
        document.getElementById("email").style.borderColor = "red";
        document.getElementById("error_msg_email").innerHTML = 'Please input your correct your email address';  
    }

    if(cphone.match(phoneformat) == false){
        document.getElementById("phone").style.borderColor = "red";
        document.getElementById("error_msg_phone").innerHTML = 'Please input your correct your phone number';  
    }

   
}