package Mohistro.Laba8n2;

public abstract class SpaceModule extends SpaceStation {
    public SpaceModule(String name){
        super(name);
        this.name = name;
        System.out.println("Space module is created");
    }
    protected void display(){
        System.out.println("This is module of " + name + " space station");
    }
}
