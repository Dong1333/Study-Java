import java.util.Scanner;

public class SuccessOrFail {
		public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하시오: ");
	int score = scanner.nextInt();
	if (score >= 80 && score >= 0 && score <= 100)
		System.out.println("축하합니다! 합격입니다.");
	else if(score < 80 && score >=0 && score <= 100)
		System.out.println("아쉽지만 불합격입니다.");
	else 
		System.out.println("0점~100점 사이의 점수를 입력하세요");
		scanner.close();
		}
}
