V  <%-- 
    Document   : tt
    Created on : 24 Nov, 2016, 8:57:53 PM
    Author     : Siddhart Bhadri
--%>
<%@include file="MakeTT.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
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
                    %><br><%
                }%><br><%
                
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
                    %><br><%
                }%><br><%
                
            }

                
            
                                
                    
        %>
    </body>
</html>
