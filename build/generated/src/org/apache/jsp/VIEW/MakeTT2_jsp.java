package org.apache.jsp.VIEW;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import MODAL_PROJECT.MakeTimetable;

public final class MakeTT2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/VIEW/MakeTT.jsp");
  }

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

      out.write("V  ");
      out.write('\n');
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        ");

            i=0;
            j=0;
            k=0;
            l=0;
            
            int counter,count;
            int m;
            String a1,b1,c1,d1;
            for(m=0;m<26;m++)
            {     counter=0;
                    count=0;
                    a1=null;
                    b1=null;
                    c1=null;
                    d1=null;
                    
                    
                  
                   for(i=0;i<3;i++)
                    {   for(j=0;j<3;j++)
                    {       for(k=0;k<8;k++)
                    {
                        
                        if(idj[m]==sub[i][j][k])
                        {
                            counter++;
                            if(count==0)
                            {
                                a1=tt.getresult(i+2, j+1, k+1);
                            
                                count++;
                            }
                            else if(count==1)
                            {
                                 b1=tt.getresult(i+2, j+1, k+1);
                            
                                count++; 
                            }
                            else if(count==2)
                            {
                                 c1=tt.getresult(i+2, j+1, k+1);
                            
                                count++; 
                            } 
                            else if(count==3)
                            {
                                d1=tt.getresult(i+2, j+1, k+1);
                                count++;
                            }
                            
                            if(counter==4)
                            {
                                i=4;
                                j=4;
                                k=9;
                            }
                        }         
                                                             
                    }
                    }
                    }
                    tt.updatefinalpref(idj[m],a1,b1,c1,d1);
            }
            String sec[][][] = new String[5][6][8];
            String lab[][][]=new String[5][6][8];
            int s;
            for(i=0;i<5;i++)
            {
                for(j=0;j<6;j++)
                {
                    for(k=0;k<8;k++)
                    {
                        sec[i][j][k]="0";
                    }
                }
            }
            for(i=0;i<5;i++)
            {
                for(j=0;j<6;j++)
                {
                    for(k=0;k<8;k++)
                    {
                        lab[i][j][k]="0";
                    }
                }
            }
            c=0;
            int cp=c+1;
            for(s=0;s<5;s++)
            {
                if((s%2)==0)
                {
                
                    for(d=0;d<6;d++)
                    {
                        if(d==5)
                        {
                            a=4;b=8;
                          for(i=0;i<a-1;i++)
                          {
                              if(cp!=9)
                              {
                              sec[s][d][i]="S"+cp;
                              }
                                      
                           }
                          sec[s][d][a]="lunch";
                          for(i=a+1;i<b-1;i++)
                          {
                              sec[s][d][i]="S"+c;
                          }
                        }
                    else  if((d%2)==0)
                      {
                          a=4;b=8;
                          for(i=0;i<a;i++)
                          {
                              
                              sec[s][d][i]="S"+c;
                                      
                           }
                          sec[s][d][a]="lunch";
                          for(i=a+1;i<b;i++)
                          {
                              if(cp!=9)
                              {
                              sec[s][d][i]="S"+cp;
                              }
                          }
                          
                          
                      }
                     else if((d%2)==1)
                      {
                          a=4;b=8;
                          for(i=0;i<a;i++)
                          {
                              if(cp!=9)
                              {
                              sec[s][d][i]="S"+cp;
                              }
                                      
                           }
                          sec[s][d][a]="lunch";
                          for(i=a+1;i<b;i++)
                          {
                              sec[s][d][i]="S"+c;
                          }
                    }
                
            }
                }
                else if((s%2)==1)
                {
                    
                    
                    
                    
                    for(d=0;d<6;d++)
                    {
                        if(d==5)
                        {
                            a=4;b=8;
                          for(i=0;i<a-1;i++)
                          {
                              if(cp!=9)
                              {
                              sec[s][d][i]="S"+cp;
                              }
                                      
                           }
                          sec[s][d][a]="lunch";
                          for(i=a+1;i<b-1;i++)
                          {
                              sec[s][d][i]="S"+c;
                          }
                        }
                     else if((d%2)==0)
                      {
                          a=3;b=8;
                          for(i=0;i<a;i++)
                          {
                              sec[s][d][i]="S"+c;
                                      
                           }
                          sec[s][d][a]="lunch";
                          for(i=a+1;i<b;i++)
                          {
                              sec[s][d][i]="S"+cp;
                          }
                          
                          
                      }
                     else if((d%2)==1)
                      {
                          a=3;b=8;
                          for(i=0;i<a;i++)
                          {
                              sec[s][d][i]="S"+cp;
                                      
                           }
                          sec[s][d][a]="lunch";
                          for(i=a+1;i<b;i++)
                          {
                              sec[s][d][i]="S"+c;
                          }
                          
                    }
                
            }
                }   c=c+2;
                    cp=cp+2;
            }
            for(i=0;i<5;i++)
            {
                for(j=0;j<6;j++)
                {
                    for(k=0;k<8;k++)
                    {
                        out.print(sec[i][j][k]);
                    }
                    
      out.write("<br>");

                }
      out.write("<br>");

                
            }
 i=0;
int ip=i+1;
c=0;
cp=c+4;
int e;

                for(j=0;j<6;j++)
                {
                   if(j%2==0)
                    { a=2;b=4;d=6;e=8;
                      for(k=0;k<a;k++)
                        { lab[i][j][k]="S"+(c+1);  
                        lab[ip][j][k]="S"+(c+1); 
                        }
                           for(k=a;k<b;k++)
                        { lab[i][j][k]="S"+(cp+1);  
                        lab[ip][j][k]="S"+(cp+1); 
                        }
                        for(k=b;k<d;k++)
                        { lab[i][j][k]="S"+(c+2);  
                        lab[ip][j][k]="S"+(c+2); 
                        }
                           for(k=d;k<3;k++)
                        { lab[i][j][k]="S"+(cp+2);  
                        lab[ip][j][k]="S"+(cp+2); 
                        }
                    
                    }
                      else if(j%2==1)
                    { a=2;b=4;d=6;e=8;
                      for(k=0;k<a;k++)
                        { lab[i][j][k]="S"+(c);  
                        lab[ip][j][k]="S"+(c); 
                        }
                           for(k=a;k<b;k++)
                        { lab[i][j][k]="S"+(cp);  
                        lab[ip][j][k]="S"+(cp); 
                        }
                        for(k=b;k<d;k++)
                        { lab[i][j][k]="S"+(c+3);  
                        lab[ip][j][k]="S"+(c+3); 
                        }
                           for(k=d;k<3;k++)
                        { lab[i][j][k]="S"+(cp+3);  
                        lab[ip][j][k]="S"+(cp+3); 
                        }
}
}

lab[2][0][6]="S8";
lab[2][0][7]="S8";
lab[2][1][0]="S8";
lab[2][1][1]="S8";
lab[2][2][6]="S8";
lab[2][2][7]="S8";
lab[3][0][6]="S8";
lab[3][0][7]="S8";
lab[3][1][0]="S8";
lab[3][1][1]="S8";
lab[3][2][6]="S8";
lab[3][2][7]="S8";


            for(i=0;i<5;i++)
            {
                for(j=0;j<6;j++)
                {
                    for(k=0;k<8;k++)
                    {
                        out.print(lab[i][j][k]);
                    }
                    
      out.write("<br>");

                }
      out.write("<br>");

                
            }

                
            
                                
                    
        
      out.write("\n");
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
