package Mohistro.Laba8n2;

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
