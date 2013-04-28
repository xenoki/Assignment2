package driver;
import adapter.AutomotiveBuilder;
import adapter.FileInput;
/**
* Driver Class
*/
public class Main 
{
    public static void main(String[] args) 
    {
       FileInput model = new AutomotiveBuilder();
       model.print(); // Test Print with NullPointerException.
       model.readFile("FordZTW.txt");
       model.print(); 
      
       // Testing modify methods
       model.modifyModelNameAndPrice("Honda Accord", 20000);
       model.modifyOptionSetName("Color", "Paint");
       model.modifyOptionName("Paint", "Fort Knox Gold Clearcoat Metallic", "Pink", 1000);
       model.print();
       model.readFile("BadFile.txt"); // Unable to find file exception
       model.modifyOptionSetName("Color", "Paint"); // Unable to find option set name exception
       model.modifyOptionName("Default", "Test", "Ddkd", 1000); // Unable to find option name exception
       
    }
}
