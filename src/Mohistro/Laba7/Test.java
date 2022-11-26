package Mohistro.Laba7;

public class Test {
    public static void main(String[] args) {
        SpaceStation spaceStation = new SpaceStation("Soyuz");
        SpaceStation spaceModule = new SpaceModule("Soyuz-2");
        SpaceModule spaceCabin = new SpaceCabin("Soyuz-3");
        spaceCabin.display();
        SpaceCabin spaceCabin1 = new SpaceCabin("Soyuz-4");
        spaceCabin1.display_temperature();
    }
}
