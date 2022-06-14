package ex_220613;

import java.util.Scanner;

public class UtilScanner {

	public static int nextInt() { //버퍼가 비워진 nextLine
		Scanner sc=new Scanner(System.in);
		System.out.print(">");
		int result=sc.nextInt();
		sc.nextLine();
		return result;
	}
}
