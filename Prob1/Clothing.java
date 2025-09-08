package L5.Prob1;

public class Clothing extends Product{
    private String brand;
    private double discountValue;
    public Clothing(String productName, double price, String brand, double discountValue)
    {
        super(productName,price);
        this.brand=brand;
        this.discountValue = discountValue;
    }
    @Override
    public double getPrice()
    {
        var price = super.getPrice();
        return  price * (1 - discountValue  / 100);
    }
    @Override
    public String toString() {
        return "Clothing: " + productName + ", Base Price: $" + String.format("%.2f", price) + ", Brand: " + brand + ", Discount: " + String.format("%.0f", discountValue) + "%, Final Price: $" + String.format("%.2f", getPrice());
    }
}
