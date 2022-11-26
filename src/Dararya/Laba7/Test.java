package Dararya.Laba7;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(12);
        Teacher children_teacher = new ChildrenTeacher(14);
        Teacher math_teacher = new Teacher(13);
        MathTeacher math_teacher1 = new MathTeacher(10, "Doctor Nauk");
        math_teacher.display();
        math_teacher1.getUchenaya_stepen();
    }

}
