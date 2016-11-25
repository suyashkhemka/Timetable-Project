package org.apache.jsp.CONTROLLER;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import captchas.CaptchasDotNet;
import MODAL_PROJECT.Bean;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <style>\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background:url('../VIEW/background.jpg')\">\n");
      out.write("        ");

            Bean bean=new Bean();
            String id=request.getParameter("id");
            String password=request.getParameter("password");
            String captcha = request.getParameter("captcha");

            session= request.getSession();
            
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
} 
      out.print(body);
      out.write('\n');

            
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
            
                
            
           
      out.write("\n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
