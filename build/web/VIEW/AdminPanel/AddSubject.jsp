<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script>
            
                                </script>
        <style>
            body
            {
                background: url('../background.jpg');
                background-repeat: no-repeat;
            }
            p
            {
                font-family: sans-serif;
                font-size: 80px;
                text-align: center;
                margin-top:40px;
                margin-bottom:50px;
            }
            #subject, #faculty
            {
                float:left;
                width:330px;
                height:45px;
                font-weight: bold;
                background: aliceblue;
                
                font-size:30px;
                text-align: center;
                           

            }
            #subject 
            {
                margin-right: 20px;
            }
            a
            {
                text-decoration: none;
               
                
                
            }
           
            #options
            {
                height:60px;
            }
            #sub_form
            {
                padding-top: 60px;
            }
            
        </style>
    </head>
    <body>
        <div>
            <div id="">
                <p>Admin Panel</p>
            </div>
            <div id="options">
                <div id="subject"> <a href="#" >Add Subject</a></div> 
                <div id="faculty"> <a href="AddFaculty.jsp" >Add Faculty </a></div> <br>
            </div>
                
                    
                       <div id="sub_form">
                           <form  id="sub" name="subject" method="post" action='../../CONTROLLER/AddSubject.jsp'>
                        <b>Code:</b><input type="text" name="code" style='width:200px;height:40px;align-text: center;'><br><br>
                         <b>Name:</b><input type="text" name="name" style='width:200px;height:40px;align-text: center;'><br><br>
                         <b>Type:</b><input type="text" name="type" style='width:200px;height:40px;align-text: center;'><br><br>
                         
                         <b>Sem:</b><input type="number" name="sem" style='width:200px;height:40px;align-text: center;'><br><br>
                         <b>Credits:</b><input type="text" name="credits" style='width:200px;height:40px;align-text: center;'><br><br>
                         <b>Hour:</b><input type="text" name="hours" style='width:200px;height:40px;align-text: center;'><br>  <br>
                        <input type="submit" name="submit" value="Submit">
                    </form> 
        </div>
            
            </div>
        </div>
        
    </body>
</html>
