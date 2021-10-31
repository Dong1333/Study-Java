import java.util.Scanner;
public class date {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("날짜를 입력하세요"); 
		String days = "";
		
		int date = scanner.nextInt(); // 점수 읽기
		
		if(date % 7 == 4 )
			days = "월"; // score가 95이상
		
		else if(date == 5 || date % 7 == 5)
			days = "화";
		
		else if(date == 6 || date % 7 == 6)
			days = "수";
		
		else if(date == 7 || date % 7 == 0)
			days = "목";
		
		else if(date == 1 || date % 7 == 1)
			days = "금";
		
		else if(date == 2 || date % 7 == 2)
			days = "토";
		
		else if(date == 3 || date % 7 == 3)
			days = "일";
		
		if(date != 0)
			System.out.print("2021년 10월" + date +"(일)은 "+ days + "요일 입니다.");
		
		if(date <1 || date > 31)
			System.out.print("1~31일자 사이에 숫자를 입력해 주세요.");
		scanner.close();
		} 
	}