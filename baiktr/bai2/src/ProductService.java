public interface ProductService {
    void addProduct(Product p);
    void updateProduct(String id, Product newInfo);
    void deleteProduct(String id);
    Product finByName(String name);
    void sortByPriceAsc();
    void sortByPriceDesc();
    void printProduct();


}
