package Mohistro.Laba6.Coffee;

public class Coffee {
    public Coffee(){

    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Coffee(String sort){
        this.sort = sort;
    }
    protected String sort;

    protected int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


    protected int obem;
    public void opisanie(){
        System.out.println("Это кофе");
    }

    public int getObem(){
        return obem;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "sort='" + sort + '\'' +
                '}';
    }
}