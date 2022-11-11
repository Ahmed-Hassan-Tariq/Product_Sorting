import java.util.Comparator;

public class NameSort implements Comparator<Product> {

        public int compare(Product a, Product b) {
            return a.name.compareTo(b.name);
        }
    }
