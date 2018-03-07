import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task2 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();

		System.out.println("Вводи числа один за одним. Чтобы напиши count чтобы произвести подсчеты");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for(int i =0; i<5;i++) {
			try {
				arr.add(Integer.parseInt(reader.readLine()));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

	}

}
