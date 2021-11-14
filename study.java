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
}
//2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의 두점으로 표현한다 (100,100)과 (200,200)의
//두점으로 이루어진 사각형이 있을때, (x,y)값을 입력받고 직사각형 안에 있는지 판별하라.
//예) 150, 200     있습니다,   50, 70   없습니다.
import java.util.Scanner;
public class study{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점 (x,y)의 좌표를 입력하시오 >>> ");
		
		//x값, y값 받기  
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		//조건 : 200 >= (x, y) >= 100.  x, y모두 200보다 작고 100보다 크다를 표현한다. 
		if( x >= 100 && x <= 200 && y >= 100 && x <= 200) {
			System.out.printf("(%d, %d)는 사각형 안에 있습니다.",x ,y);
		}
		else { 
			System.out.printf("(%d, %d)는 사각형 안에 없습니다.",x ,y);
		}
		scanner.close();
	}
}

import java.util.Scanner;
public class study{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산 >>> ");
		
		//x값, 문자열로 연산 값, y값 받기  
		int x = scanner.nextInt();
		String sign = scanner.next();
		int y = scanner.nextInt();

            //문자열 부분 비교 (+, -, *, /) 각 해당 되는 연산 진
			if(sign.equals("+") == true) {
			System.out.printf(x + sign + y + "의 계산 결과는 %d", x + y );
			}
			else if(sign.equals("-") == true) {
				System.out.printf(x + sign + y + "의 계산 결과는 %d", x - y );
			}
			else if(sign.equals("*") == true) {
				System.out.printf(x + sign + y + "의 계산 결과는 %d", x * y );
			}
			else if(sign.equals("/") == true) {
				if(x == 0 || y == 0) {    // x, y 중 하나가 0값일 경우 나누기 연산 진행불가
					System.out.printf("0으로 나눌 수 없습니다.");
				}
				else
				System.out.printf(x + sign + y + "의 계산 결과는 %d", x / y );
				}
			}					
	}


//정수 배열 10개를 선언 후 정수 10개를 입력받고 
import java.util.Scanner;
public class study{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		int arr[] = new int[10];
		System.out.print("정수 10개를 입력하시오 >>> ");
		for(int i = 0; i < 10; i++) {
		arr[i] = scanner.nextInt();
		System.out.println("배열 "+i+"번째 숫자값 + 1000 = " + (arr[i] + 1000));
		}				
	}
}

/
import java.util.Scanner;
public class study{
	public static void main(String args[]){
        int arr[] = {10, 20, 30, 40, 50};
        int sum = 0;
		
        for(int i = 0; i < arr.length; i++) {
        	sum += arr[i];
        }       
		System.out.println("sum = "+ sum);				
	}
}

//과제 M : answer에 담긴 데이터만큼 '*'을 찍어 내라.
import java.util.Scanner;
public class study{
	public static void main(String args[]){
		Scanner scanner= new Scanner(System.in);
        int counter[] = new int[4];
        int answer [] = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        
        for(int i = 0; i < answer.length; i++) {
        	counter[answer[i]-1]++;
        }       
         
        for(int i = 0; i < counter.length; i++) {
        	System.out.print((i + 1) + "의 개수만큼 별 찍기 : ");
        	for(int a = 0; a < counter[i]; a++) {
        		System.out.print("*");
        	}
        	   System.out.println();      	
        }   
	}
}

//과제 N : M을 참고하여 1~4사이의 수 11개를 입력받아 받은 숫자의 개수를 세어서 개수만큼 '*'를 찍어내
import java.util.Scanner;
public class study{
	public static void main(String args[]){
		Scanner scanner= new Scanner(System.in);
        int counter[] = new int[4];
        int answer [] = new int[11];
        
        System.out.print("1~4 사이의 정수를 11개 입력하시오 >>> ");
        
        for(int i = 0; i < 11; i++) {
        	answer [i] = scanner.nextInt();
        }
        for(int i = 0; i < answer.length; i++) {
        	counter[answer[i]-1]++;
        }       
         
        for(int i = 0; i < counter.length; i++) {
        	System.out.print((i + 1) + "의 개수만큼 별 찍기 : ");
        	for(int a = 0; a < counter[i]; a++) {
        		System.out.print("*");
        	}
        	   System.out.println();      	
        }   
	}
}

