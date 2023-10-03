import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Product shock = new Shocolade("ООО Вкусный шоколад", "Вкусная плитка шоколада", 150, true, 150);
        System.out.println(shock.displayInfo());

        Product shock2 = new Shocolade("ООО Вкусный шоколад", "Так себе плитка шоколада", 50, false, 250);
        System.out.println(shock2.displayInfo());

        Product bottleOfMilk1 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (1)", 150, 2, 15);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("ООО Источник", "Бутылка с водой (5)", 150, 2, 15);
        System.out.println(bottleOfWater1.displayInfo());
      
        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(shock);
        arrayList.add(shock2);
        arrayList.add(bottleOfMilk1);
        arrayList.add(bottleOfWater1);

        VendingMachine vendingMachine = new VendingMachine(arrayList);

        vendingMachine.printAllPurchases();
    }
}