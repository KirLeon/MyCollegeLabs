package Dararya.Laba4;

public class Triangle {
    Triangle(double a, double b, double angleC){
        if(angleC>0 & angleC<180){
            double c = Math.sqrt((a*a + b*b - (2*a*b*Math.cos(angleC))));
            if(a+b>c && a+c > b && b+c > a){
                this.a = a;
                this.b = b;
                this.angleC = angleC;
                if((a*a + b+b) == c*c) System.out.println("It's right triangle");
            }
            else{
                System.out.println("Not a triangle");
            }
        }
        else {
            System.out.println("Wrong angle; Not a triangle");
        }
    }
    public double a;
    public double b;
    public double angleC;

    public static void main(String[] args) {
        Triangle triangleABC = new Triangle(6,8, 90);
        triangleABC.dividedByBiss('c');

    }
    public void increaseAngle(int k){
        System.out.print("Angle C is increased from: " + angleC);
        angleC = angleC*k;
        System.out.println("; to:" + angleC);
    }
    public double calculateBiss(){
        return (2*a*b*(Math.cos(angleC/2)))/(a+b);
    }
    public void dividedByBiss(char simv){
        double c = Math.sqrt((a*a + b*b - (2*a*b*Math.cos(angleC))));
        switch (simv){
            case 'a':{
                System.out.println("Calculating BD and BC lines");
                double koef = c/b;
                double BD = a/(1+koef);
                double CD = BD/koef;
                System.out.println("Side a: BD is: " + BD + "; CD is: " + CD);
                break;
            }
            case 'b':{
                System.out.println("Calculating AD and AC lines");
                double koef = c/a;
                double AD = b/(1+koef);
                double CD = AD/koef;
                System.out.println("Side b: AD is: " + AD + "; CD is: " + CD);
                break;
            }
            case 'c':{
                System.out.println("Calculating AD and BD lines");

                double koef = a/b;
                double BD = c/(1+koef);
                double AD = BD/koef;
                System.out.println("Side c: BD is: " + BD + "; AD is: " + AD);
                break;
            }
            default:{
                System.out.println("Wrong side, please choose 'a', 'b' or 'c'");
            }
        }
    }
    public void calculateAngles(){
        double c = Math.sqrt((a*a + b*b - (2*a*b*Math.cos(angleC))));
        double angleA = Math.acos(a*a+b*b-c*c/(2*b*c));
        double angleB = 180 - angleA -angleC;
        System.out.println("Angle A is: " + angleA + "; Abgle B is: "
                + angleB + "; Abgle C is: " + angleC);
    }
}