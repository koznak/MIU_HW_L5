package L5.Prob1;

public class TestClass {

    public static double sumProducts(Product[] col) {
        double totalSum = 0.0;
        for (Product product : col) {
            if (product != null) {
                totalSum += product.getPrice();
            }
        }
        return totalSum;
    }
    public static void main(String[] args) {
        Product[] products = new Product[5];

        products[0] = new Electronics("Dell XPS Laptop", 2850.00, 24, 240.00);
        products[1] = new Furniture("Table", 750.00, Material.WOOD, 175.00);
        products[2] = new Clothing("T-Shirt", 25.00, "Wrangler", 10.0);
        products[3] = new Furniture("Office Chair", 280.00, Material.STEEL, 60.00);
        products[4] = new Electronics("Iphone", 1300.00, 12, 96.00);


        System.out.println("--- Product Information ---");
        for (Product product : products) {
            System.out.println(product.toString());
        }

        System.out.println("--- Total Price ---");
        double totalSum = sumProducts(products);
        System.out.println("The sum of all product prices is: $" + String.format("%.2f", totalSum));

    }
}
