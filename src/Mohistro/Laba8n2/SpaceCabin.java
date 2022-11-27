package Mohistro.Laba8n2;

public class SpaceCabin extends SpaceModule {
    protected double temperature;
    public SpaceCabin(String name){
        super(name);
        this.name = name;
        System.out.println("Space cabin is created");
    }
    public SpaceCabin(String name, double temperature){
        super(name);
        this.name = name;
        this.temperature = temperature;
        System.out.println("Space cabin is created");
    }
    public void display(){
        System.out.println("This is the cabin of " + name + " space station");
    }
    public void display_temperature(){
        System.out.println("The temperature in the cabin is: " + temperature + " degrees");
    }
    @Override
    public void gravitation() {
        System.out.println("Space cabin is gravitated");
    }
}
