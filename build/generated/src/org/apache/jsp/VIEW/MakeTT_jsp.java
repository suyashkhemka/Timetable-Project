package org.apache.jsp.VIEW;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import MODAL_PROJECT.MakeTimetable;

public final class MakeTT_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    \n");
      out.write("        ");
  String sub[][][] = new String [3][3][8];
            
            
            int check[]=new int[9];
            int i=0,j=0,k,hr=0,temp,a,b,d,l,c;
            for(i=0;i<3;i++)
            { for(j=0;j<3;j++)
            { for(k=0;k<8;k++)
            {sub[i][j][k]="0";
            
            }
                }
                }
        int pref[]=new int[30];
    String idj[]= new String[30];
    int lev[]=new int[30];
    String t;
    int doj[]=new int[30];
            MakeTimetable tt = new MakeTimetable();
          idj=tt.id();
          lev=tt.lev();
          doj=tt.doj();
          
for(i=0;i<26;i++)
{
    for(j=0;j<26-i-1;j++)
    {
        if(lev[j]>lev[j+1])
        {   t=idj[j];
            idj[j]=idj[j+1];
            idj[j+1]=t;

            temp=lev[j];
            lev[j]=lev[j+1];
            lev[j+1]=temp;

            temp=doj[j];
            doj[j]=doj[j+1];
            doj[j+1]=temp;
        }
        else if(lev[j]==lev[j+1])
        {
if(doj[j]>doj[j+1])
        {   t=idj[j];
            idj[j]=idj[j+1];
            idj[j+1]=t;

            temp=lev[j];
            lev[j]=lev[j+1];
            lev[j+1]=temp;

            temp=doj[j];
            doj[j]=doj[j+1];
            doj[j+1]=temp;
        }
        }
}
}
for(i=0;i<26;i++)
{
    out.print(idj[i]+"  "+lev[i]+"  "+doj[i]);
    
      out.write("<br/>");

}
         for(i=0;i<26;i++)
                {  check=tt.gettuple(idj[i]);
                if(lev[i]==1)
                    hr=4;
                else if(lev[i]==2)
                    hr=8;
                else if(lev[i]==3)
                    hr=12;
                else if(lev[i]==4)
                    hr=16;
                
                a=0;
                b=3;
                c=6;
                while((hr >0) && ( a<3 ))
                {  if(sub[check[c]-2 ][check[a]-1][check[b]-1]=="0")
                {
                    sub[check[c]-2][check[a]-1][check[b]-1]=idj[i];
                    hr=hr-4;
                    a++;
                    b++;
                    c++;
                }
                else { d=a;
                    if( (check[a]-1) == 0 )
                    {
                    
                     if(sub[check[c]-2 ][check[a]][check[b]-1]=="0")
                {
                    sub[check[c]-2][check[a]][check[b]-1]=idj[i];
                    hr=hr-4;
                    a++;
                    b++;
                    c++;
                }
                   else  if(sub[check[c]-2 ][check[a]+1][check[b]-1]=="0")
                {
                    sub[check[c]-2][check[a]+1][check[b]-1]=idj[i];
                    hr=hr-4;
                    a++;
                    b++;
                    c++;
                }
                    
                    
                    }
                   else if( (check[a]-1) == 1 )
                    {
                    
                     if(sub[check[c]-2 ][check[a]-2][check[b]-1]=="0")
                {
                    sub[check[c]-2][check[a]-2][check[b]-1]=idj[i];
                    hr=hr-4;
                    a++;
                    b++;
                    c++;
                }
                   else  if(sub[check[c]-2 ][check[a]][check[b]-1]=="0")
                {
                    sub[check[c]-2][check[a]][check[b]-1]=idj[i];
                    hr=hr-4;
                    a++;
                    b++;
                    c++;
                }
                    
                    
                    }
                   else if( (check[a]-1) == 2 )
                    {
                    
                     if(sub[check[c]-2 ][check[a]-2][check[b]-1]=="0")
                {
                    sub[check[c]-2][check[a]-2][check[b]-1]=idj[i];
                    hr=hr-4;
                    a++;
                    b++;
                    c++;
                }
                   else  if(sub[check[c]-2 ][check[a]-3][check[b]-1]=="0")
                {
                    sub[check[c]-2][check[a]-3][check[b]-1]=idj[i];
                    hr=hr-4;
                    a++;
                    b++;
                    c++;
                }
                    
                    
                    }
                   if(d==a)
                   {a++;
                   b++;
                   c++;
                   }
                }
                    
                }
            
                if(hr>0)
                {
                
                    
                    for(l=0;l<8;l++)
                    {   for(j=0;j<3;j++)
                    {       for(k=0;k<3;k++)
                    {
                        if(sub[j][k][l]=="0")
                {
                    sub[j][k][l]=idj[i];
                    hr=hr-4;
                    if(hr<=0)
                    {l=10;
                    j=10;
                    k=10;}
                }
                        
                }
                    }
                }
                }
                }
                  
                    for(i=0;i<3;i++)
                    {   for(j=0;j<3;j++)
                    {       for(k=0;k<8;k++)
                    {
                        out.print(sub[i][j][k]+" ");
                    }
                    
      out.write("<br>");

                    }
                    }
        
               
      out.write("\n");
      out.write("   \n");
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
