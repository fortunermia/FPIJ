import java.util.*;

/**
 * Class Cities
 */
public class Cities {
	
	public static void main(String[] args) {
    	System.out.println("Hello from AWS Cloud9!");
	}
	
	/**
	 * Old way of iterating 
	 */
	 
	private static String findCity(String cityName){
		
		List<String> cities = getCityList();
		for(String city : cities){
			if( city.equalsIgnoreCase(cityName) ){
				System.out.println( "City found "+city);
				return city;
			}
		}
	}
	 
	private static List<String> getCityList(){
		
		List<String> cityList = new ArrayList<String>();
		cityList.add("Bangalore");
		cityList.add("Delhi");
		cityList.add("Madras");
		cityList.add("Calcutta");
		return cityList;
		
	}
}