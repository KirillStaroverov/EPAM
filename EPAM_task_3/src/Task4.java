
public class Task4 {

	public static void main(String[] args) {
		System.out.println("Задача: Напечатать числа в виде таблицы. Вариант А:");

		for (int i = 0; i < 5; i++) {
			for (int j = i; j >= 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("Задача: Напечатать числа в виде таблицы. Вариант Б:");

		for (int i = 1; i <= 5; i++) {
			for (int k = 5; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
