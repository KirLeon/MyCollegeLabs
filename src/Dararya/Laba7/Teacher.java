package Dararya.Laba7;

public class Teacher {
    protected int experience;
    public void setExperience(int a){
        experience = a;
    }
    public Teacher(int exp){
        experience = exp;
        System.out.println("Teacher is created");
    }
    protected void display(){
        System.out.println("This is a teacher");
    }

}
