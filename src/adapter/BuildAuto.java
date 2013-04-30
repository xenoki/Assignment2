package adapter;

import util.FileIO;
import model.Automotive;
import model.OptionSet;
import model.OptionSet.Option;
import corejava.Console;;

public class BuildAuto extends ProxyAutomotive implements FileInput 
{

    public BuildAuto()
    {
        super();
    }
    
    /**
    * Build an automotive object from a text file 
    */
    public void readFile(String fileName) 
    {
        try 
        {
            setAuto(new FileIO(fileName).buildAutoFromFile());
        } 
        catch (Exception e) 
        {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    /**
    * Print out all the properties data of the Automotive object 
    */
    public void print() 
    {
        getAuto().print();
    }

    /**
    * Given an automotive object, modify the name, and base price 
    */
    public void modifyNameAndPrice(Automotive model) 
    {
        model.setName(Console.readLine("Enter the new name of model: "));
        model.setPrice(Console.readInt("Enter the new price of the model: "));
    }

    /**
    * Given an automotive object, and option set, modify the option set name
    */
    public void modifyOptionSet(Automotive model, OptionSet optSet) 
    {
        optSet.setName(Console.readLine("Enter the name of the option set to change: "));
        model.matchOptionSet(optSet.getName()).setName(Console.readLine("Enter new name for option set: "));
    }

    /**
    * Given an automotive object, option set, and option, modify the option name and price
    */
    public void modifyOption(Automotive model, OptionSet optSet, Option opt) 
    {
        optSet.setName(Console.readLine("Enter the name of the option set to change: "));
        opt.setName(Console.readLine("Enter the name of option you to change: "));
        String newOptionNameString = Console.readLine("Enter new option name: ");
        model.matchOptionSet(optSet.getName()).getOption(opt.getName()).setName(newOptionNameString);
        model.matchOptionSet(optSet.getName()).getOption(newOptionNameString).setPrice(Console.readInt("Enter the new price of the option: "));
    }
    
    /**
    * BuildAuto driver to test out the methods 
    * @param args
    */
    public static void main(String args[])
    {
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
