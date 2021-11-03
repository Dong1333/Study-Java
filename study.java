// 1~99 사이의 숫자를 입력 받아 3,6,9 게임 진행.  .  
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

	    	 //조건 시작
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
	    	 
	    	 else if(x < y) {
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
//예) 88 >> 같음  /  86 >> 같지 않
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
  }*/

import java.util.Scanner;
public class study {
	 public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오 >>> ");
		
		int money = scanner.nextInt();
		
		int fifty_thousand =
		int ten_thousand =
		int one_thousand =
		int one_hundred =
		int fifty =
		int ten =
		int one =
		
		
	 }
}