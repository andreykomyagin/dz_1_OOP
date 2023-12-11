import java.lang.reflect.Array;
import java.util.ArrayList;

public class BottleWaterMachine implements VendingMachine {
    private ArrayList<Product> bottlewaters;
    @Override
    public void initProducts(ArrayList<Product> productList) {
        bottlewaters = productList;
    }
    @Override
    public Product getProduct(String name) {
        for (Product i : bottlewaters) {
            if (i.getName().equals(name)){
                return i;
            }
        }
        return null;
    }
    public Product getProduct(String name, double volume){
        for (Product i : bottlewaters ) {
            if (i.getName().equals(name) && volume == ((BottleWater)i).getVolume()){
                return i;
            }
        }
        return null;
    }
}
