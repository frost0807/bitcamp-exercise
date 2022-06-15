package ex_220615;

import java.util.Scanner;

public class UtilScanner {
	public static int nextInt(Scanner sc,int min,int max) {
		System.out.print(">");
		int result=sc.nextInt();
		while(result<min||result>max) {
			System.out.println("잘못된 범위의 값입니다. 다시 입력해주세요");
			result=sc.nextInt();
		}
		return result;
	}
	
	public static int nextInt(Scanner sc) {		
		System.out.print(">");
		int result=sc.nextInt();
		return result;
	}
	
	public static String nextLine(Scanner sc) {
		System.out.println(">");
		sc.nextLine();
		String result=sc.nextLine();
		return result;
	}
}
