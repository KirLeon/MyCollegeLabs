package Mohistro.Laba8n2.abstraction;

import Mohistro.Laba8n2.entity.SpaceStation;

public abstract class SpaceModule extends SpaceStation {
    public SpaceModule(String name){
        super(name);
        this.name = name;
        System.out.println("Space module is created");
    }
    public void display(){
        System.out.println("This is module of " + name + " space station");
    }
}
