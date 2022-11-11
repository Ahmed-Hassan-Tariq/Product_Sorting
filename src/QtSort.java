import java.util.Comparator;

public class QtSort implements Comparator<Product> {

    public int compare(Product a, Product b) {
        return a.quantity - b.quantity;
    }
}
