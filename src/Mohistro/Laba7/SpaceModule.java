package Mohistro.Laba7;

public class SpaceModule extends SpaceStation{
    public SpaceModule(String name){
        super(name);
        this.name = name;
        System.out.println("Space module is created");
    }
    protected void display(){
        System.out.println("This is module of " + name + " space station");
    }
}
