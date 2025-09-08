package L5.Prob1;

public class Furniture extends Product{
    private Material material;
    private double shippingCost;
    public Furniture(String productName,double price, Material material, double shippingCost)
    {
        super(productName,price);
        this.material = material;
        this.shippingCost = shippingCost;
    }
    @Override
    public double getPrice()
    {
        return super.getPrice() + shippingCost;
    }
    @Override
    public String toString() {
        return "Furniture: " + productName + ", Base Price: $" + String.format("%.2f", price) + ", Material: " + material + ", Shipping Cost: $" + String.format("%.2f", shippingCost) + ", Final Price: $" + String.format("%.2f", this.getPrice());
    }
}
