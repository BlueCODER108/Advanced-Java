function validate(){
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;

     if((username.length)==0 || (password.length)==0){
        alert("Fill Login Details Totally");
     }
     else if(username.length<6){
         alert("Username should be more than 6 characters, please fill the Username Again");
     }
     else if(password.length<5){
          alert("Password should be more than 5 characters, please fill the Valid Password Again");
     }
     else if(username =="admin108" && password == "User108*" )
     {
        alert("Login Successful");
        return false;
     }
     else{
        alert("login Failed, Invalid Username or Password");
     }
    
}