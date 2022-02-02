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

// 5개의 정수를 배열에 저장 후 합계를 출력하라
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
		
        int counter[] = new int[4]; // 배열에 담겨있는 숫자의 종류(1,2,3,4)개수만큼 크기의 배열 선언 *숫자마다 개수를 카운팅 목적
        int answer [] = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2}; // 배열에 숫자 저장
        
        // 숫자 종류 개수 카운팅 반복문         
        // 예) {2,3,3}    2 = 1개, 3 = 2개
           for(int i = 0; i < answer.length; i++) { // 검토할 배열의 길이 까지 처음부터 반복(검사)
        	counter[answer[i]-1]++; // answer배열의 i위치에 있는 값에(1,2,3,4 중 하나) -1을 하고(0,1,2,3 중 하나) 그 값이 곧 counter배열의 위치를 나타냄으로 1증가(카운팅)
        }       
        
        // 출력 반복문
        for(int i = 0; i < counter.length; i++) {  // 담겨 있는 숫자 4가지(1,2,3,4) 모두 검사해야하므로 카운터 변수 길이(4) 만큼 반복
        	System.out.print((i + 1) + "의 개수만큼 별 찍기 : "); // i+1(1,2,3,4 순)
        	for(int a = 0; a < counter[i]; a++) { // counter[i]만큼(카운팅 횟수) '*' 출력
        		System.out.print("*");
        	}
        	   System.out.println();  //1,2,3,4 각각 검토 후 출력 마무리에 줄 바꿈
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
        	answer [i] = scanner.nextInt(); // 1~4 숫자를 입력 후 anwer배열 i위치에 저장
        	counter[answer[i]-1]++; answer배열의 i위치에 있는 값에(1,2,3,4 중 하나) -1을 하고(0,1,2,3 중 하나) 그 값이 곧 counter배열의 위치를 나타냄으로 1증가(카운팅)
        }       
         
        // 출력 반복문
        for(int i = 0; i < counter.length; i++) {  // 담겨 있는 숫자 4가지(1,2,3,4) 모두 검사해야하므로 카운터 변수 길이(4) 만큼 반복
        	System.out.print((i + 1) + "의 개수만큼 별 찍기 : "); // i+1(1,2,3,4 순)
        	for(int a = 0; a < counter[i]; a++) { // counter[i]만큼(카운팅 횟수) '*' 출력
        		System.out.print("*");
        	}
        	   System.out.println();  //1,2,3,4 각각 검토 후 출력 마무리에 줄 바꿈
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
// 단 배열에는 같은 숫자가 없도록 배열을 출력해라
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
	    	 
	    	 if(i>1) { // 첫번째 랜덤정수는 중복이 없으니 저장하고 2번째 정수부터 중복 검사 시작
	    	     for(int j = 0; j < i; j++) { // 저장되어있는 배열 첫번째 부터(초기값 0) i(가장 최근 배열공간)까지 검사 
	    		     if(arr [i] - arr[j] == 0) // 저장할 랜덤정수값과 기존에 저장되어있는 배열 중복 검사(0부터 최근까지 / j=0, 순차적으로 증가 j++))
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
}
// 위 문제 개선 버전
import java.util.Scanner;
public class study {
	public static void main(String args []){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("저장할 정수의 개수를 입력 하시오 >>> ");
		
	    int save = scanner.nextInt();  // 배열의 크기를 키보드로 입력 받고 저장할 변수.
	    int arr [] = new int[save];  // 배열 생성, 크기는 이전에 입력 받았던 save 변수만큼.
	    
	    //랜덤정수 배열에 저장 반복문
	    for(int i = 0; i < arr.length; i++) {
	    	 arr[i] = (int) (Math.random()* 100 + 1);// 1부터 100까지 랜덤한 정수를 arr 배열에 순차적으로 저장
	    	 
	    	     for(int j = 0; j < i; j++) { // 저장되어있는 배열 첫번째 부터(초기값 0) i(가장 최근 배열공간)까지 검사 
	    		     if(arr [i] - arr[j] == 0) // 저장할 랜덤정수값과 기존에 저장되어있는 배열 중복 검사(0부터 최근까지 / j=0, 순차적으로 증가 j++))
	    		       i--; //만약 검사도중 중복된 수가 발견되면 반복 횟수 증가 없음(i--)
	    		       continue;  // 중복시 반복문 첫 줄로 다시 돌아가 랜덤한 정수 부여   
	    		 }
	    	     
	    	
	    	 System.out.print(arr[i] + " ");  // 출력 시작 
	    	 if (i%10 == 9 ) 	 // 10개 출력마다 줄 바꿈(9, 19, 29, 39는 일상 수학에서는 10 20 30 40 이다.)
		    	System.out.println();
	    }	    
   }
}
// 4*4 배열안에 1부터 10까지의 랜덤한 정수를 저장하고 출력.
public class study{
	public static void main(String args []) {
		
		int arr [][] = new int[4][4];  // 4*4 배열 생성
		
		for (int i = 0; i < arr.length; i++) {   // 4행 반복
			for(int j = 0; j < arr[i].length; j++) { //4열 반복
				arr [i][j] = (int)(Math.random()*10 + 1); // 랜덤정수를  4*4배열에 저장
				System.out.print(arr[i][j]+ "  "); // 출력
				if(j % 4 == 3)  // 4개 출력시 마다 줄 바꿈
					System.out.println();
			}
		}
	}
}
//4*4 배열안에 1부터 10까지의 랜덤한 정수 10개를(중복 가능) 임의의 위치에 저장하고 나머지 6개의 공간은 0(기본)이 저장된 배열을 출력.
public class study{
	public static void main(String args []) {
		
		int arr [][] = new int[4][4];  // 4*4 배열 생성
		int count = 0;  // 10까지 저장할 정수형 변수 생성
				
		//무한반복을 위하여 while(true) 사용
			while(true){  
					int i = (int)(Math.random()*4 + 0);  // 0부터 4까지의 행 위치를 랜덤하게 지정
					int j = (int)(Math.random()*4 + 0);  // 0부터 4까지의 열 위치를 랜덤하게 지정
					//랜덤 숫자 삽입문
				if (arr[i][j] == 0) {  //아무것도 저장되어있지 않으면  
					arr [i][j] = (int)(Math.random()*10 + 1);	//랜덤 숫자를 저장			
					count++; //이후 카운터증가
					if (count == 10)   //만약 저장횟수가 10번이 도래했다면
						break;  //강제 중지
				}
			}
		
		// 2차원 배열 출력 반문
		for (int i = 0; i < arr.length; i++) {   // 행 출력 반복
			for(int j = 0; j < arr[i].length; j++) { //열 출력 반복
				System.out.print(arr[i][j]+ "   "); // 4 * 4 배열 출력
				if(j % 4 == 3)  // 4개 출력시 마다 줄 바꿈
					System.out.println();
			}
		}
	}

// 반복문을 이용하여 3,6,9 게임에서 박수를 출력하는 경우를 순서대로 출력(1부터 99까지만)  
public class study{
	public static void main(String args[]) {
		
	    // 박수 칠 숫자를 식별 후 저장하는 반복문 
		for(int i = 1; i < 100; i++) {    // 1부터 99까지 반복
			int count = 0; // 박수 횟수 저장 변수 선언(반복 후 초기화 -> 0)
			
			if(i / 10 % 3 == 0) // 10의 자리 숫자 3,6,9 판별
				count++; // 박수 1회 증가
			if(i % 10 % 3 == 0) // 1의 자리 숫자 3,6,9 판별
				count++; // 박수 1회 증가
			
			// 박수 횟수만큼 출력
			if(count == 1)  
				System.out.println(i + " 박수 짝 \n");
			else if(count == 2) 
				System.out.println(i + " 박수 짝짝 \n");		
		}
	}
}
// 과목과 점수가 서로 짝을 이루도록 배열을 선언한 후 과목명을 입력 받으면 점수를 출력해라, "그만"을 입력 받으면 종료한다.
// 예) java >> 95점
import java.util.Scanner;
public class study{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};  // 과목 배열 선언 (크기 5)
		int score [] = {95, 88, 76, 62, 55}; // 점수 배열 선언 (크기 5)
		
		//무한 반복
		while(true) { 
			System.out.print("과목 이름 >>> ");
			String name = scanner.next();	
			
			for(int i =0; i < course.length; i++) {    //과목명을 입력 받고 기존 과목명 길이(5)만큼 일치 여부 확인(반복)
		    	if(course[i].equals(name)) // 만약 입력 과목명과 기존 과목명이 동일할 경우
		    		System.out.println(name + "의 점수는 " + score[i]); // 출력   	
			}  
			// for문 탈출 
			
			
			if(name.equals("그만")) {  // "그만" 이라는 키보드 입력시 강제 종료(break) 
		        System.out.print("프로그램을 종료합니다.");
		    	break;	
		    	}
		    	  
			else  // 그 외 다른 입력 값이 올 경우 "없는 과목"출력 후 무한 반복문 계속 진행
	    		System.out.println("없는 과목입니다.");
	    		
		}
	}
}

// 2개의 정수를 입력받아 두 정수의 곱을 출력. try-catch를 사용하여 정실수형을 입력 받는 경우에도 예외 없이 다시 입력받아 출력. 
// 예) 2.5  6  >> "실수는 입력이 불가합니다"      2  7  >> 14
import java.util.Scanner;
import java.util.InputMismatchException;  // 예외 처리를 선언해줘야 한다
public class study{
	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);
	
		int n =0, m = 0;
		
	for(int i = 0; i < 1; i++) {	
		System.out.print("곱하고자 하는 두 수 입력>>");

		try {   // 예외의 경우가 올법한 문장은 try안에 넣어준다.
			n = scanner.nextInt(); // 정수값이 아닌 실수형(예)3.4)을 입력할 경우
			m = scanner.nextInt();
		}

		catch (InputMismatchException e) {  // "InputMismatchException"경고 메세지가 나올터이니 밑에 코드를 실행한다
			System.out.println("실수는 입력하면 안됩니다."); // 재입력 안내 후
			scanner.nextLine(); // Scanner에 이미 입력된 키를 모두 제거하고
			i--; // 인덱스 값을 하나 차감한다.
			continue;
		}
		System.out.print(n + " x " + m + " = " + n * m);
		scanner.close();
	}
	
  } 
}

