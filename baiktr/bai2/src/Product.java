public class Product {
    private String id;
    private String name;
    private double price;
    private  int quantity;
    private  String category;
    private Manufactrer manufactrer;
    public double getDisconutPrice(){
        return 0;
    }

    public Product(String id, String name, double price, int quantity, String category, Manufactrer manufactrer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.manufactrer = manufactrer;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Manufactrer getManufactrer() {
        return manufactrer;
    }

    public void setManufactrer(Manufactrer manufactrer) {
        this.manufactrer = manufactrer;
    }
}
