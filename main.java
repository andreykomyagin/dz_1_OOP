import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        HotDrink f1 = new HotDrink("ara", 2.0, 0.5, 20);
        HotDrink f2 = new HotDrink("pepsi",2.5, 1.5, 15);
        HotDrink f3 = new HotDrink("sprite",4.0, 1.0, 20);
        ArrayList<Product> arr = new ArrayList<>();
        arr.add(f1);
        arr.add(f2);
        arr.add(f3);
        HotDrinkMachine ara = new HotDrinkMachine();
        ara.initProducts(arr);
        System.out.println(ara.getProduct("pepsi", 1.5, 15));
    }

}
