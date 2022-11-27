package Dararya.Laba8;

import java.util.Date;

public abstract class Surgeon implements Doctor {
    Surgeon(){
        System.out.println("Surgeon is created");
    }
    Surgeon(String spec, int exp){
        specialization = spec;
        experience = exp;
        System.out.println("Surgeon is created");
    }
    protected String specialization;
    protected int experience;
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public void lechit(){
        System.out.println("Doctor is lechit");
    }
}
