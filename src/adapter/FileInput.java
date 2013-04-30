package adapter;

import model.Automotive;
import model.OptionSet;
import model.OptionSet.Option;

/**
* @author hquach
* API for FileInput
* Enforce a contract between classes for methods
* Enable Polymorphism 
* Define API
* 
* Class can implement multiply interfaces
* Neither Interface and Abstract Class can not be instantiated
*/
public interface FileInput 
{   
    public void readFile(String fileName);
    public void print();
    public void modifyNameAndPrice(Automotive model);
    public void modifyOptionSet(Automotive model, OptionSet optSet);
    public void modifyOption(Automotive model, OptionSet optSet, Option opt);
   
}
