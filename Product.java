package Products;

public class Product {
    private int productID;
    private String name;
    private double price;
    private double discount;
    private double finalPrice;

    public Product () {  //Default constructor
        int productID = 0;
        String name = "unknown";
        double price = 0.0;
        double discount = 0.0;

    }
    public Product (int productID1, String name1) { // Constructor with two attributes
        this.productID = productID1;
        this.name = name1;

    }
    public Product (int productID2, String name2, double price1, double discount1){ // Constructor with all attributes
        this.productID = productID2;
        this.name = name2;
        this.price = price1;
        this.discount = discount1;
    }

    public double finalPrice() { // Method to calculate finalPrice
        return finalPrice = price - (price * discount);

    }

}

