

let Username;
let Pass;
let numbero =0;
let exit = 3
function fn2()
{
    let PostRight = 8>10
    Username = document.getElementById("username").value;
    Pass = document.getElementById("pass").value;
    console.log(Username + Pass);
    if(Username == "Martin" && Pass == "JStest" )
    {
        const PRAVA = true;
        localStorage.setItem("prava", PRAVA);
        numbero ==5;
        alert("You are logged as user: " + Username)
        close();
        return;
    }
    else if (exit>0){
        alert("Wrong password or username tries left: " + exit)
       //exit--;
        }
        else if(exit<=0)
        {
         alert("Contact me by email i will help you 😊");
         close(); 
        return;}
        exit--;
}
if(PostRight==true){
    document.getElementById("postB").style.color = "blue";
}


