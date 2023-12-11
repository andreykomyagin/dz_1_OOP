import java.util.ArrayList;

public class HotDrinkMachine implements VendingMachine {
    private ArrayList<Product> hotdrinks;
    @Override
    public void initProducts(ArrayList<Product> productList) {
        hotdrinks = productList;
    }
    @Override
    public Product getProduct(String name) {
        for (Product i : hotdrinks) {
            if (i.getName().equals(name)){
                return i;
            }
        }
        return null;
    }
    public Product getProduct(String name, double volume){
        for (Product i : hotdrinks ) {
            if (i.getName().equals(name) && volume == ((BottleWater)i).getVolume()){
                return i;
            }
        }
        return null;
    }

    public Product getProduct(String name, double volume, int temperature){
        for (Product i : hotdrinks ) {
            if (i.getName().equals(name) && volume == ((HotDrink)i).getVolume() && ((HotDrink)i).getTemperature() == temperature ){
                return i;
            }
        }
        return null;
    }
    
}
