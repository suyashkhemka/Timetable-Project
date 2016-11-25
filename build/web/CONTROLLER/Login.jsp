<%-- 
    Document   : Login
    Created on : Nov 17, 2016, 7:27:27 PM
    Author     : Suyash
--%>
<%@ page language="java" import="captchas.CaptchasDotNet" %>

<%@ page import="MODAL_PROJECT.Bean" %>
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
            </style>
    </head>
    <body style="background:url('../VIEW/background.jpg')">
        <%
            Bean bean=new Bean();
            String id=request.getParameter("id");
            String password=request.getParameter("password");
            String captcha = request.getParameter("captcha");

            session= request.getSession();
            session.setAttribute(id,id);
            
             CaptchasDotNet captchas = new captchas.CaptchasDotNet(
  request.getSession(true),     // Ensure session
  "demo",                       // client
  "secret"                      // secret
  );
             
             String body;
             int j=0;
switch (captchas.check(captcha)) {
  case 's':
    body = "Session seems to be timed out or broken. ";
    body += "Please try again or report error to administrator.";
    j=1;
    break;
  case 'm':
    body = "Every CAPTCHA can only be used once. ";
    body += "The current CAPTCHA has already been used. ";
    body += "Please use back button and reload";
    j=1;
    break;
  case 'w':
    body = "You entered the wrong password. ";
    body += "Please use back button and try again. ";
    j=1;
    break;
  default:
    body = "Your login was verified to be entered by a human";
    break;
} %><%=body%>
<%
            
            int i=bean.authenticate(id, password);
            
            if(i==1 && j==0)
            {
                session.setAttribute("id",id);
                RequestDispatcher rd = request.getRequestDispatcher("../VIEW/AdminPanel/AdminLogin.jsp");
                rd.forward(request, response);
            }
            else if(bean.checkfacultypreference(id) && j==0)
            {
                session.setAttribute("id",id);
                RequestDispatcher rd = request.getRequestDispatcher("../VIEW/FacultyPanel/FacultyLoginAfterPref.jsp");
                rd.forward(request, response);
            }
            else if(i==2 && j==0)
            {
                session.setAttribute("id",id);
                RequestDispatcher rd = request.getRequestDispatcher("../VIEW/FacultyPanel/FacultyLogin.jsp");
                rd.forward(request, response);
            }
            
                
            
           %>
            
    </body>
</html>
