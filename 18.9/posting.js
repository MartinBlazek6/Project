    
   
    let status = 1;
    function ab()
    {
      let a = "a"
      if( status<=1)
     { document.getElementById("34").style.display = 'none'; 
     document.getElementById("56").style.display = 'none'; 
     document.getElementById("78").style.display = 'none'; 
     document.getElementById("910").style.display = 'none'; 
    }
    }
    ab();




 
            function del (){
            document.getElementById("prim").value = "";
            document.getElementById("sec").value = "";
            document.getElementById("prim").value = "";
            document.getElementById("prim").value = "";
                    document.getElementById("prim").style.border = '2px solid black'; 
                    document.getElementById("sec").value = "";
                    document.getElementById("sec").style.border = '2px solid black';
            }

            let not;
            let fs =34;
            let ss =56;
            let ts =78;
            let Fs =910;
            let one = 3;
            let counter =0;
                let two = 4;
            function fn1(){
                const PostRight = localStorage.getItem('prava')
                if(PostRight == "true" && PostRight != null)
                {
                    if(document.getElementById("prim").value == "" ||
                    document.getElementById("sec").value == "" )
                    //Checking if both inputs are filled - START
                    {
                        if(document.getElementById("prim").value == "" &&	
                            document.getElementById("sec").value == "")
                        {
                        document.getElementById("prim").value = "";
                        document.getElementById("prim").style.border = '2px solid red'; 
                        document.getElementById("sec").value = "";
                        document.getElementById("sec").style.border = '2px solid red';
                        } 
                        else if(document.getElementById("prim").value == "")
                        {
                        document.getElementById("prim").value = "";
                        document.getElementById("prim").style.border = '2px solid red'; 
                        document.getElementById("sec").style.border = '2px solid black'; 
                        }
                        else
                        {
                        document.getElementById("sec").value = "";
                        document.getElementById("sec").style.border = '2px solid red'; 
                        document.getElementById("prim").style.border = '2px solid black'; 
                        }
                        alert("Please check if you filled Title and Content")
                }
                //Checking if both inputs are filled - END
                //Loading inputs into variables and cleaning inputs - START
                    else{
                    let str1 = document.getElementById("prim").value;
                let str2 = document.getElementById("sec").value;
                document.getElementById(one).textContent = str1;
                document.getElementById(two).textContent = str2;
                        del();
                //Loading inputs into variables and cleaning inputs - END
                //Creating post - START
                one=one+2;
                two=two+2;
                status++;
                if(status == 2){ document.getElementById(fs).style.display = 'block';}
                else if (status == 3){ document.getElementById(ss).style.display = 'block';}
                else if (status == 4){ document.getElementById(ts).style.display = 'block';}
                else if (status == 5){ document.getElementById(Fs).style.display = 'block';}
                }
                //Creating post - END
                }
                 else{alert("Please Log in befor creating new post")
                }
                  
    }
    

    function fn3(){
        const PRAVA = "false";
        localStorage.setItem("prava", PRAVA);
    }
