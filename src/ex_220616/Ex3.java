package ex_220616;

import java.util.Scanner;

public class Ex3 {
	
	public static final int MIX_SCORE=0;
	public static final int MAX_SCORE=0;
	public static final int STUDENT_NUMBER=5;
	
	public static Student2[] array;
	public static Scanner sc;
	public static int index;

	public static void main(String[] args) {
		while(true) {
			init();
			
			showMenu();
			
			sc.close();
		}
	}
	public static void init() {
		array=new Student2[0];
		sc=new Scanner(System.in);
		index=0;
	}
	public static void showMenu() {
		System.out.println("성적관리 프로그램입니다. 1입력 2출력 3종료");
		int userChoice=UtilScanner.nextInt(sc);
		if(userChoice==1) {
			if(index>=4) {
				System.out.println("6명이상의 정보를 입력할 수 없습니다.");
			} else {
				Student2 s=new Student2();
				array[index]=s;
				System.out.println("이름을 입력해주세요");
				s.setName(UtilScanner.nextLine(sc));
				System.out.println("국어점수를 입력해주세요");
				s.setKorean(UtilScanner.nextInt(sc));
				System.out.println("수학점수를 입력해주세요");
				s.setEnglish(UtilScanner.nextInt(sc));
				System.out.println("영어점수를 입력해주세요");
				s.setMath(UtilScanner.nextInt(sc));
			} else if(userChoice==2) {
				System.out.println("");
			}
			}
	}
}