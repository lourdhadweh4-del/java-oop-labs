package Products;

public class Product_Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product(7927, "Apple");
        Product product3 = new Product (90892,"Samsung", 1000, 0.1);

        System.out.println(product1.finalPrice()+ "\n" +product2.finalPrice()+ "\n" +product3.finalPrice());

    }
}
