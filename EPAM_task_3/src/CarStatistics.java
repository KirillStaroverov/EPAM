import java.util.Calendar;
import java.util.LinkedList;

public class CarStatistics<T extends Car> {

	public CarStatistics() {
		super();
	}

	public LinkedList<T> selectByManufacturer(String manufacturer, LinkedList<T> arr) {
		
		LinkedList<T> arrByManufacturer = new LinkedList<T>();

		for (T x : arr) {
			if (x.getManufacturer().equals(manufacturer)) {
				arrByManufacturer.add(x);
			}
		}
		return arrByManufacturer;
	}
	
	public LinkedList<T> selectByModelAndYears(String model, int years, LinkedList<T> arr) {
		
		LinkedList<T> arrByModelandYears = new LinkedList<T>();
		
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		
		for (T x : arr) {
			if ((x.getManufacturer().equals(model) && (currentYear - years) < x.getYear())) {
				arrByModelandYears.add(x);
			}
		}
		return arrByModelandYears;	
	}
	
	public static void main(String[] args) {
		System.out.println(Calendar.getInstance().get(Calendar.YEAR));
	}

}
