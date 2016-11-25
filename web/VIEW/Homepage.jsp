<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@ page language="java" import="captchas.CaptchasDotNet" %>

<html>
    <head>
        <title>Timetable Management System</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
        <style>
            body
            {
                background: url(background.jpg);
                background-repeat: no-repeat;
            }
            #heading
            {
                font-family: sans-serif;
                font-size: 89px;
                padding-left:95px;
                
            }
            #para
            {
               font-size: 34px;
               margin: 140px 150px 50px 150px;
               width: 70%;
            }
            img
            {
                float:left;
            }
            video { 
    position: fixed;
    top: 71%;
    left: 50%;
    min-width: 100%;
    min-height: 100%;
    width: auto;
    height: auto;
    z-index: -100;
    transform: translateX(-50%) translateY(-50%);
    opacity: 0.3;
  
  
}
        </style>
        <script>

            function validate()
            {

                var name=document.myform.name.value;
                var password=document.myform.password.value;
                
                var 
                if(name===" ")
                {
                    document.getElementById("error1").innerHTML="*Name cannot be blank";
                    return false;
                }
                else if(password.length<6)
                {
                    document.getElementById("error2").innerHTML="*Password should be atleast 6 words";
                    return false;
                }
               
            }
        
            </script>
    </head>
    <body>
        <img src="manipal.png" width="100px" >
        <h1 id="heading">Timetable Management System</h1>
        <div id="forvideo">
            <video  id="bgvid" playsinline autoplay muted loop>
   

                <source src="manipal_out.mp4" type="video/mp4">
</video>
        <p id="para"> Time Table Management system is an automated system which generates
time table according to the data given by the user. The main requirement of
the application is to provide the details about the branch, subjects, teachers
and total no. of period. Then the
application generates the time table according to your need.</p>
       
        
        <%
// Construct the captchas object (Default Values)
CaptchasDotNet captchas = new captchas.CaptchasDotNet(
 request.getSession(true),     // Ensure session
 "demo",                       // client
  "secret"                      // secret
  );
 //Construct the captchas object (Extended example)
// CaptchasDotNet captchas = new captchas.CaptchasDotNet(
//  request.getSession(true),     // Ensure session
//  "demo",                       // client
//  "secret",                     // secret
//  "2356098sidfyh9",                         // alphabet
//  8,                           // letters
//  250,                          // width
  //80                            // height
//  );
%>
<%-- 
   % encodeUrl produces jsessionid=xyz in case of disabled cookies
   % Please test your implementation also with disabled cookieS   --%>      



        <div class="container">
            
  <!-- Trigger the modal with a button -->
  <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">Login</button>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Login</h4>
        </div>
        <div  class="modal-body">
            <form name="myform" method="post" action="../CONTROLLER/Login.jsp" onsubmit='return validate()'>
                Username: <input type="text" name="id" required><span id='error1' style="color:red;"></span> <br><br>
                Password: <input type="password" name="password" required><span id='error2' style="color:red;"></span> <br><br>
                Captcha password:<input  type="text" name="captcha" size="16" /><span id='error3' style="color:red;"><br><br>
                <%= captchas.image() %><br><br><br><br><br>
          <a href="<%= captchas.audioUrl() %>">Phonetic spelling (mp3)</a><br><br>

                &nbsp;
                <input type="submit" value="Submit">
                
                
            </form>
            <a href="NewUser.jsp"><button>New User</button></a>
        </div>
          <div>
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <a href="Error.html">Forgot Password?</a><br>
              
          </div>
      </div>
      
    </div>
  </div>
  
</div>
        </div>
    </body>
</html>
