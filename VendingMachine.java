import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public boolean isThereSchocolade()
    {
        for (Product product :products)
            if (product instanceof Shocolade) return true;
        return false;
    }

    public void printAllPurchases()
    {
        double sum = 0.0;
        System.out.println("Все ваши покупки:");
        for (Product product :products){        
            sum += product.price;
            System.out.printf("- %s\n", product.displayInfo());
        }
        System.out.printf("Общая сумма: %f\n",sum);
        System.out.printf("Есть ли в наших покупках шоколад? %s\n",isThereSchocolade()?"да":"нет");
    }
}
