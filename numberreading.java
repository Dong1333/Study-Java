import java.util.Scanner;

public class numberreading {
	public static void main(String[] args ) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수를 입력하시오 : ");
		
		int number = scanner.nextInt();
		
		if (number == 0)
			System.out.printf(number+"입니다.");
		else if (number % 2 == 0)
			System.out.println("짝수 입니다.");
		else if (number % 2 == 1)
			System.out.println("홀수 입니다.");
		
	    scanner.close();	
	}

}
