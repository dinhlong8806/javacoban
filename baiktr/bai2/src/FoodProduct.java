public class FoodProduct extends Product {
    public double getDiscountPrice() {
        return getPrice()*0.05;
    }
}
