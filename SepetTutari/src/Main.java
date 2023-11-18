import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        productManager.products = new ArrayList<Product>();
        Product product1 = new Product(1,"PC",10000);
        Product product2 = new Product(2,"Phone",7000);
        Product product3 = new Product(1,"Watch",3000);
        productManager.Add(product1);
        productManager.Add(product2);
        productManager.Add(product3);
        productManager.Hesapla();
        productManager.Delete(product1);
        productManager.Hesapla();


    }
}