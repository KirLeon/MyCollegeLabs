package Dararya.Laba8n2.abstraction;

import Dararya.Laba8n2.entity.Teacher;

public abstract class ChildrenTeacher extends Teacher {
    public ChildrenTeacher(int exp){
        super(exp);
        experience = exp;
        System.out.println("Children Teacher is created");
    }
    public void display(){
        System.out.println("This is the children teacher");
    }
}
