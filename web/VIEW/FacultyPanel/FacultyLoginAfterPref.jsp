<%-- 
    Document   : FacultyLoginAfterPref
    Created on : 24 Nov, 2016, 11:11:54 PM
    Author     : Siddhart Bhadri
--%>
<%@ page import="MODAL_PROJECT.Bean" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
            #preference
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
       <div>
            <div id="">
                <p>Faculty Panel</p>
            </div>
            <div id="options">
                <div id="preference"> <a href="" >View Allotted Subjects</a></div> 
                
            </div>
                <%
                    Bean bean=new Bean();
                    String a[]=bean.showpreference((String)(session.getAttribute("id")));
                    int i;
                    for(i=0;i<4;i++)
                    {
                        if(a[i].equals(null))
                        {
                           
                            
        }
                
                        else{ out.print(a[i]);
                        }
        %><br><%
                    }
                    
                
                %>
                    
                      
            
            </div>
    </body>
</html>
