package Dararya.Laba7;

public class MathTeacher extends Teacher{
    protected String uchenaya_stepen;
    public MathTeacher(int exp){
        super(exp);
        experience = exp;
        System.out.println("Math teacher is created");
    }
    public MathTeacher(int exp, String stepen){
        super(exp);
        experience = exp;
        uchenaya_stepen = stepen;
        System.out.println("Math teacher is created");
    }

    public String getUchenaya_stepen() {
        System.out.println(uchenaya_stepen);
        return uchenaya_stepen;
    }
}
