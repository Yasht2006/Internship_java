import java.io.*;
 
public class Pr11 
{
 	public static void main(String a[])
 	{
        BufferedReader br = null;
        String strLine = "";
        try 
        {
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("Tes.txt"), "UTF-8"));
             while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3){
                System.out.println(strLine);
            }
           reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
     }
}