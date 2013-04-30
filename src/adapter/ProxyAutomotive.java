package adapter;
import model.Automotive;
import model.OptionSet;
import model.OptionSet.Option;

/** 
* Abstract class ProxyAutomtive, this class will provide the abstract method that will 
* be exported as API
*/
public abstract class ProxyAutomotive 
{	
    // Properties -------------------------------------------------------------------------------

    private Automotive auto;
    
    // Constructors ------------------------------------------------------------------------------

    public Automotive getAuto() 
    {
        return auto;
    }
    public void setAuto(Automotive auto) 
    {
        this.auto = auto;
    }
    // Abstract methods -----------------------------------------------------------------------------
    public abstract void readFile(String fileName);
    public abstract void print();
    public abstract void modifyNameAndPrice(Automotive model);
    public abstract void modifyOptionSet(Automotive model, OptionSet optSet);
    public abstract void modifyOption(Automotive model, OptionSet optSet, Option opt);
}
