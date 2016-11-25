<%-- 
    Document   : FillPreferenceSubmit
    Created on : Nov 20, 2016, 5:12:05 AM
    Author     : Suyash
--%>
<%@ page import="MODAL_PROJECT.Bean" %>
<%@ page import="MODAL_PROJECT.Getcourseindex" %>

<%@ page import="java.io.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                <p>Admin Panel</p>
            </div>
            <div id="options">
                               <div id="preference"> <a href="../VIEW/FacultyPanel/FillPreference.html" >Fill Preference</a></div> 

            </div>
                
                    
                      
            
            </div>
            <%
                Getcourseindex index=new Getcourseindex();
                                String a1=request.getParameter("pref1");
                                int a=index.getcourse(a1);
                                int year1=a/10;
                                int pref1=a%10;
                                String b1=request.getParameter("pref2");
                                int b=index.getcourse(b1);

                                int year2=b/10;
                                int pref2=b%10;
                                String c1=request.getParameter("pref3");
                                int c=index.getcourse(c1);

                                int year3=c/10;
                                int pref3=c%10;                                
                                int sectionpref1=Integer.parseInt(request.getParameter("sectionpref1"));
                                int sectionpref2=Integer.parseInt(request.getParameter("sectionpref2"));
                                int sectionpref3=Integer.parseInt(request.getParameter("sectionpref3"));


                Bean bean=new Bean();
                
               String message=bean.setpreference((String)session.getAttribute("id"),sectionpref1,sectionpref2,sectionpref3,pref1,pref2,pref3,year1,year2,year3);
                
                
            %>
            <h3>Please fill in the Section preference based on the subjects you chose.</h3>
            <button><a href="../VIEW/FacultyPanel/FillSectionPreference.jsp">Go</a></button>
    </body>
</html>
