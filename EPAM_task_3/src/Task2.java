import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task2 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();

		int max = 0;
		int min;
		int summ = 0;

		System.out.println("Вводи числа один за одним. Напиши count чтобы произвести подсчеты");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			while (true) {
				String s = reader.readLine();
				if (s.equals("count")) {
					break;
				} else {
					arr.add(Integer.parseInt(s));
				}

			}
			reader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Количество введных чисел: " + arr.size());

		for (int m : arr) {
			if (max < m) {
				max = m;
			}
		}
		System.out.println("Максимальное число: " + max);
		
		min = max;
		
		for(int m : arr) {
			if (min > m) {
				min = m;
			}
			summ += m;
			
		}
		System.out.println("Минимальное число: " + min);
		System.out.println("Среднее всех чисел: " + summ/arr.size());
	}

}
