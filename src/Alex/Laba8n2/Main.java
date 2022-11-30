package Alex.Laba8n2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Topaz stoneNumber2 = new Topaz(26, 20, 50.6, "Топаз",
                "Полудрагоценный");
        stoneNumber2.increaseWeight();
        stoneNumber2.decreaseShine();
        stoneNumber2.increaseShine();
        stoneNumber2.jewelry("Топаз", "Полудрагоценный");

        Ruby stoneNumber3 = new Ruby(23, 12, 60.2, "Рубин",
                "Драгоценный");
        stoneNumber3.increaseWeight();
        stoneNumber3.decreaseShine();
        stoneNumber3.increaseShine();
        stoneNumber3.jewelry("Рубин", "Драгоценный");
    }
}