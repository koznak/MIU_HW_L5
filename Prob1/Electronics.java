package L5.Prob1;

public class Electronics extends Product{
    private int warranty;
    private double warrantyCost;
    public Electronics(String productName,double price, int warranty, double warrantyCost)
    {
        super(productName, price);
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }
    @Override
    public double getPrice()
    {
        return super.getPrice() + warrantyCost;
    }
    @Override
    public String toString() {
        return "Electronics: " + productName + ", Base Price: $" + String.format("%.2f", price) + ", Warranty: " + warranty + " months, Warranty Cost: $" + String.format("%.2f", warrantyCost) + ", Final Price: $" + String.format("%.2f", this.getPrice());
    }
}
