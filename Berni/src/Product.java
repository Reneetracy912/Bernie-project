class Product implements Cloneable {
    private String name;
    private double price;
    private boolean available;

    public Product(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    @Override
    public Product clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }
}
