import java.util.ArrayList;

public interface VendingMachine {
    public ArrayList<Product> productList = new ArrayList<Product>();
    public void initProducts(ArrayList<Product> productList);

    public Product getProduct(String name);
    
}
