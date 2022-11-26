package Mohistro.Laba6;

import java.util.Arrays;

public class OdnomerniyMassiv extends Massiv{
    public OdnomerniyMassiv(){
        super();
    }
    private static int length;
    public OdnomerniyMassiv(String nazvanie){
        super();
        this.nazvanie = nazvanie;
        System.out.println("Создан массив под названием: " + nazvanie);
    }
    private String nazvanie = "massiv";
    public String getNazvanie() {
        return nazvanie;
    }
    private int[] massiv = new int[200];

    @Override
    public int getElement(int n) {
        System.out.println(massiv[n]);
        return massiv[n];
    }
    public void addElement(int x){
        massiv[length] = x;
        length++;
    }
    public void operation(char c, int i1, int i2){
        switch (c){
            case 'm':{
                System.out.println("Разность " + massiv[i1] + " и " + massiv[i2] + ": ");
                System.out.println(massiv[i1] - massiv[i2] );
                break;
            }
            case 's':{
                System.out.println("Сумма " + massiv[i1] + " и " + massiv[i2] + ": ");
                System.out.println(massiv[i1] + massiv[i2] );
                break;
            }
            case 'd':{
                System.out.println("Деление " + massiv[i1] + " и " + massiv[i2] + ": ");
                System.out.println(massiv[i1] / massiv[i2] );
                break;
            }
            case 'u':{
                System.out.println("Умножение " + massiv[i1] + " и " + massiv[i2] + ": ");
                System.out.println(massiv[i1] * massiv[i2] );
                break;
            }

        }
    }
    public void create(){
        System.out.println("Массив создан");
    }

    public static void main(String[] args) {
        OdnomerniyMassiv odnomas = new OdnomerniyMassiv("Массив 1");
        odnomas.addElement(1);
        odnomas.addElement(2);
        odnomas.addElement(3);
        odnomas.addElement(4);
        odnomas.getElement(2);
        odnomas.getElement(0);
        odnomas.operation('d', 3, 1);
        odnomas.operation('s', 2, 0);
    }

    public void setMassiv(int[] massiv) {
        this.massiv = massiv;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public static int getLength() {
        return length;
    }

    public static void setLength(int length) {
        OdnomerniyMassiv.length = length;
    }

    @Override
    public String toString() {
        return "OdnomerniyMassiv{" +
                "nazvanie='" + nazvanie + '\'' +
                ", massiv=" + Arrays.toString(massiv) +
                '}';
    }
}