import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	public static void main(String[] args) {
		int s = 0;
		int n = 0;
		int target = 0;
		int result = 0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������� ����� ��������: ");

		try {
			s = Integer.parseInt(reader.readLine());

			System.out.println("������� % �� ��������: ");

			n = Integer.parseInt(reader.readLine());

			System.out.println("������� ������� ����� ����������: ");

			target = Integer.parseInt(reader.readLine());
			
			reader.close();

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		result = (target - s) / ((s * n) / 100);

		while (s < target) {
			s += s * (1 + (double)(n / 100));
			result++;
		}

		System.out.println("�� �������� ��� ����� �����: " + result + " ���.");

	}

}
