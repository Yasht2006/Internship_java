import java.io.*;
public class Pr10
{
     public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
        {
             String filename= "Test.txt";
             FileWriter w = new FileWriter(filename,false); 

             w.write("Hii i am student.\n");
             w.write("I am studying in diploma Computer Engineering. \n");
             w.write("I am doing internship in java language.\n");
             w.close();
             BufferedReader br = new BufferedReader ( new FileReader("Test.txt"));
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();                          
           }
           catch(IOException e)
           {
            System.err.println("IOException: " + e.getMessage());
           }
        }
}