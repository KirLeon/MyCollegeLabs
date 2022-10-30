package Dararya.Laba4;

public class Triangle {
    public double a;
    public double b;
    public double angleAB;
    public void increaseAngle(int k){
        angleAB = angleAB*k;
    }
    public double calculateBiss(){
        return (2*a*b*(Math.cos(angleAB/2)))/(a+b);
    }
    public void dividedByBiss(char simv){
        double c = Math.sqrt((a*a + b*b - (2*a*b*Math.cos(angleAB))));
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
}
