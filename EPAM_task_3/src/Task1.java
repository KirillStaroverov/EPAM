import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {

		System.out.println("������: ���� ����� ����� a. ���������� ����� ��������� � ���� ����� b.");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("������� ����� a:");

		try {
			int a = Integer.parseInt(reader.readLine());

			System.out.println("������� ����� b:");

			int b = Integer.parseInt(reader.readLine());

			System.out.println("���������� ���������: " + a / b);
			
			reader.close();

		} catch (Exception e) {
			System.out.println("�� ����� �� �����!");
		}

	}

}
