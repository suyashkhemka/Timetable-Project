<%-- 
    Document   : AddSubject
    Created on : Nov 19, 2016, 12:03:52 AM
    Author     : Suyash
--%>
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
    </head>
    <body>
        <%
            Bean bean=new Bean();     
            bean.setSubject_code(request.getParameter("code"));
            bean.setSubject_name(request.getParameter("name"));
            
            bean.setSubject_type(Integer.parseInt(request.getParameter("type")));
            bean.setSubject_sem(Integer.parseInt(request.getParameter("sem")));
            bean.setSubject_credits(Integer.parseInt(request.getParameter("credits")));
            bean.setSubject_hours(Integer.parseInt(request.getParameter("hours")));

            
            bean.addsubject(bean);
            %>
            <h3>Subject Added successfully</h3>
            <%
            RequestDispatcher rd= request.getRequestDispatcher("../VIEW/AdminPanel/AddSubject.jsp");
            rd.include(request, response);
            
            %>
            
    </body>
</html>
