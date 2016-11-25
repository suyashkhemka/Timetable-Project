<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@ page import="MODAL_PROJECT.Bean" %>
<%@ page import="MODAL_PROJECT.Getcourseindex" %>
<%@ page import="java.io.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.util.*" %>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
         <style>
            body
            {
                background: url('../VIEW/background.jpg');
                background-repeat: no-repeat;
            }
            #title
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
            #pref
            {
                margin-top: 100px;
                align-content: center;
            }
            #1,#2,#3
            {
                float:left;
            }
            #1,#11
            {
                float:left;
            }
            #2,#22
            {
                float:left;
            }
            #3,#33
            {
                float:left;
            }
        </style>
    </head>
    <body>
       <div>
            <div id="">
                <p id='title'>Faculty Panel</p>
            </div>
            <div id="options">
                <div id="preference"> <a href="AddSubject.jsp" >Fill Preference</a></div> 
                
            </div>
           </div>
        
        <div id='pref'>
            <form action="FillPreferenceSubmit.jsp">
            <div id='1'>
                <p>Subject Preference 1:</p>    
                <select autofocus name="pref1">


                    <optgroup label="2nd Year" >
                            <%
                              Bean bean=new Bean(); 
                              Getcourseindex index = new Getcourseindex();
            ArrayList list=bean.getsubjects(2);
            int ind;
            Iterator itr = list.iterator(); 
            while(itr.hasNext())
                              {
                                   
                             Object data= itr.next();
                            
%>    
  <option value='<%= data%>'><%= data %></option>
                        <% } %>
                            
                    </optgroup>
                    <optgroup label="3rd Year" >
                            <%
                                  
            list=bean.getsubjects(3);
            
            itr = list.iterator(); 
            while(itr.hasNext())
                              {
                                   
                             Object data= itr.next();

  %>
  <option value='<%= data%>'><%= data %></option>
                        <% } %>
                            
                    </optgroup>
                    <optgroup label="4th Year" >
                            <%
                                  
            list=bean.getsubjects(4);
            
            itr = list.iterator(); 
            while(itr.hasNext())
                              {
                                   
                             Object data= itr.next();

  %>
  <option value='<%= data%>'><%= data %></option>
                        <% } %>
                            
                    </optgroup>
    
                    
                </select>
            </div>
            <div id="11">
                
                <input type="radio" name="sectionpref1" value="1">A
                <input type="radio" name="sectionpref1" value="2">B
                <input type="radio" name="sectionpref1" value="3">C
                
                
            </div>
            <div id='2'>
                  <p>Subject Preference 2:</p>   
                                <select   name="pref2">
                   

                    <optgroup label="2nd Year" >
                            <%
                                  
            list=bean.getsubjects(2);
            
            itr = list.iterator(); 
            while(itr.hasNext())
                              {
                                   
                             Object data= itr.next();

  %>
  <option value='<%= data%>'><%= data %></option>
                        <% } %>
                            
                    </optgroup>
                    <optgroup label="3rd Year" >
                            <%
                                  
            list=bean.getsubjects(3);
            
            itr = list.iterator(); 
            while(itr.hasNext())
                              {
                                   
                             Object data= itr.next();

  %>
  <option value='<%= data%>'><%= data %></option>
                        <% } %>
                            
                    </optgroup>
                    <optgroup label="4th Year" >
                            <%
                                  
            list=bean.getsubjects(4);
            
            itr = list.iterator(); 
            while(itr.hasNext())
                              {
                                   
                             Object data= itr.next();

  %>
  <option value='<%= data%>'><%= data %></option>
                        <% } %>
                            
                    </optgroup>
                   
                </select>
            </div>
                        <div id="22">
                <input type="radio" name="sectionpref2"value="1">A
                <input type="radio" name="sectionpref2"value="2">B
                <input type="radio" name="sectionpref2" value="3">C
                        </div>
            <div id='3'>
                  <p>Subject Preference 3:</p>   
                                <select name="pref3">
                    

                    <optgroup label="2nd Year" >
                            <%
                                  
            list=bean.getsubjects(2);
            
            itr = list.iterator(); 
            while(itr.hasNext())
                              {
                                   
                             Object data= itr.next();

  %>
  <option value='<%= data%>'><%= data %></option>
                        <% } %>
                            
                    </optgroup>
                    <optgroup label="3rd Year" >
                            <%
                                  
            list=bean.getsubjects(3);
            
            itr = list.iterator(); 
            while(itr.hasNext())
                              {
                                   
                             Object data= itr.next();

  %>
  <option value='<%= data%>'><%= data %></option>
                        <% } %>
                            
                    </optgroup>
                    <optgroup label="4th Year" >
                            <%
                                  
            list=bean.getsubjects(4);
            
            itr = list.iterator(); 
            while(itr.hasNext())
                              {
                                   
                             Object data= itr.next();

  %>
  <option value='<%= data%>'><%= data %></option>
                        <% } %>
                            
                    </optgroup>

                    
                </select>
            </div>
                        <div id="33">
                <input type="radio" name="sectionpref3" value="1">A
                <input type="radio" name="sectionpref3" value="2">B
                <input type="radio" name="sectionpref3" value="3">C
                        </div>
                        <input type="submit">
        </form>
        </div>
    </body>
</html>
