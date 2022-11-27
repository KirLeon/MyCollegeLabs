package Dararya.Laba8n2;

public class Teacher implements TeachAble {
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

    @Override
    public void teach() {
        System.out.println("Teacher is teaching");
    }
}
