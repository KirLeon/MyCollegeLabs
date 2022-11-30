package Mohistro.Laba8n2.entity;

import Mohistro.Laba8n2.abstraction.SpaceObject;

public class SpaceStation implements SpaceObject {
    protected String name;

    public SpaceStation(String name) {
        this.name = name;
        System.out.println("Space station is created");
    }



    @Override
    public void gravitation() {
        System.out.println("Space station is gravitating");
    }
}
