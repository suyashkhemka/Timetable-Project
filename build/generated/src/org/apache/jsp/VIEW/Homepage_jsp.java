package org.apache.jsp.VIEW;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import captchas.CaptchasDotNet;

public final class Homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Timetable Management System</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background: url(background.jpg);\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("            }\n");
      out.write("            #heading\n");
      out.write("            {\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                font-size: 89px;\n");
      out.write("                padding-left:95px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            #para\n");
      out.write("            {\n");
      out.write("               font-size: 34px;\n");
      out.write("               margin: 140px 150px 50px 150px;\n");
      out.write("               width: 70%;\n");
      out.write("            }\n");
      out.write("            img\n");
      out.write("            {\n");
      out.write("                float:left;\n");
      out.write("            }\n");
      out.write("            video { \n");
      out.write("    position: fixed;\n");
      out.write("    top: 71%;\n");
      out.write("    left: 50%;\n");
      out.write("    min-width: 100%;\n");
      out.write("    min-height: 100%;\n");
      out.write("    width: auto;\n");
      out.write("    height: auto;\n");
      out.write("    z-index: -100;\n");
      out.write("    transform: translateX(-50%) translateY(-50%);\n");
      out.write("    opacity: 0.3;\n");
      out.write("  \n");
      out.write("  \n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            function validate()\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                var name=document.myform.name.value;\n");
      out.write("                var password=document.myform.password.value;\n");
      out.write("                \n");
      out.write("                var \n");
      out.write("                if(name===\" \")\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"error1\").innerHTML=\"*Name cannot be blank\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(password.length<6)\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"error2\").innerHTML=\"*Password should be atleast 6 words\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("        \n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <img src=\"manipal.png\" width=\"100px\" >\n");
      out.write("        <h1 id=\"heading\">Timetable Management System</h1>\n");
      out.write("        <div id=\"forvideo\">\n");
      out.write("            <video  id=\"bgvid\" playsinline autoplay muted loop>\n");
      out.write("   \n");
      out.write("\n");
      out.write("                <source src=\"manipal_out.mp4\" type=\"video/mp4\">\n");
      out.write("</video>\n");
      out.write("        <p id=\"para\"> Time Table Management system is an automated system which generates\n");
      out.write("time table according to the data given by the user. The main requirement of\n");
      out.write("the application is to provide the details about the branch, subjects, teachers\n");
      out.write("and total no. of period. Then the\n");
      out.write("application generates the time table according to your need.</p>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        ");

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

      out.write('\n');
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("  <!-- Trigger the modal with a button -->\n");
      out.write("  <button type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\">Login</button>\n");
      out.write("\n");
      out.write("  <!-- Modal -->\n");
      out.write("  <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\">Login</h4>\n");
      out.write("        </div>\n");
      out.write("        <div  class=\"modal-body\">\n");
      out.write("            <form name=\"myform\" method=\"post\" action=\"../CONTROLLER/Login.jsp\" onsubmit='return validate()'>\n");
      out.write("                Username: <input type=\"text\" name=\"id\" required><span id='error1' style=\"color:red;\"></span> <br><br>\n");
      out.write("                Password: <input type=\"password\" name=\"password\" required><span id='error2' style=\"color:red;\"></span> <br><br>\n");
      out.write("                Captcha password:<input  type=\"text\" name=\"captcha\" size=\"16\" /><span id='error3' style=\"color:red;\"><br><br>\n");
      out.write("                ");
      out.print( captchas.image() );
      out.write("<br><br><br><br><br>\n");
      out.write("          <a href=\"");
      out.print( captchas.audioUrl() );
      out.write("\">Phonetic spelling (mp3)</a><br><br>\n");
      out.write("\n");
      out.write("                &nbsp;\n");
      out.write("                <input type=\"submit\" value=\"Submit\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            <a href=\"NewUser.jsp\"><button>New User</button></a>\n");
      out.write("        </div>\n");
      out.write("          <div>\n");
      out.write("              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("              <a href=\"Error.html\">Forgot Password?</a><br>\n");
      out.write("              \n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("        </div>\n");
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