//과제 O : 5개의 데이터를 갖는 num배열에서 최대값을 출력하는 프로그램을 구현해라.
import java.util.Scanner;
public class study{
	public static void main(String args[]){
		Scanner scanner= new Scanner(System.in);
        int max = 0;
        int num [] = new int[5];
        
        System.out.print("5개의 정수를 입력하시오 >>> ");
        
        for(int i = 0; i < num.length; i++) {
        	num [i] = scanner.nextInt();
            if(num[i] > max)
            	max = num[i];
        }   
        		System.out.println("5개의 정수 중 가장 큰 값은 = "+max);  	
        }   
	}
	
// 과제 P : 5개의 데잍를 갖는 num 배열에서 각 데이터(수)만큼 '@'를 출
import java.util.Scanner;
public class study{
	public static void main(String args[]){
		Scanner scanner= new Scanner(System.in);
        int num [] = {5,7,1,9,10} ;
        
        for(int i = 0; i < num.length; i++) {
        	for(int a = 0; a < num[i]; a++ ) {
        		System.out.print("@");
        	}
        	   System.out.println();      	
        }   
	}

}

// 과제 Q : 사용자로부터 자연수를 5개 입력받아 받은 데이터 수 만큼 '@'를 출
import java.util.Scanner;
public class study{
	public static void main(String args[]){
		Scanner scanner= new Scanner(System.in);
	       int answer [] = new int[5];
	        
	      System.out.print("5개의 자연수 입력하시오 >>> ");
	        
	for(int i = 0; i < answer.length; i++) {
	       	answer [i] = scanner.nextInt();
	       	for(int a = 0; a < answer[i]; a++ ) {
	       		System.out.print("@");
	       	}
	       	   System.out.println();      	
	       }   
	}
}
//for-each문 예제 (기본)
import java.util.Scanner;
public class study{
	public static void main(String args[]){
	     char days [] = {'월','화','수','목','금','토','일'};

    for (char s : days) {
    	System.out.print(s + "요일 ");
	}
	}
}

// 비정방향 배열 생성 예제 (기본)
public class study{
	public static void main(String args[]) {
		int intArray[][] = new int [4][]; // 각 행의 레퍼런스 배열 생성
		intArray[0] = new int [3]; // 첫째 행의 정수 3개의 배열 생성
		intArray[1] = new int [2]; // 둘째 행의 정수 2개의 배열 생성
		intArray[2] = new int [3]; // 셋째 행의 정수 3개의 배열 생성
		intArray[3] = new int [2]; // 넷째 행의 정수 2개의 배열 생성
		
	for(int i =0; i < intArray.length; i++) { // 행에 대한 반복
		for(int j=0; j< intArray[i].length; j++) // 열에 대한 반복
			intArray[i][j] = (i + 1)*10 + j;
	}
	
	for(int i =0; i < intArray.length; i++) {
		for(int j=0; j< intArray[i].length; j++)
			System.out.print(intArray[i][j] + " ");
		System.out.println();  // 다음줄로 넘어가기 
	 }
	}
}

//정수 4개를 가지는 1차원 배열을 생성과 동시에 1,2,3,4로 초기화 하고, 배열을 리턴하는 makeArray()를 작성하고 
//이 메소드로 부터 배열을 전달받아 값을 출력하라
 
public class study{
	static int[] makeArray() { // 정수형 배열을 리턴하는 메소드
		int temp [] = new int [4]; // 배열 생성 
		
		for (int i = 0; i < temp.length; i++) {
			temp [i] = i + 1; // 배열의 원소를 0, 1, 2, 3으로 초기화 
		}
		
		return temp; // 배열 리턴 
	}
	
	
	
	public static void main(String args[]) {
		int intArray[]; // 배열 래퍼런스 변수 선언 
		intArray = makeArray(); // 매소드로부터 배열 전달받음 
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " "); // 배열 모든 원소 출력
		}
	
	}
}*/

// 메소드를 사용하여 비정방형 배열을 생성해라.
// 0 1 2 3
// 4
// 5
// 6 7 8 9
public class study{
	public static void main(String args[]) {
		int temp [][] = new int [4][];
		temp [0] = new int [4];
		temp [1] = new int [1];
		temp [2] = new int [1];
		temp [3] = new int [4];
		
		int a = 0;
		
		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < temp[i].length; j++) {
				temp [i][j] = a;
				a++;
				System.out.print(temp[i][j] + " ");
			}
			System.out.println();
		}
	}
		
}


