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
	
// 과제 P : 5개의 데잍를 갖는 num 배열에서 각 데이터(수)만큼 '@'를 출력
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

// 과제 Q : 사용자로부터 자연수를 5개 입력받아 받은 데이터 수 만큼 '@'를 출력
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
}

// 메소드를 사용하여 비정방형 배열을 생성해라.
// 0 1 2 3
// 4
// 5
// 6 7 8 9
public class study{
	static int [][] makeArr() { // 2차원 배열 리턴 하는 메소드 생성 
		int temp [][] = new int [4][]; // 행 4개인 비정방향 배열 생성
		temp [0] = new int [4];
		temp [1] = new int [1];
		temp [2] = new int [1];
		temp [3] = new int [4];
		
		int num = 0; // 순차적으로 대입될 초기값 
		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < temp[i].length; j++) {
				temp [i][j] = num++; // 0~9까지의 값 생성 
			}
		}
		return temp;
	}
	
		
	public static void main(String args[]) {
		int arr [][];
		arr = makeArr();  // 메소드로부터 배열 전달 받음 
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}	
}
// try-Catch 예제 

public class study{
	public static void main(String args []) {
		int intArr [] = new int [5];
		
		intArr[0] = 0;
		
		try {
			for(int i = 0; i < 5; i++) {
				intArr[i+i] = i + 1 + intArr[i]; // i = 4인경우 예외 발생.
				System.out.println("intArr[" + i + "]" + "=" + intArr[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}
}

// 카드 번호 맞추기 게임(up & down) 0~99까지의 임의의 수를 가진 수를 숨기고 수를 맞추는 게임. 
// 게임을 반복하기 위해 y/n를 묻고 n일경우 종료 시킨다.
// 예) 숨긴숫자(87) / 게임 시작 :  44 >> up.   80 >> up.   87 맞았습니다. 

import java.util.Scanner;  // 스캐너 클래스 사용 가능
import java.util.Random;   // 랜덤 클래스 사용 가능

public class study{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {  // 반복문 생성 (true)를 사용하여 무한반복 진행
		Random r = new Random();
		
		// 한 게임이 끝나면 변경된 변수값들을 초기화 시켜야 함으로 첫 반복문에  초기값 지정 
		int n = r.nextInt(100); // 0~99까지의 임의의수 생성 후  'n'변수의 저장
		int x = 0, y = 99; // 수의 범위를 담아줄 변수 x(최저값), y(최대값) 선언
		int count = 1; // 도전 횟수를 담을 count 변수 선언
		
		System.out.println("숨어있는 숫자를 찾아 보세요!");   // 첫 게임 진행
		System.out.println(x +"에서 ~ "+ y+"사이의 숨어있습니다."); // 최소값(x) ~ 최대값(y) 안내
		System.out.print(count +"번째 도전! >> ");
		
	    int num = scanner.nextInt(); // 첫 탐색 숫자 num 변수의 저장
		while(num != n) { // num과 n이 같아지면 탈출.  num과 n이 같지 않으면 반복
			count ++; // 이 반복문으로 들어오는 순간 2번째 도전이므로 count 증가
			
			if(num > 0 && num < n){ // 도전(탐색)숫자가 0보다 크고, 숨은 숫자(랜덤 수)보다 작으면 실행
		    	System.out.println("UP! \n"); // 숨겨진 숫자는 도전 숫자보다 위에있음을 알림
		    	if(num > x ) // 범위 외 (안내된 최저값 보다 적은) 숫자를 입력시 x값 수정없음.
			    	x = num;
		    }
		    else if(num < 100 && num > n) {
		    	System.out.println("DOWN! \n");
		    	if(num < y ) // 범위 외 (안내된 최대값 보다 큰) 숫자를 입력시 y값 수정없음.
		    	y = num; // 탐색 숫자의 최대값이 갑소되면 y(최대값)수정
		    }
			
			System.out.println(x +"에서 ~ "+ y +"사이의 숨어있습니다."); // 수정된 최소값 ~ 최대값 안내
			System.out.print(count +"번째 탐색 숫자는 >> ");
		    num = scanner.nextInt(); // 숫자를 찾지 못했음으로 다시 도전.
		}
		//첫 반복문 탈출(숫자 찾기 성공), 2번째 반복문(게임실행중) 진행중
	   System.out.println("\n축하합니다 " +count+"번 도전 끝에 숨겨진 숫자를 찾았습니다!!");
	   System.out.print("숫자 찾기 게임을 다시 진행 하시겠습니까? (y/n) >>> "); // 게임 종료 여부 확인
	   String text = scanner.next(); // 종료여부 값 저장
	   if(text.equals("n")){ // 만약 "n"입력시 break문을 이용하여 게임종료(2번째 반복문 종료)
		   break;
	   }
		}
	  System.out.print("\n숫자 찾기 게임을 종료하겠습니다. \n다음에 또 이용해주세요!");
	}
}

// 164쪽 2번 실습 문제 
public class study{
	public static void main(String args[]) {
		int n [][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
		
		for (int i = 0; i < n.length; i++) {
			for(int j = 0; j < n[i].length; j++) {
			System.out.print(n[i][j] + " "); 
			}
			System.out.println(" ");
		}	
	}
}

// 정수를 입력 받고 받은 수만큼 '*'를 감소하면서 출력하여라
// 예) 3 
// * * *
// * *
// *
import java.util.Scanner;
public class study{
	public static void main(String args[]) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("정수를 입력하시오 >>> ");
	
	int num = scanner.nextInt(); // 정수값 받기
	int a = num; // 정수값 a에 저장
	
    while(a > 0){ // a가 0보다 크면 반복
		for(int i = 0; i < a; i++) {  // 0부터 a(입력받은 정수 값 / 반복 횟수)까지 반복
			System.out.print("*"); // '*' 출력
		}
		 System.out.println();
		 a--; // 반복 횟수 차감(입력 받은 수 차감
		 }
	}
}
// 소문자 알파벳을 하나 입력받고 a부터 그 알파벳까지 출력후 하나씩 감소하여 a만 출력되게 작성해라
// 예 ) 받은 알파벳 >> c    결과 :    abc   ab    a
import java.util.Scanner;
public class study{
	public static void main(String args[]) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("소문자 알파벳 하나를 입력하시오  >>>  ");
	
	String alphabet = scanner.next();
	
	char x = alphabet.charAt(0);  // 입력 받은 알파벳의 첫 글자 저장
	
    while(x >= 97){  // 숫자 97 == 문자 'a' 따라서 입력 받은 알파벳이 a(97)보다 크면 반복 
		for(int i = 97; i <= x; i++) { // a(97)부터 입력 받은 알파벳(97이상의 정수값)까지 순차적으로 출력
			System.out.print((char)j); // 정수형 => 문자형으로 강제 형변환
		}
		 System.out.println(); // 줄 바꿈
		 x--;  // 줄 바꿈 후 입력받은 알파벳(정수 값)-1
	}
	}
}

// 임의의 값이 저장되어있는 2차원 배열을 출력해라.
public class study{
	public static void main(String args[]) {
		
	int arr[][] = {
			{1,2,3}, 
			{4,5,6}
			};
	
	
	for(int i = 0; i < arr.length; i++  ){
		for(int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j] + " ");
		}
		 System.out.println(" ");
	}
	}
}

