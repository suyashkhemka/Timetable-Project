package org.apache.jsp.VIEW.FacultyPanel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import MODAL_PROJECT.Bean;

public final class FacultyLoginAfterPref_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background: url('../background.jpg');\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("            }\n");
      out.write("            p\n");
      out.write("            {\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                font-size: 80px;\n");
      out.write("                text-align: center;\n");
      out.write("                margin-top:40px;\n");
      out.write("                margin-bottom:50px;\n");
      out.write("            }\n");
      out.write("            #preference\n");
      out.write("            {\n");
      out.write("                float:left;\n");
      out.write("                width:330px;\n");
      out.write("                height:45px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                background: aliceblue;\n");
      out.write("                \n");
      out.write("                font-size:30px;\n");
      out.write("                text-align: center;\n");
      out.write("                           \n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #subject \n");
      out.write("            {\n");
      out.write("                margin-right: 20px;\n");
      out.write("            }\n");
      out.write("            a\n");
      out.write("            {\n");
      out.write("                text-decoration: none;\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            #options\n");
      out.write("            {\n");
      out.write("                height:60px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div>\n");
      out.write("            <div id=\"\">\n");
      out.write("                <p>Faculty Panel</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"options\">\n");
      out.write("                <div id=\"preference\"> <a href=\"\" >View Allotted Subjects</a></div> \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("                ");

                    Bean bean=new Bean();
                    String a[]=bean.showpreference((String)(session.getAttribute("id")));
                    int i;
                    for(i=0;i<4;i++)
                    {
                        if(a[i]!=null)
                        {
                            out.print(a[i]);
                            
        }
      out.write("<br>");

                    }
                    
                
                
      out.write("\n");
      out.write("                    \n");
      out.write("                      \n");
      out.write("            \n");
      out.write("            </div>\n");
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
