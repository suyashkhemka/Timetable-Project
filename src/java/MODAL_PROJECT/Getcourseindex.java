/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODAL_PROJECT;

/**
 *
 * @author Suyash
 */
public class Getcourseindex {
    
    public int getcourse(String course)
    {
        int i=0;
        if(course.equalsIgnoreCase("JAVA"))
        {
            i=21;
        }
        else if(course.equalsIgnoreCase("STLD"))
        {
            i=22;
        }
        else if(course.equalsIgnoreCase("COA"))
        {
            i=23;
        }
        else if(course.equalsIgnoreCase("DS"))
        {
            i=24;
        }
        else if(course.equalsIgnoreCase("MATH2"))
        {
            i=25;
        }
        else if(course.equalsIgnoreCase("JAVALAB"))
        {
            i=26;
        }
        else if(course.equalsIgnoreCase("STLDLAB"))
        {
            i=27;
        }
        else if(course.equalsIgnoreCase("DSLAB"))
        {
            i=28;
        }
        else if(course.equalsIgnoreCase("MATH3"))
        {
            i=31;
        }
        else if(course.equalsIgnoreCase("OPEN"))
        {
            i=32;
        }
        else if(course.equalsIgnoreCase("MP"))
        {
            i=33;
        }
        else if(course.equalsIgnoreCase("OS"))
        {
            i=34;
        }
        else if(course.equalsIgnoreCase("DBMS"))
        {
            i=35;
        }
        else if(course.equalsIgnoreCase("MPLAB"))
        {
            i=36;
        }      
            else if(course.equalsIgnoreCase("OSLAB"))
        {
            i=37;
        }
        else if(course.equalsIgnoreCase("DBMSLAB"))
        {
            i=38;
        }
        else if(course.equalsIgnoreCase("SEPM"))
        {
            i=41;
        }
        else if(course.equalsIgnoreCase("ITA"))
        {
            i=42;
        }
        else if(course.equalsIgnoreCase("DAA"))
        {
            i=43;
        }
        else if(course.equalsIgnoreCase("DC"))
        {
            i=44;
        }        
        else if(course.equalsIgnoreCase("DMW"))
        {
            i=45;
        }
        else if(course.equalsIgnoreCase("SEPMLAB"))
        {
            i=46;
        }
        else if(course.equalsIgnoreCase("ITALAB"))
        {
            i=47;
        }
        else if(course.equalsIgnoreCase("DAALAB"))
        {
            i=48;
        }
        return i;
    }
    
}
