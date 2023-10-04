
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Cart {

    private Map<String, Integer> items;
    private Map<String, Product> products;
    private DiscountStrategy discountStrategy;

    public Cart() {
        items = new HashMap<>();
        products = new HashMap<>();
        discountStrategy = new NoDiscount();
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void addProduct(Product product, int quantity) {
        if (product.isAvailable() && quantity > 0) {
            Product clonedProduct = product.clone();
            products.put(product.getName(), clonedProduct);
            items.put(product.getName(), items.getOrDefault(product.getName(), 0) + quantity);
        }
    }

    public void updateQuantity(String productName, int quantity) {
        if (items.containsKey(productName) && quantity > 0) {
            items.put(productName, quantity);
        }
    }

    public void removeProduct(String productName) {
        items.remove(productName);
        products.remove(productName);
    }

    public double calculateTotalBill() {
        double totalBill = 0;
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            String productName = entry.getKey();
            int quantity = entry.getValue();
            Product product = products.get(productName);
            totalBill += discountStrategy.applyDiscount(product.getPrice(), quantity);
        }
        return totalBill;
    }

    public void displayCartItems() {
        System.out.println("Cart Items:");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            String productName = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("You have " + quantity + " " + productName + " in your cart.");
        }
    }
}
