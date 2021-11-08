package my;
// 1~99 사이의 숫자를 입력 받아 3,6,9 게임 진행.  
// 예) 13 == "박수 짝", 36 == "박수 짝짝"
/*import java.util.Scanner;
public class study {
	 public static void main(String args[]) {
	      Scanner scanner = new Scanner(System.in);

	      System.out.println("1~99 사이의 정수를 입력하시오. ");
	      
	      int num = scanner.nextInt();
	      
	      int count = 0;
	      int tens_digit = num / 10;  // 십의 자리(몫 구하기)
	      int one_digit = num % 10;   // 일의 자리(나머지 구하기)
	      
	      // 조건 시작 (십의 자리 판별 후 일의 자리 판별)
	      if(num > 0 && num < 100) {
	          if(tens_digit % 3 == 0) {
	            count++;
	              if(one_digit % 3 == 0) {
	                count++;
	            }
	          else if(one_digit % 3 ==0) {
	            count++;
	          }
	      }
	      else 
	         System.out.println("숫자를 다시 입력하세요.");
	      
         // 출력 시작 (판별 횟수 만큼 짝 출력) 제발 
	      if(count == 2) 
	         System.out.println("박수 짝짝");
	      else if(count == 1)
	         System.out.println("박수 짝");
	         System.out.println("조건을 만족하지 않음.");
	   }
  }

//정수를 3개를 입력 받고 3개 숫자 중 중간 크기의 수를 출력 *평균값이 아니다.
//예) 100 300 20 >> 100
import java.util.Scanner;
    public class study {
	     public static void main(String[] args) {
	    	 Scanner scanner = new Scanner(System.in);
	    	 
	    	 System.out.print("정수 3개 입력 >> ");
	    	 int x = scanner.nextInt(); //첫 번째 정수 입력 
	    	 int y = scanner.nextInt(); //두 번째 정수 입력 
	    	 int z = scanner.nextInt(); //세 번째 정수 입력 

	    	 //조건 1(x먼저 검사)
	    	 if(x > y){
	    		 if(x < z) {
	    			 System.out.print("중간 값은 " + x);
	    		 }
	    		 else if (x > z && y > x) {
	    			 System.out.print("중간 값은 " + y);
	    		 }
	    		 else {
	    			 System.out.print("중간 값은 " + z);
	    		 }	    			 
	    	 }
	    	 //조건 2(y먼저 검사)
	    	 else if(y > x) {
	    		 if(y < z) {
	    			 System.out.print("중간 값은 " + y);
	    		 }
	    	     else if(y > z && z > y) {
		    	     System.out.print("중간 값은 " + z);
	    		 }
	    	     else {
	    	    	 System.out.print("중간 값은 " + x);
	    	     }
	    	 }
	    	 //조건 3(z먼저 검사)
	    	 else if (z > y){
	    		 if(z < x) {
	    			 System.out.print("중간 값은 " + z);
	    		 }
	    		 else if(z > x && y > x) {
	    			 System.out.print("중간 값은 " + y);
	    	     }
	    		 else {
	    			 System.out.print("중간 값은 " + z);	
	    		 }
	    	 }
	}
} 
//10~99사이의 정수를 입력받아 10의자리와 1의자리가 같은지 판별하여 출력하는 프로그램
//예) 88 >> 같음  /  86 >> 같지 않음 
import java.util.Scanner;
public class study {
	 public static void main(String args[]) {
	      Scanner scanner = new Scanner(System.in);

	      System.out.print("2자리수 정수 입력(10~99) >>> ");
	      
	      int num = scanner.nextInt();

	      int tens_digit = num / 10;  // 십의 자리(몫 구하기)
	      int one_digit = num % 10;   // 일의 자리(나머지 구하기)
	      
	      // 조건 시작 (십의 자리 판별 후 일의 자리 판별)
	      if(num >= 10 && num <= 99) {
	      if(tens_digit == one_digit ) { 
	    	  System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
	            }
	      else if(tens_digit != one_digit) {
	    	  System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
	          }	  
	      }
	      else 
	         System.out.println("10~99 사이의 숫자를 다시 입력하세요.");
	   }
  }

//정수로 된 액수를 입력 받아 (5만원권, 1만원권, 1천원권)장(100원, 50원, 10원, 1원)개 각각 반환값을 출력하여라.
//예) 금액>>1221원   1천원권 1장, 100원 2개, 10원 2개, 1원 1
import java.util.Scanner;
public class study {
	 public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오 >>> ");
		
		int money = scanner.nextInt();
	    
	    //바로 출력하기 상위 지페(동전)계산 후 '나머지'의 값으로 남은 돈의 '몫'을 구한다.
		System.out.println("금액 " + money + "원");
	    System.out.println("5만원권 " + money/50000 + "장");
	    System.out.println("1만원권 " + money%50000/10000 + "장");
	    System.out.println("1천원권 " + money%50000%10000/1000 + "장");
	    System.out.println("100원 " + money%50000%10000%1000/100 + "개");
	    System.out.println("50원 " + money%50000%10000%1000%100/50 + "개");
	    System.out.println("10원 " + money%50000%10000%1000%100%50/10 + "개");
	    System.out.println("1원 " + money%50000%10000%1000%100%50%10/1 + "개");
		
	    scanner.close();
	 }
}

//삼각형의 변의 길이를 나타내는 정수 3개를 받아서 삼각형 생성여부를 판별 *두변의 합이 다른 한변의 크기보다 커야한다.
//예) 변의길이 3개 >>> 3 4 5     삼각형이 됩니다.
import java.util.Scanner;
public class study{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("3개의 변의 길이를 입력하시오 >>> ");
		
		int l1 = scanner.nextInt();
		int l2 = scanner.nextInt();
		int l3 = scanner.nextInt();
	    
		//조건 &&(그리고) 연산자를 사용하여 변의 합 관련 모든 경우의 수를 적
		if(l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
			System.out.println("삼각형이 됩니다.");
		}
		else { 
			System.out.println("삼각형이 안됩니다.");
		}
		scanner.close();
	}
}*/

import java.util.Scanner;
public class study{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점 (x,y)의 좌표를 입력하시오 >>> ");
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		
		if( x >= 100 && x <= 200 && y >= 100 && x <= 200) {
			System.out.printf("(%d, %d)는 사각형 안에 있습니다.",x ,y);
		}
		else { 
			System.out.printf("(%d, %d)는 사각형 안에 없습니다.",x ,y);
		}
		scanner.close();
	}
}