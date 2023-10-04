public class Main {
    public static void main(String[] args) {
        // Create products
        Product laptop = new Product("Laptop", 1000, true);
        Product headphones = new Product("Headphones", 50, true);

        // Create cart
        Cart cart = new Cart();

        // Add products to the cart
        cart.addProduct(laptop, 2);
        cart.addProduct(headphones, 1);

        // Display cart items
        cart.displayCartItems();

        // Calculate and display total bill
        double totalBill = cart.calculateTotalBill();
        System.out.println("Total Bill: Your total bill is $" + totalBill);
    }
}