public class Shocolade extends Product{
    boolean black;
    int kkal;

    public Shocolade(String brand, String name, double price, boolean black, int kkal)
    {
        super(brand,name,price);
        this.black = black;
        this.kkal = kkal;
    }

    public String displayInfo(){
        return String.format("%s - %s (%s shocolade, %s kkal) - %s", brand, name, black?"black":"white", kkal, price);
    }
}
