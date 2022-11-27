package Mohistro.Laba8;

public abstract class PublicTransport implements Vehicle{
    PublicTransport(){
        System.out.println("Public Transport is created");
    }
    PublicTransport(int passengers, String number){
        this.passengers = passengers;
        this.number = number;
        System.out.println("Public Transport is created");
    }
    protected String number;
    protected int passengers;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public void signal(){
        System.out.println("Bibi from " + number);
    }
}
