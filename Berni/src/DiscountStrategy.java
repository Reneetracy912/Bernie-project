import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public interface DiscountStrategy {
	double applyDiscount(double price, int quantity);
}
