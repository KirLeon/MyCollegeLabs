package Mohistro.Laba8n2.application;

import Mohistro.Laba8n2.abstraction.SpaceModule;
import Mohistro.Laba8n2.entity.SpaceCabin;
import Mohistro.Laba8n2.entity.SpaceStation;

public class Test {
    public static void main(String[] args) {
        SpaceStation spaceStation = new SpaceStation("Soyuz");
        SpaceModule spaceModule = new SpaceCabin("Soyuz-2");
        SpaceModule spaceCabin = new SpaceCabin("Soyuz-3");
        spaceCabin.display();
        SpaceCabin spaceCabin1 = new SpaceCabin("Soyuz-4");
        spaceCabin1.display_temperature();
    }
}
