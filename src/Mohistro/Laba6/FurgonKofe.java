package Mohistro.Laba6;
import Mohistro.Laba6.Coffee.BankaKofe;
import Mohistro.Laba6.Coffee.CapsulniyKofe;
import Mohistro.Laba6.Coffee.Coffee;
import Mohistro.Laba6.Coffee.PaketirovaniyKofe;

public class FurgonKofe {
    private int obem;
    private Coffee[] catalog = new Coffee[20];
    private static int positions = 0;
    private int sum;

    public void addToCatalog(Coffee coffee) {
        catalog[positions] = coffee;
        positions++;
    }

    public FurgonKofe() {
        obem = 3000;
    }

    public FurgonKofe(int obem) {
        this.obem = obem;
    }
    public Coffee getCoffeeOf(double obem){
        Coffee c;
        for (int i = 0; i<positions; i++){
            if(catalog[i].getObem() == obem){
                c = catalog[i];
                System.out.println("Товар найден. Это: " + c);
                return c;
            }
        }
        System.out.println("Товар не найден.");
        return null;
    }

    public void addCoffee(Coffee coffee) {
        if (obem > coffee.getObem()) {
            System.out.println("Загружено кофе " + "\n" + coffee);
            obem -= coffee.getObem();
            System.out.println("Оставшийся объём: " + obem);
            sum += coffee.getCost();
            addToCatalog(coffee);
        }
        else System.out.println("Места не хватает");

    }

    public int calculateCost() {
        System.out.println("Загружен на: " + sum);
        return sum;
    }

    public void sortCoffeeBySort() {
        System.out.println("Каталог кофе до сортировки по сорту: ");
        for (int i = 0; i < positions; i++) {
            System.out.println(catalog[i]);
            System.out.println();
        }
        for (int j = 0; j < positions; j++) {
            for (int i = 0; i < positions - 1; i++) {
                Coffee currentSort = catalog[i];
                Coffee nextSort = catalog[i + 1];
                Coffee swap;
                if (currentSort.getSort() == "Банка" && nextSort.getSort() == "Пакет") {
                    swap = currentSort;
                    catalog[i] = nextSort;
                    catalog[i + 1] = swap;
                }
                else if (currentSort.getSort() == "Капсула" && nextSort.getSort() == "Пакет") {
                    swap = currentSort;
                    catalog[i] = nextSort;
                    catalog[i + 1] = swap;
                }
                else if (currentSort.getSort() == "Капсула" && nextSort.getSort() == "Банка") {
                    swap = currentSort;
                    catalog[i] = nextSort;
                    catalog[i + 1] = swap;
                }
            }
        }
        System.out.println("Каталог кофе после сортировки по сорту: ");
        for (int i = 0; i<positions; i++){
            System.out.println(catalog[i]);
            System.out.println();
        }
    }
    public void sortCoffeeByCost() {
        System.out.println("Каталог кофе до сортировки по стоимости: ");
        for (int i = 0; i < positions; i++) {
            System.out.println(catalog[i]);
            System.out.println();
        }
        for (int j = 0; j < positions; j++) {
            for (int i = 0; i < positions - 1; i++) {
                Coffee currentSort = catalog[i];
                Coffee nextSort = catalog[i + 1];
                Coffee swap;
                if (currentSort.getCost() > nextSort.getCost()) {
                    swap = currentSort;
                    catalog[i] = nextSort;
                    catalog[i + 1] = swap;
                }
            }
        }
        System.out.println("Каталог кофе после сортировки по стоимости: ");
        for (int i = 0; i<positions; i++){
            System.out.println(catalog[i]);
            System.out.println();
        }
    }
    public void sortCoffeeByObem() {
        System.out.println("Каталог кофе до сортировки по объёму: ");
        for (int i = 0; i < positions; i++) {
            System.out.println(catalog[i]);
            System.out.println();
        }
        for (int j = 0; j < positions; j++) {
            for (int i = 0; i < positions - 1; i++) {
                Coffee currentSort = catalog[i];
                Coffee nextSort = catalog[i + 1];
                Coffee swap;
                if (currentSort.getObem() > nextSort.getObem()) {
                    swap = currentSort;
                    catalog[i] = nextSort;
                    catalog[i + 1] = swap;
                }
            }
        }
        System.out.println("Каталог кофе после сортировки по объёму: ");
        for (int i = 0; i<positions; i++){
            System.out.println(catalog[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FurgonKofe furgon = new FurgonKofe(1200);
        CapsulniyKofe CapsKof1 = new CapsulniyKofe();
        CapsulniyKofe CapsKof2 = new CapsulniyKofe();
        PaketirovaniyKofe PakKof1 = new PaketirovaniyKofe();
        PaketirovaniyKofe PakKof2 = new PaketirovaniyKofe();
        BankaKofe BanKof1 = new BankaKofe();
        BankaKofe BanKof2 = new BankaKofe();
        CapsulniyKofe CapsKof3 = new CapsulniyKofe();
        PaketirovaniyKofe PakKof3 = new PaketirovaniyKofe();
        BankaKofe BanKof3 = new BankaKofe(120, 10);
        furgon.addCoffee(CapsKof1);
        furgon.addCoffee(CapsKof2);
        furgon.addCoffee(CapsKof3);
        furgon.addCoffee(PakKof1);
        furgon.addCoffee(PakKof2);
        furgon.addCoffee(PakKof3);
        furgon.addCoffee(BanKof1);
        furgon.addCoffee(BanKof2);
        furgon.addCoffee(BanKof3);
        furgon.sortCoffeeBySort();
        furgon.getCoffeeOf(120);


    }
}