package Dararya.Laba8n2;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(12);
        Teacher children_teacher = new MathTeacher(14);
        Teacher math_teacher = new Teacher(13);
        MathTeacher math_teacher1 = new MathTeacher(10, "Doctor Nauk");
        math_teacher.display();
        math_teacher1.getUchenaya_stepen();
    }

}
