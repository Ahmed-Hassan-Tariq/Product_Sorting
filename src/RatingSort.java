import java.util.Comparator;

public class RatingSort implements Comparator<Product> {
    public int compare(Product a, Product b) {
        return a.rating - b.rating;
    }
}
