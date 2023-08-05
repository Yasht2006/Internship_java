import java.io.*;
import java.util.*;

public class Pr9 
{
       public static void main(String[] args) 
       {
       File f = new File("Test.txt");
       Date d=new Date(f.lastModified());
	   
	   System.out.println("\nThe file was last modified on: "+d+"\n");	   
     }
}