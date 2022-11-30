package Alex.Laba9.entity;

import Alex.Laba9.abstraction.Jewelry;
import Alex.Laba9.abstraction.Stone;

public class Ruby extends Stone implements Jewelry {
    public Ruby(int price, int weight, double shine, String name, String group) {

        super(price, weight, shine, name, group);
    }
}