import java.util.Scanner;

class Rectangle{
	int width;
	int height;
	public int getArea() {
		return width * height;
	}
}

class study{
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가로 변 길의 >>");
		rect.width = scanner.nextInt();
		
		System.out.println("세로 변 길이 >> ");
		rect.height = scanner.nextInt();
		
		System.out.print("사각형의 넓이는 " + rect.getArea());
		scanner.close();
		
	}
}

class Circle{
	int radius;
	String name;
	
	public Circle() {
		radius = 1; 
		name = "";
	}
	
	public Circle(int r, String n) {
		radius = r; 
		name = n;
	}
	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class study{
	public static void main(String[] args) {
		Circle pizza = new Circle(10, "자바피자");
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}


import java.util.Scanner;
class Human{
	String name;
	int age;
	double height, weight;
	
	public Human(String name) {
		this.name = name;
	}
	public Human(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}		
}

public class study{
	public static void main(String [] args) {		
		Scanner scanner = new Scanner(System.in);
		Human aHuman = new Human("홍길동");
		Human [] HumanArr = new Human[5];
		
		aHuman.age = 21;
		aHuman.height = 180.5;
		aHuman.weight = 73.2;
		
		for(int i = 0 ; i < HumanArr.length; i++) {
			
			System.out.print(i+1+"번째 사람의 이름은 ??  >>> ");
		    String name = scanner.next();
			System.out.print(i+1+"번째 사람의 나이는 ??  >>> ");
			int age = scanner.nextInt();
			System.out.print(i+1+"번째 사람의 신장은(cm) ?? >>> ");
			double height = scanner.nextDouble();
			System.out.print(i+1+"번째 사람의 몸 무게는??(kg) ?? >>> ");
			double weight = scanner.nextDouble();
			System.out.println();
			HumanArr[i] = new Human(name, age, height, weight);
		}
		
		for(int i = 0; i < HumanArr.length; i++) {
			System.out.println("\n"+i+"번째 사람의 정보 \n이름 : "+ HumanArr[i].name +"\n나이  : "
		              + HumanArr[i].age + "\n신장 : "+ HumanArr[i].height + "\n몸무게 : "+ HumanArr[i].weight);
		}
		scanner.close();
	}
}

import java.util.Scanner;

class CurrencyConverter {
	private static double rate;
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar * rate;
	}
	public static void setRate(double r) {
		rate = r;
	}
}

public class study{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("환율 (1달러) >> ");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다.");
		
