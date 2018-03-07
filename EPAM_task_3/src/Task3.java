import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	public static void main(String[] args) {
		int s = 0;
		int n = 0;
		int target = 0;
		int result;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("¬ведите сумму вложени€: ");
		
		try {
			s = Integer.parseInt(reader.readLine());
			
			System.out.println("¬ведите % по депозиту: ");
			
			n = Integer.parseInt(reader.readLine());
			
			System.out.println("¬ведите целевую сумму накоплени€: ");
			
			target = Integer.parseInt(reader.readLine());
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		result = (target - s)/((s*n)/100);
		System.out.println(result);
		
		
	}

}
