package edu.uc.cs3003.medava;

public abstract class Medicine implements Shippable{
    //A private entity can only be accessed by yourself (again, with exceptions)
    private String mMedicineName;
    
    //Constructor 
    public Medicine(String medicineName) {
        mMedicineName = medicineName;
    }

    //Getter
    //The method getMedicineName will return to the caller a copy of the name of the medicine. We specified that clients (and derivers) can invoke it (public).
    public String getMedicineName() {
        return mMedicineName;
    }
    
    public double minimumTemperature() {
        return 0.0;
    }

    public double maximumTemperature() {
        return 100.0;
    }
    
    //this...denotes a value that is a reference to the object for which the instance method was invoked ..., or to the object being constructed.
    public boolean isTemperatureRangeAcceptable(Double lowTemperature, Double highTemperature) {
        if (this.minimumTemperature() <= lowTemperature &&
                highTemperature <= this.maximumTemperature()) {
            return true;
        }
        return false;
    }

    public abstract MedicineSchedule getSchedule();

}


