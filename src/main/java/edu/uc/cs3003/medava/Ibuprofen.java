package edu.uc.cs3003.medava;

public class Ibuprofen extends Medicine {

    public Ibuprofen() {
        super("Ibuprofen");
    }

    @Override
    public double minimumTemperature() {
        //System.out.println("Getting the minimum safe temperature for a Ibuprofen drug.");
        return 30.0;
    }

    @Override
    public double maximumTemperature() {
        //System.out.println("Getting the maximum safe temperature for a Ibuprofen drug.");
        return 90.0;
    }
    
    @Override
    public MedicineSchedule getSchedule() {
        return MedicineSchedule.Uncontrolled;
    }

}