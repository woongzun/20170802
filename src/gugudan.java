import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) {
		while (true) {
			System.out.print("출력할 단은? : ");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			System.out.println("사용자가 입력한 값 : " + number);
			if (1 < number && number < 10) {
				for (int i = 1; i < 10; i++) {
					System.out.println(number * i);
				}
			} else {
				System.out.println("숫자를 정확하게 입력좀 해 주게");
			}
		}
	}
}