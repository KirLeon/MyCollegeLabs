package Dararya.Laba5;

public class Teacher {
    public Teacher(){

    }

    public Teacher(String teacher_name, String teacher_specialization, int teacher_exp, int amount_of_pupils) {
        this.teacher_name = teacher_name;
        this.teacher_specialization = teacher_specialization;
        this.teacher_exp = teacher_exp;
        this.amount_of_pupils = amount_of_pupils;
    }

    String teacher_name;
    String teacher_specialization;
    int teacher_exp;
    int amount_of_pupils;

    public void teacher_gives_hw(String subject, int page){
        System.out.println("Teacher gives hometask: " + subject + ", page:" + page);
    }
    public boolean teacher_checks_hw(String subject, int page, int ex_num, int ex_num_done){
        System.out.println("Teacher checks hometask: " + subject + ", page:" + page);
        if(ex_num == ex_num_done){
            return true;
        }
        else{
            return false;
        }
    }
    public int check_progul(int amount_of_pupils_here){
        if(amount_of_pupils_here>amount_of_pupils || amount_of_pupils_here<0){
            System.out.println("Something wrong");
            return 0;
        }
        System.out.println("Teacher checks who is absent");
        System.out.println("Here: " + amount_of_pupils_here);
        System.out.println("Absent: " + (amount_of_pupils - amount_of_pupils_here));
        return amount_of_pupils - amount_of_pupils_here;
    }
}
