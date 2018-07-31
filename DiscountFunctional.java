import java.util.*;
import java.math.*;


/**
 * Class DiscountFunctional
 */
public class DiscountFunctional {
	
	
	
	/**
	 * Gets total prices greater than 20 and discounted by 10%
	 * Functional way of doing things
	 * @return
	 */
	public static void main(String[] args) {
    
    	List<BigDecimal> prices = DiscountImperative.getPrices();
    	final BigDecimal totOfDiscPrices = prices.stream()
    		.filter(price->price.compareTo(BigDecimal.valueOf(20)))
    		.map(price->price.multiply(BigDecimal.valueOf(0.9)))
    		.reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}