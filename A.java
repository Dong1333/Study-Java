/*
public class A{
	public static void main(String[] args) {
		
		int i,f;
		
		for(i=1; i <= 15; i++)
		{   
			for(f=1; f <= i; f++)
			{
			System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}

public class A{
	public static void main(String[] args) {
		
		int f = 1;
		int i = 1;
		
		while(i <= 15) 
		{   
			while(f <= i)
			{
			System.out.print("*");
			f++;
			}
			f = 1;
			System.out.print("\n");
			i++;
		}
	}
}*/
import java.util.Scanner;
public class A {
	 public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 >>> ");
		
		int first_num = scanner.nextInt();
		int second_num = scanner.nextInt();
		int sum = 0;
		//조건 시작 초기값 없음
		for( ; first_num <= second_num; first_num++ ) {
		 	System.out.print(first_num);
		 	sum += first_num;
		    if(first_num < second_num) { // 두 수가 같아지면 출력 금지 
		    	System.out.print(first_num + "+");}
		    else if(first_num == second_num) { // 두 수가 같아지면 출
		 	    System.out.print(first_num + "=" + sum);}
		}
	 }
}


