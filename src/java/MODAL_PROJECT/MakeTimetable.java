/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODAL_PROJECT;
import MODAL_PROJECT.ConnectionClass;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import java.io.*;
import javax.servlet.*;  
import javax.servlet.http.*;  

/**
 *
 * @author Suyash
 */
public class MakeTimetable {
    String id[]= new String[30];
    int lev[]=new int[30];
    int doj[]=new int[30];
    int check[]=new int[9];
    int i=0;
public String[] id()
    {
        ArrayList list = new ArrayList();
        ConnectionClass cc=new ConnectionClass();
        System.out.println("here");
        cc.createConnection();
        try
        {
            ResultSet rs=cc.stmt.executeQuery("select id from faculty");
            int i=0;
        while(rs.next())
        {
            id[i]=rs.getString(1);
            i++;
            
                   

        }

 
        }
        catch(Exception e4)
        {
                    System.out.print(e4.getMessage());
        }
        
        return id;
    }
 public int[] lev()
    {
        ArrayList list = new ArrayList();
        ConnectionClass cc=new ConnectionClass();
        System.out.println("here");
        cc.createConnection();
        try
        {
            ResultSet rs=cc.stmt.executeQuery("select level from faculty");
            int i=0;
        while(rs.next())
        {
            lev[i]=rs.getInt(1);
            i++;
            
                   

        }

 
        }
        catch(Exception e4)
        {
                    System.out.print(e4.getMessage());
        }
        
        return lev;
    }
 public int[] doj()
    {
        ArrayList list = new ArrayList();
        ConnectionClass cc=new ConnectionClass();
        System.out.println("here");
        cc.createConnection();
        try
        {
            ResultSet rs=cc.stmt.executeQuery("select dateofjoining  from faculty");
            int i=0;
        while(rs.next())
        {
            doj[i]=rs.getInt(1);
            i++;
            
                   

        }

 
        }
        catch(Exception e4)
        {
                    System.out.print(e4.getMessage());
        }
        
        return doj;
    }
    public int[] gettuple(String id)
    {
        ArrayList list = new ArrayList();
        ConnectionClass cc=new ConnectionClass(); 
        cc.createConnection();
         try
        {
            ResultSet rs=cc.stmt.executeQuery("select *  from preference where id='"+id+"'");
            int i=2,j=0;
            if(rs.next())
            {
       for(i=2;i<=10;i++) {
            check[i-2]=rs.getInt(i);
           
            
                   
       }
        }
       

        }
                catch(Exception e4)
        {
                    System.out.print(e4.getMessage());
        }
         
        return check; 
    }
    public String getresult(int l,int j,int k)
    {
        int m=l*10+k;
        String code=String.valueOf(m);
        String message=null;
         ConnectionClass cc=new ConnectionClass(); 
        cc.createConnection();
         try
        {
            ResultSet rs=cc.stmt.executeQuery("select name,sem from subject where code='"+code+"'");
            
            if(rs.next())
            {
                if(rs.getInt(2)==2)
                {
                    message="2nd Year ";
                }
                if(rs.getInt(2)==3)
                {
                    message="3rd Year ";
                }
                if(rs.getInt(2)==4)
                {
                    message="4th Year ";
                }                
                if(j==1)
                {
                    message+="IT-A"+" ";
                }
                else if(j==2)
                {
                    message+="IT-B"+" ";
                }
                else if(j==3)
                {
                    message+="IT-C"+" ";
                }
                message+=rs.getString(1);
            }
        }
              catch(Exception e4)
        {
                    System.out.print(e4.getMessage());
        }
         return message;
         
    }
    public void updatefinalpref(String id, String sub1, String sub2, String sub3, String sub4)
    {
        ConnectionClass cc=new ConnectionClass(); 
        cc.createConnection();
        try
        {
            cc.stmt.executeUpdate("update finalpref set sub1='"+sub1+"',sub2='"+sub2+"',sub3='"+sub3+"',sub4='"+sub4+"' where id='"+id+"'");
        }
        catch(Exception e4)
        {
                    System.out.print(e4.getMessage());
        } 
    }
    
}
