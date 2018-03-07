import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {

		System.out.println("Задача: Дано целое число a. Определить число вхождений в него цифры b.");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Введите число a:");

		try {
			int a = Integer.parseInt(reader.readLine());

			System.out.println("Введите число b:");

			int b = Integer.parseInt(reader.readLine());

			System.out.println("Количество вхождений: " + a / b);
			
			reader.close();

		} catch (Exception e) {
			System.out.println("Вы ввели не число!");
		}

	}

}
