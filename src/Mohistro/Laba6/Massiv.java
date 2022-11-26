package Mohistro.Laba6;

public class Massiv extends Element{
    public Massiv(){
        super();
    }
    public void vivesti_na_ekran(int a){
        System.out.println(a);
    }
    @Override
    public int getElement(int n){
        System.out.println(n);
        return n;
    }

    @Override
    public String toString() {
        return "Massiv{}";
    }
}