// 양의 정수 10개를 받아 배열에 저장하고 받은 정수 중에서 3의 배수만 출력
import java.util.Scanner;
public class study{
	public static void main(String args[]) {
	
	int arr [] = new int[10]; // 10개의 양의 정수르 받을 배열
	int multiple_3 [] = new int[10]; // 10개의 정수중에서 3의 배수를 담을 배열  *3의 배수인 정수의 최대 개수는 10개
		
	Scanner scanner = new Scanner(System.in);
	
	
	//입력 받기
	System.out.print("양의 정수 10개를 입력하시오 >>> ");
	for(int i  = 0; i < 10; i++) {
		arr [i] = scanner.nextInt(); // 양의 정수 10개 입력 받기 
	}
	
	System.out.print("3의 배수는 ");
	//출력 하기
	for(int j = 0 ; j < 10; j++){  // 10개 모두 3의배수 일수도 있으니 최대 10번 출력(반복)
			if(arr[j] % 3 == 0) { // 받은 정수들 중의 3으로 나눴을때 나머지가 0인(3의 배수) 정수들을
				multiple_3 [j] = arr[j];  // 멀티플3(3의배수) 배열에 집어 넣고
				System.out.print( multiple_3[j] + " "); // 출력 한다 
			}   // 만약 입력 받기 반복문 에서 조건(if)를 걸고 멀티플 배열에 넣으면 
		}       //출력하기 반복문에서 0인(3의배수가 아닌) 정수가 출력 되거나 반복문을 한번 더 사용 해야한다
	}
}

