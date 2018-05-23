import java.util.Scanner;

public class Calendar01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력핫게요 : ");
		int month = scanner.nextInt();
		
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.printf("%d월은 %d일 까지 있습니다.\n", month, maxDays[month - 1]);
		scanner.close();
	}
}
