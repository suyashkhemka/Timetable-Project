<%-- 
    Document   : AddFaculty
    Created on : Nov 19, 2016, 12:03:52 AM
    Author     : Suyash
--%>
<%@ page import="MODAL_PROJECT.Bean" %>
<%@ page import="MODAL_PROJECT.GeneratePassword" %>
<%@ page import="java.io.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            Bean bean=new Bean();
            bean.setFaculty_id(request.getParameter("id"));
            bean.setFaculty_name(request.getParameter("name"));
            bean.setFaculty_level(Integer.parseInt(request.getParameter("level")));

            bean.setFaculty_dateofjoining(Integer.parseInt(request.getParameter("dateofjoining")));
            GeneratePassword pwd= new GeneratePassword();
            String password=pwd.GeneratePwd();
            bean.setFaculty_password(password);
            bean.setFaculty_email(request.getParameter("email"));
            
            bean.addfaculty(bean);
            
            
            %>
            <h3>Faculty Added successfully<br>
                ID:<%= bean.getFaculty_id() %>
                Password:<%= bean.getFaculty_password() %>
                An email has been sent to the faculty with the new ID and Password.
            
            </h3>
            <%
            RequestDispatcher rd= request.getRequestDispatcher("../VIEW/AdminPanel/AdminLogin.jsp");
            rd.include(request, response);
            
            %>

            

            
            
            
            
            
            
    </body>
</html>
