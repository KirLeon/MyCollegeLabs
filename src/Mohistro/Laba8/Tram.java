package Mohistro.Laba8;

public class Tram extends PublicTransport{
    public Tram(){
        super();
        System.out.println("Tram is created");
    }
    public Tram(int passengers, String number){
        super(passengers, number);
        this.passengers = passengers;
        this.number = number;
        System.out.println("Tram is created");
    }
    @Override
    public void signal(){
        System.out.println("Bibi from tram №" + number);
    }
    public void signal(int n){
        for(int i =0; i<n; i++){
            System.out.println("Bibi from tram №" + number);
        }
    }


    @Override
    public String toString() {
        return "Tram{" +
                "number='" + number + '\'' +
                ", passengers=" + passengers +
                '}';
    }
}
