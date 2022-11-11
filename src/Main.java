import java.sql.Date;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("Chain", 5, 14, 10,new Date(2017,11,5)));
        list.add(new Product("Key", 9,13, 6, new Date(2002,5,30)));
        list.add(new Product("Car", 17,12, 12, new Date(2012,5,30)));
        list.add(new Product("Bike", 4,11, 100, new Date(2022,5,30)));
        list.add(new Product("Bus", 3,12, 55, new Date(2004,5,30)));


        //Sorting By Name
        Collections.sort(list, new NameSort());
        ListIterator<Product> itr = list.listIterator();

        System.out.println("Sorting by Name");
        while(itr.hasNext()) {
            itr.next().printProduct();
        }
        System.out.println("Sorting by Name in Reverse");
        while(itr.hasPrevious()) {
            itr.previous().printProduct();

        }

        //Sorting by Price
        Collections.sort(list, new PriceSort());


        itr = list.listIterator();

        System.out.println("Sorting by Price");
        while(itr.hasNext()) {
            itr.next().printProduct();
        }
        System.out.println("Sorting by Price in Reverse");
        while(itr.hasPrevious()) {
            itr.previous().printProduct();

        }


        //Sorting By Quantity
        Collections.sort(list, new QtSort());


        itr = list.listIterator();
        System.out.println("Sorting by Quantity");
        while(itr.hasNext()) {
            itr.next().printProduct();
        }
        System.out.println("Sorting by Quantity in Reverse");
        while(itr.hasPrevious()) {
            itr.previous().printProduct();

        }

        //Sorting By Rating
        Collections.sort(list, new RatingSort());

        itr = list.listIterator();

        System.out.println("Sorting by Rating");
        while(itr.hasNext()) {
            itr.next().printProduct();
        }
        System.out.println("Sorting by Rating in Reverse");
        while(itr.hasPrevious()) {
            itr.previous().printProduct();

        }

    }
}