		System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "원입니다.");
		scanner.close();
	}
}

public class study{
	int s;
	static int t;
	public static void main(String [] args) {
		study.t = 10;
		study.s = 20;
		study obj = new study();
		obj.s = 30;
		obj.t = 40;
		System.out.println(obj.s);
		System.out.println(obj.t);
	}
}

class TV{
	String name;
	int year;
	int inch;
	
	public TV(String name, int year, int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;
	}
	void show() {
		System.out.print(name + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}

public class study{
	public static void main(String [] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}

// Grade(성적) 클래스를 작성한다. 3과목의(수학, 과학 ,영어) 점수를 입력 받아 객체생성 후 평균을 출력
import java.util.Scanner;

class Grade{
	private int math, science, english; // 점수(수학, 과학, 영어) 필드 생성
	
	
	// 생성자 생성(매개변수와 맴버의 이름이 동일하므로 this로 초기화)
	public Grade(int math, int science, int english){ 
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	// 과목의 평균값을 돌려주는 메소드 생성
	public double average(){
		return (math + science + english) / 3;
	}
}

class study {
public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("수학,과학, 영어 순으로 3개의 점수 입력 >> "); 
	
	int math = scanner.nextInt();
	int science = scanner.nextInt();
	int english = scanner.nextInt();
	
	Grade me = new Grade(math, science, english); // me(Grade 클래스) 객체 생성(3개의 매개변수 전달) 
	System.out.println("평균은 " + me.average());  // me의 메소드 호출(average)후 출력 
	scanner.close();
 }
}

//노래 한 곡을 나타내는 Song 클래스를 작성해라 
class Song{
	String title, artist, country;  // 제목, 가수, 나라 필드(맴버) 생성
	int year; // 년도 필드 생성
	
	public Song(){}; // 기본 생성자 생성
	
	
	// 매개변수로 모든 필드를 초기화 하는 생성자 작성 (this를 사용하여 초기화)
	public Song(int year, String country, String artist, String title)  {
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
	}
	
	// 노래의 정보를 출력하는 메소드 작성
	public void show() {
		System.out.print(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
}

public class study{
	public static void main(String [] args ) {
		Song music = new Song(1987, "스웨덴", "ABBA", "Dancing Queen");  
		
		music.show();
	}
}

// x,y 좌표와 가로, 높이 필드로 구성되어있는 직사각형클래스를 작성하고 
// 서로 비교하여 면적을 출력하는 프로그램 작성(단 비교하는 두 직사각형의 변이 하나라도 겹치면 포함 개념 x)
class Rectangle{
	int x, y, width, height;
	
	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square(){
		return width * height;
	}
	
	boolean contains(Rectangle r) {
	    if ((this.x < r.x) && (this.y < r.y) &&
	    	(this.x + this.width > r.x + r.width) && (this.y + this.height > r.y + r.height))
	    	return true;
	    else 
	    	return false;
		}
	
	void show() {
		System.out.println("(" + x + "," + y + ") 에서 크기가 " + width + " x " + height + "인 사각형");
	}
}

public class study{
	public static void main(String args[] ) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은 " + s.square());
		
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	}
}


//3개의 원 [객체 배열]을 만들고 x, y, radius, 값을 읽어 3개의 [원 객체]를 만들고 show()를 이용하여 모두 출력
import java.util.Scanner;

class Circle{
	private double x, y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.printf("(%.2f, %.2f) %d \n", x, y, radius);
	}
}

public class study{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c [] = new Circle[3];
		
		for(int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		for(int i = 0; i < c.length; i++)
			c[i].show();
		scanner.close();
	}
}

import java.util.Scanner;

class Circle{
	private double x, y;
	private int radius; 

	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	
	public void show() {   // Circle 클래스의 메소드
		System.out.printf("(%.1f,%.1f)%d%n", x, y, radius);  
	}

    // 반지름이 가장 큰 배열의 번지수를 return함
	static int biggest(Circle[] a) {
		if(a[0].radius>a[1].radius&&a[0].radius>a[2].radius) return 0;   
		else if (a[1].radius>a[0].radius&&a[1].radius>a[2].radius) return 1;
		else return 2;
	}
}

public class study{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c [] = new Circle[3];  // Circle 객체인 c를(크기는 3) 선언
			for(int i=0; i<c.length; i++) { //  c객체의 크기(3)만큼 반복
				System.out.print("x, y, radius >> ");    
				double x = scanner.nextDouble();  // x 좌표 저장
 				double y = scanner.nextDouble();  // y 좌표 저장
				int radius = scanner.nextInt();   // 반지름 저장
				c[i] = new Circle(x,y,radius);     // 객체배열 c[] 안에 객체 3개 생성

			} 

			System.out.print("가장 면적이 큰 원은 ");          
			c[Circle.biggest(c)].show();    // c배열의 인덱스번호를 리턴받아 show() 메소드 출력. (static 이므로 > "클래스명." 으로  접근)   
			
			scanner.close();
		}
}

// 하루의 할 일을 표현하는 클래스 Day를 작성하고 입력, 보기, 끝내기 메소드를 생성하여 스캐줄 관리 프로그램을 작성 해라
import java.util.Scanner;

// 하루 일과를 저장하고 출력하는 클래스 생성
class Day {
	private String work; // 하루의 할 일을 나타내는 문자열
	
	public void set(String work) {
		this.work = work; 
	}
	public String get() {
		return work;  
	}
	public void show() {     // 저장된 스캐줄이 없으면 "없음", 있으면 "스캐줄 입니다" 출력 하는 메소드 생성
		if(work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

// 당월 스캐줄을 입력, 보기, 끝내기 기능으로 관리할 수 있는 클래스 생성
class MonthSchedule{	
	Scanner scanner = new Scanner(System.in);
	
	 int max_day;  // 그 달의 최대 일수를 저장하는 변수 선언  예) 4월 == 30일이 최대 
     Day day [];  // 하루일과를 저장하는 Day 클래스 객체 선언 
	
     // 1개의 매개변수(최대 일수)를 받을시 동작하는 생성자 선언
	 MonthSchedule(int max_day) {  
		this.max_day = max_day;
		day = new Day [max_day]; // 최대 일수(매개변수 max_day)크기의 Day 객체 선언 
		for(int i = 0; i < day.length; i++) 
			day[i] = new Day(); // i 번째 Day 객체 생성
	}
	//스캐줄 관리 프로그램 메소드. (입력, 보기, 끝내기)를 사용하는 반복 메소드
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		
		// 무한 반복 진행
		while(true) {
		System.out.print("스케줄 (입력 : 1, 보기 : 2, 끝내기 : 3) >>> "); // 선택 숫자 입력(입력 숫자의 따라서 동작될 메소드 지정)
		int choice = scanner.nextInt();
		// 입력받은 숫자가 [1 == 입력, 2 == 보기, 3 == 끝내기]
		if(choice == 1)
			input();
		else if (choice == 2) 
			view();
		else if(choice == 3) {
		    finish();
		    break;
		  }
		
	    }
	}
	// run()에서 1입력시 스케줄을 Day객체 배열에 저장하는 메소드
	public void input() {
	     System.out.printf("스케줄을 기록할 일자 입력(1~ %d) >> ", max_day); // 1 ~ ?(매개변수 max_day) 범위 내의 숫자(날짜) 입력
		 int schedule_days = scanner.nextInt();
		 
		 System.out.print("계획한 스케줄(빈칸 없이 입력) >> "); // 스케줄 입력 (문자열)
		 String work = scanner.next();
		 
		 day[schedule_days - 1 ].set(work); // 날짜(배열 번호)에(.) set(입력한 스케줄) 저장
	}
	// run()에서 2입력시 저장한 스케줄을 보여주는 메소드
	public void view() {
		System.out.printf("기록한 스케줄을 확인할 일자 입력(1~ %d) >> ", max_day);
		int view_days = scanner.nextInt();
		
		System.out.printf("%d의 스케줄은", view_days);
		day[view_days - 1].show(); // dat[입력 날짜]의 스캐줄을 보여주기(printf)
	}
	// run()에서 3입력시 프로그램을 종료하는 메소드
	public void finish() {
		System.out.print("프로그램을 종료합니다.");
		scanner.close();
	}
	
}
// 메인 메소드
public class study{
	public static void main(String [] args) {
		MonthSchedule april = new MonthSchedule(30); // april이라는 월 스캐줄 객체 선언과 동시에 매개변수 값인 30(일자 최대 범위)을 전달
		april.run(); // run메소드 실행
	}
}



class Point{
	private int x, y;   // 한 점을 구성하는 x, y 좌표
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {  // 점의 좌표 출력
		System.out.printf("(%d, %d) \n" ,x ,y);
	}
}

class ColorPoint extends Point{  // Point를 상속받은 ColorPoint 선언
	private String color;  // 점의 색
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class study{
	public static void main(String [] args) { 
		Point p = new Point(); // Point 객체 생성
		p.set(1,2); // Point 클래스의 set() 호출
		p.showPoint();
		
		ColorPoint cp = new ColorPoint(); // ColorPoint 객체 생성
		cp.set(3,4); // point 클래스의 set() 호출
		cp.setColor("red"); // ColorPoint 클래스의 setColor() 호출
		cp.showColorPoint(); // 컬러와 좌표 출력
	}
}


class Point{
	private int x, y; // 한 점을 구성하는 x, y 좌표
	
	public Point() {
		this.x = this.y = 0;
	}
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() { // 점의 좌표 출력
		System.out.printf("(%d, %d) \n" , x, y);
	}
}

class ColorPoint extends Point{ // Point를 상속받은 ColorPoint 선언
	private String color; // 점의 색 
	
	public ColorPoint(int x, int y, String color) {
		super(x,y); // Point의 생성자 Point(x, y) 호출
		this.color = color;
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint() 호출
	}
}

public class study{
	public static void main(String [] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();
	}


interface MouseDriver{
	final int BUTTONS = 3;
	int VERSION;
	void move();
	public int click();
	protected int out();
	static public void drag();
	default void drop() { System.out.println("drop");}
}




class Pen { // 모든 펜의 공통 속성
	private int amount; // 남은 량

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}

class SharpPencil extends Pen { // 샤프펜슬
	private int width; // 펜의 굵기
}

class Ballpen extends Pen { // 볼펜
	private String color; // 볼펜의 색

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

class FountainPen extends Ballpen { // 만년필
	public void refill(int n) {
		setAmount(n);
	}

class A {
	   public A() { System.out.println("A"); }
	   public A(int x) { System.out.println("A: " + x); }
	}
	class B extends A {
	   public B() { super(100); }
	   public B(int x) { System.out.println("B: " + x); }
	}
	public class study {
	   public static void main(String[] args) {
	      B b = new B(11);
	   }
	}


abstract class OddDetector {
	protected int n;

	public OddDetector(int n) {
		this.n = n;
	}

	public abstract boolean isOdd(); // 홀수이면 true 리턴
}

public class study extends OddDetector {
	public study(int n) {
		super(n);
	}

	public boolean isOdd() { // 이부분을 추가
		if (n % 2 == 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		study b = new study(10);
		System.out.println(b.isOdd());
	}
}


abstract class Shape {
	public void paint() {
		draw();
	}

	abstract public void draw();
}

class Circle extends Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("반지름 = " + radius);
	}
	double getArea() {
		return 3.14 * radius * radius;
	}
}

public class study{
	public static void main(String [] args) {
		Circle p = new Circle(10);
		p.paint();
	}
}


interface Device{
	void on();
	void off();
}
public class study implements Device{
	public void on() {
		System.out.println("켜졌습니다.");
	}
	public void watch() {
		System.out.println("방송중입니다.");
	}
	public void off() {
		System.out.println("종료합니다.");
	}
	
	public static void main(String [] args) {
		study myTV = new study();
		myTV.on();
		myTV.watch();
		myTV.off();	
	}


class TV{
	private int size;
	public TV(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV{
	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	protected int getColor() {
		return color;
	}
	
	public void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");	
	}
}

class IPTV extends ColorTV{
	private String IP_adress;
	
	public IPTV(String IP_adress, int size, int color) {
		super(size, color);
		this.IP_adress = IP_adress;
	}
	
	public void printProperty() {
		System.out.printf("나의 IPTV는 %s 주소의 %d인치 %d컬러", IP_adress, getSize(), getColor());
	}
}


public class study{
	public static void main(String [] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 1024);
		iptv.printProperty();
	}
}



import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src); // 추상 메소드
	abstract protected String getSrcString();  // 추상 메소드
	abstract protected String getDestString();  // 추상 메소드
	protected double ratio; // 비율
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 비꿉니다.");
		System.out.println(getSrcString() + "을 입력하세요 >> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과 : " + res + getDestString() + "입니다");
	
	}
}

class Won2Dollar extends Converter{
	private int dollar;
	
	protected String getSrcString() {
		return "원";
	}
	protected String getDestString() {
		return "달러";
	}
	protected double convert(double src) {
		return src / dollar;
	}
			
	public Won2Dollar(int dollar) {
		this.dollar = dollar;
	}
}

class Km2Mile extends Converter{
    private double mile;
	
	protected String getSrcString() {
		return "Km";
	}
	protected String getDestString() {
		return "mile";
	}
	protected double convert(double src) {
		return src / mile;
	}
			
	public Km2Mile(double mile) {
		this.mile = mile;
	}
}

public class study {
	public static void main(String [] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run();
		
		Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
		toMile.run();
	}
}
// 
class Point {
	private int x, y;
	
	public Point(int x, int y) {
	this.x = x;
	this.y = y;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	protected void move (int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point{
	
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void setXY(int x, int y) {
		move(x,y);
	}
	
	public String setColor(String color) {
		this.color = color;
		return color;
	}
	
	public String toString() {
		return setColor(color) + "색의 " + "(" + getX() + "," + getY() + ")" + "의 점";
	}
}


public class study {
	public static void main(String [] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");	
	}
}



import java.util.Scanner;

abstract class Clac{
	public int a;
	public int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	protected abstract int calculate();
}

class Add extends Clac{
	
	public Add(int a, int b) {
		setValue(a,b);
	}
	public int calculate() {
		return a + b;
	}
}

class Sub extends Clac{
	
	public Sub(int a, int b) {
		setValue(a,b);
	}
	
	public int calculate() {
		return a - b;
	}
}

class Mul extends Clac{
	
	public Mul(int a, int b) {
		setValue(a,b);
	}

	public int calculate() {
		return a * b;
	}
}

class Div extends Clac{
	
	public Div(int a, int b) {
		setValue(a,b);
	}
	public int calculate() {
		return a / b;
	}
}




public class study {
	public static void main(String [] args ) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		Clac x;
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		char Giho = scanner.next().charAt(0);

		if(Giho == '+') {
			x = new Add(a, b);
			System.out.print(x.calculate());
		}
		else if(Giho == '-') {
			x = new Sub(a, b);
			System.out.print(x.calculate());
		}
		else if(Giho == '*') {
			x = new Mul(a, b); 
			System.out.print(x.calculate());
		}
		else if(Giho == '/') {
			x = new Div(a, b); 
			System.out.print(x.calculate());
		}
		
		
	
	}
}

public class study {
	public static void main(String[] args) {
		java.util.StringTokenizer st = new java.util.StringTokenizer("a=3,b=5,c=6",",=");
		int sum = 0;
		while (st.hasMoreTokens()) {
			String next = st.nextToken();
			try { // 문자로 된 숫자를 sum에 중첩저장하고 출력 
				sum += Integer.parseInt(next);
				System.out.println(next);
			}  
			catch(NumberFormatException e) { // 문자열이 숫자와 일치하지 않는 타입의 숫자로 변환시 오류 선언 후 출력만 실행
				System.out.println(next);
			}
		}
		System.out.println("합은 "+sum); // 남은 토큰이 없으면 반복문 탈출 후 출력
	}
} 

public class study {
	private int x, y, radius;
	
	public study(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle(" + x + "," + y + ") 반지름" + radius;
	}
	public boolean equals(Object obj) {
		study p = (study)obj;
		if(x == p.x && y == p.y)
			return true;
		else
			return false;
	}
	public static void main(String [] args) {
		study a = new study(2, 3, 5);
		study b = new study(2, 3, 40);
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.equals(b)) System.out.println("같은 원");
		else System.out.println("다른 원");			
	}
}
*/
