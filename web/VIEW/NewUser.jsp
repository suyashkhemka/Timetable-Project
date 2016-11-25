<%-- 
    Document   : NewUser
    Created on : Nov 23, 2016, 8:14:34 PM
    Author     : Suyash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<script>

	function validateform()

	{

		var name=document.myform.name.value;

		var password=document.myform.password.value;

		

		if(name==null||name=="")

		{

			document.getElementById("pic").src="unchecked.png";

			document.getElementById("demo").innerHTML = "Name can't be blank";

			return false;

		}

		else

		{

			document.getElementById("pic").src="checked.png";

			document.getElementById("demo").innerHTML = "Correct";

		}

		

		if(password.length<6)

		{

			alert("Password must be at least 6 characters long");

			return false;	

		} 

		

		var secondpassword=document.myform.password2.value;

		if(password!=secondpassword)

		{

			alert("Password must be same!");

			return false;

		}

		

		var x=document.myform.email.value;

		var atposition=x.indexOf("@");

		var dotposition=x.lastIndexOf(".");

		if(atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length)

		{

			alert("Please enter a valid email address");

			return false;

		}

		alert("Successfully registered!");

	}

</script>
                <style>
            body
            {
                background: url('background.jpg');
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

            a
            {
                text-decoration: none;
               
                
                
            }
            #form
            {
                margin: 500px;
                margin-left: 600px;
                margin-top:200px;
                height: 400px;
            }
            #1
            {
                

            }

            
        </style>
    </head>
    <body>
         <div>
            <div id="">
                <p>Welcome</p>
            </div>
             <div id="form">
                 <div id="1">
                     
                 <form action="" onsubmit="return valideteform()" >
                     ID:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name ="name"><br><br><br>
                     Password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name ="pwd"><br><br><br>
                     New Password:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name ="password"><br><br><br>
                     Retype Password:&nbsp;<input type="text" name ="password2"><br><br><br>
                     <input type="submit" value="Submit">
                 </form>
             
                 </div>
             </div>
             
         </div>
        
    </body>
</html>