//배열과 반복문을 이용하여 정수로 된 액수를 받아 금액을(5만, 1만, 1천, 500, 100, 50, 10, 1)반환하는 프로그램 작성
// int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 환산할 돈의 종류
import java.util.Scanner;
public class study{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
		int [] remoney = new int[8]; // 환산한 돈의 개수를 담는 배열
		
		System.out.print("금액을 입력하시오 >>> ");
		int money = scanner.nextInt(); // 금액 받기
		
		// 받은 돈을 환산하는 반복문
	    for(int i = 0; i < unit.length; i++) { // 환산할 돈의 종류를 모두 검토해야 하기 때문의 unit배열의 크기만큼 반복
	    	remoney[i] = money / unit[i]; // 받은 돈을 환산할 돈의 크기가 큰 순서대로(5만원 부터 1원까지) 나눈 나머지를 거스름돈 배열에 저장
	    	money = money % unit[i]; // 받은 돈 나누기 환산할 돈의 나머지를 다시 받은 돈의 저장(환산할 돈은 차감하는 방식)
	    }
	    // 환산된 돈을 출력하는 반복문
	    for(int i = 0; i < remoney.length; i++){ // 거슬러줄 돈의 배열 크기 만큼 반복
	    	if(remoney[i] > 0) // 비어있는 배열은 제외(환산할 돈이 있는 금액 만) 
	    		System.out.println(unit[i]+"원 짜리 : " + remoney[i] + "개"); // 출력
	    }
	}
}
// 1부터 10까지 범위의 랜덤한 정수 10개를 배열안에 저장하고 숫자들의 평균값을 출력하여라.
public class study {
	public static void main(String args[]) {
		int sum = 0; // 숫자의 합계를 담을 변수 선언.
		
	    int arr [] = new int[10]; // 10개의 정수를 받을 배열
	    
	    System.out.print("랜덤한 정수들 : ");
	    
		for (int i = 0; i < arr.length; i++ ) {
		   arr [i] = (int)(Math.random()* 10 + 1);  // 배열 arr에 랜덤한 정수 삽입
		   System.out.print(arr[i] +  " "); // 정수 출력
		   sum += arr[i]; // 정수값들의 합계 
		}
		
		System.out.println("\n평군은 " + (float)sum/10);  // 10(배열 공간)으로 나누어 평균치 출력.
		
	}
}
// 정수를 몇개 저장할지 입력받아서(배열크기) 배열을 생성하고 1에서 100까지 범위의 정수를 랜덤하게 삽입하고 출력해라 
// 단 배열에는 같은 숫자가 없도록 배열을 출력해
// 예) 입력 >> 7      출력 >> 1 4 29 30 50 49 5
import java.util.Scanner;
public class study {
	public static void main(String args []){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("저장할 정수의 개수를 입력 하시오 >>> ");
		
	    int save = scanner.nextInt();  // 배열의 크기를 키보드로 입력 받고 저장할 변수.
	    int arr [] = new int[save];  // 배열 생성, 크기는 이전에 입력 받았던 save 변수만큼.
	    
	    //랜덤정수 배열에 저장 반복문
	    for(int i = 0; i < arr.length; i++) {
	    	 arr[i] = (int) (Math.random()* 100 + 1); // 1부터 100까지 랜덤한 정수를 arr배열에 순차적으로 저장
	    	 
	    	 if(i>1) { // 첫번째 랜덤정수는 저장하고 2번째 정수부터 중복 검사 시작
	    	     for(int j = 0; j < i; j++) { // 저장되어있는 배열 첫번째 부터(초기값 0) i(가장 최근 배열공간)까지 검사 
	    		     if(arr [i] - arr[j] == 0) // 가장 최근 랜덤정수값과 기존에 저장되어있는 배열 검사(0부터 최근까지 / j=0, 순차적으로 증가 j++))
	    		       i--;  //만약 검사도중 기존 저장 숫자와 같은 랜덤정수가 삽입됐으면 이전 단계로 이동(i--)
	    		 }
	    	 }
	    }
	    
	    // 저장된 정수값 출력 반복문
	    for(int i = 0 ; i < arr.length; i++) {
	    	 System.out.print(arr[i] + " ");
	    	 if (i%10 == 9 )  // 10개 출력마다 줄 바꿈(9, 19, 29, 39는 일상 수학에서는 10 20 30 40 이다.)
		    	System.out.println();	    
	    }
	    
	    
   }
}*/

public class study{
	public static void main(String args []) {
		
		int arr [][] = new int[4][4];
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr [i][j] = (int)(Math.random()*10 + 1);
				System.out.print(arr[i][j]+ "  ");
				if(j % 4 == 3)
					System.out.println();
			}
		}
	}
}











