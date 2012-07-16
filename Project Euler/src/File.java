import java.io.FileInputStream;

public class File
{

  public static void main(String args[]) throws Exception
  {
	//File is inputed into the program  
    FileInputStream fis = new FileInputStream("C:/MyDocuments/Downloads/names");
    
    // Reads and displays data
    int i;
    while ((i = fis.read()) != -1)
    {
      System.out.println(i);
    }
    
    // Closes the file from the program
    fis.close();
  }
}