package edu.uc.cs3003.medava;

public class Oxycodone extends Medicine {
    //Constructor
    public Oxycodone(){
        super("Oxycodone");
    }

    @Override
    public MedicineSchedule getSchedule(){
        return MedicineSchedule.Two;
    }
}