package Dararya.Laba8;

public class Neurosurgeon extends Surgeon{
    public Neurosurgeon(){
        super();
        specialization = "neurosurgery";
    }
    public Neurosurgeon(String spec, int exp){
        super(spec, exp);
        specialization = "neurosurgery";
        experience = exp;
        System.out.println("Neurosurgeon is created");
    }
    @Override
    public void lechit() {
        System.out.println("Neurosurgeon is created");
    }
}
