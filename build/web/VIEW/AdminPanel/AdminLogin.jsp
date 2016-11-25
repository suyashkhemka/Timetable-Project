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
                background: url('../VIEW/background.jpg');
                background-repeat: no-repeat;
            }
            p
            {
                font-family: sans-serif;
                font-size: 80px;
                text-align: center;
                margin-top:40px;
                margin-bottom:50px;
                float:left;
                padding-left: 450px;
                padding-right:450px;
            }
            #logout
            {
                float:left;
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
            

        </style>
    </head>
    <body>
        <%
            session= request.getSession();
            
        %>
        <div>
            <div id="">
                <p>Admin Panel</p>
                <div id="logout"><a href="../VIEW/Homepage.jsp"><button onclick="<% session.invalidate(); %>">logout</button></a></div>
            </div>
            <div id="options">
                <div id="subject"> <a href="../VIEW/AdminPanel/AddSubject.jsp" >Add Subject</a></div> 
                <div id="faculty"> <a href="../VIEW/AdminPanel/AddFaculty.jsp" >Add Faculty </a></div> <br>
            </div>
                
                    
                      
            
            </div>
       
        
    </body>
</html>
