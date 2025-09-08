package L5.Prob1;

public class Product {
    String  productName;
    double price;

    public Product(String productName, double price)
    {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product: " + productName + ", Price: $" + String.format("%.2f", this.getPrice());
    }
}
