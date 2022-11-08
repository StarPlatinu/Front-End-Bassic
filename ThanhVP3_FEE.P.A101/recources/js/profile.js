
// var check = document.getElementById("sumit1");
// check.addEventListener("click",function () {
//     var firstname =  document.getElementById("firstname").value;
//     var lastname = document.getElementById("lastname").value;
//     var phone = document.getElementById("phone").value;
//     var description = document.getElementById("description").value;
 
//     if(firstname==""&&lastname==""&&phone==""&&description==""){
//      document.getElementById("firstname").style.borderColor = "red";
//      document.getElementById("lastname").style.borderColor = "red";
//      document.getElementById("phone").style.borderColor = "red";
//       document.getElementById("description").style.borderColor = "red";    
//     }
 
     
//     //  document.getElementById("error_msg_email").style.display = 'none';
//     //  document.getElementById("error_msg_password").style.display = 'none';
// })

function checkInput(){
    var cfirstname =  document.getElementById("firstname").value;
    var clastname = document.getElementById("lastname").value;
    var cphone = document.getElementById("phone").value;
    var cdescription = document.getElementById("decription").value;
   
    if(cfirstname == "" && clastname == "" && cphone == "" && cdescription == ""){
            document.getElementById("firstname").classList.add('bcolor-red');
    document.getElementById("lastname").classList.add('bcolor-red');
    document.getElementById("phone").classList.add('bcolor-red');
   console.log(document.getElementById("decription"));
    }

}