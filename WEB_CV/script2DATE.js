
let DMtimer = localStorage.getItem('DMtimer'); 
let test = DMtimer;
var currentdate = new Date(); 
var datetime = currentdate.getHours();
console.log(DMtimer +" "+ datetime)
document.getElementById("timesetter").value = test;

function DMD(){
if(datetime >= DMtimer && datetime > 7 && DMtimer !=0 )
{
console.log(DMtimer + "DMD");
document.body.classList.add('darkmode'); 
}

}
DMD();
function fntime(){
    timeval = document.getElementById("timesetter").value;
    localStorage.setItem('DMtimer', timeval);
    console.log(DMtimer + " a " + datetime);
    console.log("asdasdasdasd");
    DMD();
    location.reload();
}
