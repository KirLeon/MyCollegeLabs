package Mohistro.Laba6.Coffee;

public class CapsulniyKofe extends Coffee{
    public CapsulniyKofe(){
        super();
        obem = 60;
        cost = 24;
        sort = "Капсула";
    }
    public CapsulniyKofe(int obem, int cost){
        super();
        this.obem = obem;
        this.cost = cost;
        sort = "Капсула";
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
        System.out.println("Кофе в капсулах. Сорт: " + sort);
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
        return "CapsulniyKofe{" +
                "obem=" + obem +
                ", sort='" + sort + '\'' +
                '}';
    }
}