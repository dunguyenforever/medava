package edu.uc.cs3003.medava;
import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Transporter {
    private String mTransporterName;
    private double mLowTemperature, mHighTemperature;
    private List<Shippable> goods;

    //instance initializers 
    //the code in instance initializers is guaranteed to be executed after the constructor
    //since List is an abstract class, ac lass in Java that specifies a set of supported methods 
    //but does not offer even a baseline implementation for at least one of those methods
    //can only instantiate subtypes of abstract classes that implement the abstract class' methods.
    /*{
        goods = new List<Medicine>();
    }   
    */
    {
        goods = new ArrayList<Shippable>();
    }

    //Constructor
    public Transporter(String transporterName, double lowTemp, double highTemp) {
        mTransporterName = transporterName;
        mLowTemperature = lowTemp;
        mHighTemperature = highTemp;
    }

    //Getter
    public String getTransporterName() {
        return mTransporterName;

    }

    public void ship() {
        // Do some shipping!
    }

    //Reflection is a feature of a programming language that 
    //"allows its programs to have run-time access to their types and structures and to be able to dynamically modify their behavior."
    
    /* 
    public boolean load(Object itemToLoad) {
        try {
            Method isTemperatureRangeAcceptableMethod = itemToLoad.getClass().getMethod("isTemperatureRangeAcceptable",Double.class, Double.class);
            boolean resultOfMethodCall = (boolean) isTemperatureRangeAcceptableMethod.invoke(itemToLoad, Double.valueOf(mLowTemperature), Double.valueOf(mHighTemperature));
            if (resultOfMethodCall) {
                goods.add(itemToLoad);
            }
            return resultOfMethodCall;
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException e) {
            return false;
        }
    }

    public Object unload() {
        return goods.remove(0);
    }
    */

    public Shippable unload() {
        return goods.remove(0);
    }

    public boolean load(Shippable itemToLoad) {
        if (itemToLoad.isTemperatureRangeAcceptable(mLowTemperature, mHighTemperature)) {
            return goods.add(itemToLoad);
        }
        return false;
    }
    
    public boolean isEmpty() {
        return goods.isEmpty();
    }
}


