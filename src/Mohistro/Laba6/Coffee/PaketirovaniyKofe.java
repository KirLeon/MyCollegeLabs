package Mohistro.Laba6.Coffee;

public class PaketirovaniyKofe extends Coffee{
    public PaketirovaniyKofe(){
        super();
        obem = 100;
        cost = 10;
        sort = "Пакет";
    }
    public PaketirovaniyKofe(int obem, int cost){
        super();
        this.obem = obem;
        this.cost = cost;
        sort = "Пакет";
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
        System.out.println("Кофе пакетированный. Сорт: " + sort);
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
        return "PaketirovaniyKofe{" +
                "obem=" + obem +
                ", sort='" + sort + '\'' +
                '}';
    }
}
