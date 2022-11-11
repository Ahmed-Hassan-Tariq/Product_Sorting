import java.sql.Date;

class Product {
    String name;
    int quantity;
    int price;
    int rating;
    Date date;

    public Product(String name, int quantity, int price, int rating, Date date) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.rating = rating;
        this.date = date;
    }

    public void printProduct() {
        System.out.println(
                "Name: " + name + " " +
                        "Price: " + price + " " +
                        "Qnt: " + quantity + " " +
                        "Rating: " + rating + " " +
                        "Date: " + date);
    }



}

