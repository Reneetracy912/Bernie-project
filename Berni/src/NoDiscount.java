class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price, int quantity) {
        return price * quantity;
    }
}
