package Dararya.Laba8n2;

public abstract class ChildrenTeacher extends Teacher {
    public ChildrenTeacher(int exp){
        super(exp);
        experience = exp;
        System.out.println("Children Teacher is created");
    }
    protected void display(){
        System.out.println("This is the children teacher");
    }
}
