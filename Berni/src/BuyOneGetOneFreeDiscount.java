class BuyOneGetOneFreeDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price, int quantity) {
        return (quantity / 2) * price + (quantity % 2) * price;
    }
}