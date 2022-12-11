package ex_220615_1;

import java.util.Scanner;
import ex_220615.*;

public class Ex5 {
	
	public static final int MIN_SCORE=0;
	public static final int MAX_SCORE=100;
	
	public static int index=0;
	public static Student[] array;
	public static Scanner sc;

	public static void main(String[] args) {
		init();
		
		showMenu();
		
		sc.close();
	}
	public static void init() {
		sc=new Scanner(System.in);
		array=new Student[0];
	}
	public static void showMenu() {
		while(true) {
			System.out.println("성적관리 프로그램입니다. 1.성적입력 2.성적출력 3.종료");
			int userChoice=UtilScanner.nextInt(sc,1,3);
			if(userChoice==1) {
				insert();
			} else if(userChoice==2) {
				printAll();
			} else if(userChoice==3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
	public static void insert() {
		Student s=new Student();
		
		array=ArrayUtil.add(array,s);
		s.id=++index;
		System.out.println("이름을 입력해주세요");
		s.name=UtilScanner.nextLine(sc);
		System.out.println("국어점수를 입력해주세요");
		s.kor=UtilScanner.nextInt(sc,MIN_SCORE,MAX_SCORE);
		System.out.println("영어점수를 입력해주세요");
		s.eng=UtilScanner.nextInt(sc,MIN_SCORE,MAX_SCORE);
		System.out.println("수학점수를 입력해주세요");
		s.math=UtilScanner.nextInt(sc,MIN_SCORE,MAX_SCORE);
	}
	public static void printAll() {
		if(ArrayUtil.isEmpty(array)) {
			System.out.println("저장된 정보가 없습니다.");
		} else {
			for(Student s:array) {
				System.out.printf("번호:%d 이름:%s\n",s.id,s.name);
			}
			System.out.println("열람할 학생의 번호를 입력하거나 0을 입력해 이전단계로 돌아가세요");
			int userChoice=UtilScanner.nextInt(sc);
			Student temp=new Student();
			temp.id=userChoice;
			
			if(userChoice!=0&&!ArrayUtil.contains(array, temp)) {
				System.out.println("잘못된 입력입니다.");
			} else if(userChoice!=0) {
				printOne(userChoice);
			}
		}
	}
	public static void printOne(int id) {
		Student temp=selectOne(id);
		
		int sum=temp.kor+temp.eng+temp.math;
		
			System.out.printf("번호:%d 이름:%s\n국어:%03d 영어%03d 수학%03d\n총점:%03d 평균:%06.2f\n",
					temp.id,temp.name,temp.kor,temp.eng,temp.math,sum,sum/3.0);
			
		System.out.println("수행할 동작을 선택해주세요 1.삭제 2.수정 3.뒤로가기");
		int userChoice=UtilScanner.nextInt(sc, 1, 3);
		if(userChoice==1) {
			System.out.println("정말로 삭제하시겠습니까? Y/N");
			String yOrN=UtilScanner.nextLine(sc);
			if(yOrN.equalsIgnoreCase("Y")){
				array=ArrayUtil.remove(array, temp);
			}
		} else if(userChoice==2) {
			System.out.println("이름을 입력해주세요");
			temp.name=UtilScanner.nextLine(sc);
			System.out.println("국어점수를 입력해주세요");
			temp.kor=UtilScanner.nextInt(sc, MIN_SCORE, MAX_SCORE);
			System.out.println("영어점수를 입력해주세요");
			temp.eng=UtilScanner.nextInt(sc, MIN_SCORE, MAX_SCORE);
			System.out.println("수학점수를 입력해주세요");
			temp.math=UtilScanner.nextInt(sc, MIN_SCORE, MAX_SCORE);
		} else if(userChoice==3) {
			printAll();
		}
	}
	public static Student selectOne(int id) {
		Student temp=new Student();
		temp.id=id;
		if(ArrayUtil.contains(array, temp)) {
			temp=ArrayUtil.get(array,ArrayUtil.indexOf(array, temp));
			return temp;
		} else {
			return null;
		}
	}
}
