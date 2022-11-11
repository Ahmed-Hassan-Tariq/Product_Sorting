import java.util.Comparator;

public class PriceSort implements Comparator<Product>{

    public int compare(Product a, Product b) {
        return a.price - b.price;
    }
}
