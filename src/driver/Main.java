package driver;
import model.OptionSet;
import adapter.BuildAuto;
import adapter.FileInput;
/**
* Driver Class
*/
public class Main 
{
    public static void main(String[] args) 
    {
       FileInput model = new BuildAuto();
       model.readFile("FordZTW.txt");
       model.print(); 
       
       BuildAuto ba = new BuildAuto();
       ba.readFile("FordZTW.txt");
       ba.print();
       System.out.println(ba.getAuto());
       ba.modifyNameAndPrice(ba.getAuto());
       System.out.println(ba.getAuto());
       ba.modifyOptionSet(ba.getAuto(), new OptionSet());
       System.out.println(ba.getAuto());
       ba.modifyOption(ba.getAuto(), new OptionSet(), new OptionSet().new Option());
       System.out.println(ba.getAuto());
       ba.print();
    }
}
