<%-- 
    Document   : MakeTimetable
    Created on : 23 Nov, 2016, 11:54:42 PM
    Author     : Siddhart Bhadri
--%>
<%@ page import="java.io.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.util.*" %>

<%@page import="MODAL_PROJECT.MakeTimetable" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <%  String sub[][][] = new String [3][3][8];
            
            
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
    %><br/><%
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
                    %><br><%
                    }
                    }
        
               %>
   
</html>
