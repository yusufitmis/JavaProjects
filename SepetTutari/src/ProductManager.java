import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    public ArrayList<Product> products;

    public void Add(Product product){
        products.add(product);
        System.out.println(product._name + " Added! ");
    }
    public void Delete(Product product){
        products.remove(product);
        System.out.println(product._name + " Deleted!");
    }

    public void Hesapla(){
        double toplam = 0;
        for (Product product: products) {
            toplam += product._price;
        }
        System.out.println("Sepet Tutarı: " + toplam );
        System.out.println();
    }
}
