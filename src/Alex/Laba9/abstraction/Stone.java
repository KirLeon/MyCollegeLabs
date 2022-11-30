package Alex.Laba9.abstraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Stone implements Jewelry {
    int price, weight;
    double shine;
    String name, group;

    protected Stone(int price, int weight, double shine, String name, String group) {

        this.price = price;
        this.weight = weight;
        this.shine = shine;
        this.name = name;
        this.group = group;


        System.out.println("Найден новый камень." + "\n" + "\n"
                + "Название и группа: " + name + " " + group + "." + "\n"
                + "Цена: " + price + "." + "\n"
                + "Масса: " + weight + "." + "\n"
                + "Блеск: " + shine + "." + "\n");
    }

    public void increaseWeight() throws IOException {

        BufferedReader readerExperience = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите, на сколько увеличилась масса камня " + name + ": ");
        String stringExperience = readerExperience.readLine();
        weight += Integer.parseInt(stringExperience);
        price += Integer.parseInt(stringExperience);
        System.out.println("Масса камня " + name + ": "
                + weight + "." + "\n"
                + "Цена камня " + name +  ": " + price + "." + "\n");
    }

    public void decreaseShine() throws IOException {

        BufferedReader readerShine = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите, на сколько уменьшился блеск камня " + name +  ": ");
        String stringShine = readerShine.readLine();
        double doubleShine = Double.parseDouble(stringShine);

        if ((shine - doubleShine) >= 0) {

            shine -= doubleShine;
            System.out.println("Блеск камня " + name + ": " + shine
                    + "." + "\n");
        } else {

            System.out.println("Блеск не может иметь отрицательные значения." + "\n");
        }
    }

    public void increaseShine() throws IOException {

        BufferedReader readerShine = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите, на сколько увеличился блеск камня " + name + " "
                + group + ": ");
        String stringShine = readerShine.readLine();
        double doubleShine = Double.parseDouble(stringShine);

        if ((shine + doubleShine) >= 0) {

            shine += doubleShine;
            System.out.println("Блеск камня " + name +  ": " + shine
                    + "." + "\n");
        } else {

            System.out.println("Блеск не может иметь отрицательные значения." + "\n");
        }
    }
}
