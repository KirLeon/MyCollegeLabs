package Alex.Laba8n2;

public interface Jewelry {
    default void jewelry(String name, String group) {

        System.out.println(name + " " + group + " подходит для кольца." + "\n");
    }
}
