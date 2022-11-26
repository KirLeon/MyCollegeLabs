package Mohistro.Laba6.Coffee;

public class BankaKofe extends Coffee{
    public BankaKofe(){
        super();
        obem = 250;
        cost = cost;
        sort = "Банка";
    }
    public BankaKofe(int obem, int cost){
        super();
        this.obem = obem;
        this.cost = cost;
        sort = "Банка";
    }
    private int obem;
    protected int cost;

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    protected String sort;
    @Override
    public void opisanie(){
        System.out.println("Кофе в банке. Сорт: " + sort);
    }

    public int getObem() {
        return obem;
    }

    public void setObem(int obem) {
        this.obem = obem;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "BankaKofe{" +
                "obem=" + obem +
                ", sort='" + sort + '\'' +
                '}';
    }
}
