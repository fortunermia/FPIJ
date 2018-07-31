import java.util.*;
import java.math.*;

/**
 * Class DiscountImperative
 */
public class DiscountImperative {
	
	
	private final static List<BigDecimal> prices =
			Arrays.asList(
					new BigDecimal(20),
					new BigDecimal(10),
					new BigDecimal(50),
					new BigDecimal(30),
					new BigDecimal(80)
					);
	
	
	/**
	 * Gets total prices gt 20 and discounted by 10%
	 * OLD way of doing things
	 * @return
	 */
	private static BigDecimal getPricesGT20Disc10( List<BigDecimal> prices ) {
		
		BigDecimal totDiscPrice = BigDecimal.ZERO;
		BigDecimal twty = new BigDecimal(20);
		for( BigDecimal price: prices) {
			
			if( price.compareTo( twty )>0) {
				System.out.println( "Price gt 20 "+price.doubleValue());
				totDiscPrice = totDiscPrice.add(price.multiply(new BigDecimal(0.9)));
			}
		}
		return totDiscPrice.abs(MathContext.DECIMAL32);
	}
	
	@SuppressWarnings("unused")
	 static List<BigDecimal> getPrices(){
		return prices;
	}
	
	public static void main(String[] args) {
    	System.out.println("Hello from AWS Cloud9!");
	}
}