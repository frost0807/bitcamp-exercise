package ex_220615_1;

import java.util.Scanner;
import ex_220615.*;

public class Ex4 {
		//전역변수
		public static Scanner scanner;
		public static Student[] array;
		public static int index;
		
		//전역상수
		public static final int SUBJECT_SIZE=3;
		public static final int SCORE_MIN=0;
		public static final int SCORE_MAX=100;

	public static void main(String[] args) {
		//전역 변수의 초기화를 해줄 메소드를 실행시킨다.
		init();
		//메뉴 출력 메소드 호출
		showMenu();
		//프로그램 종료 전 scanner.close() 실행
		scanner.close();
	}
	
	//전역 변수 초기화 담당 메소드 init()
	public static void init() {
		scanner=new Scanner(System.in);
		array=new Student[0];
		index=1;
	}
	//메뉴 출력 담당 메소드 showMenu()
	public static void showMenu() {
		while(true) {
			System.out.println("1.학생입력 2.학생목록출력 3.종료");
			int userChoice=UtilScanner.nextInt(scanner);
			if(userChoice==1) {
				//학생 입력 메소드 실행
				insert();
			} else if(userChoice==2) {
				//학생 목록 출력 메소드 실행
				printAll();
			} else if(userChoice==3) {
				//메시지 출력 후 종료
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		}
	}
	public static void insert() {
		//학생의 정보를 담을 Student 변수 선언 및 초기화
		Student s=new Student();
		//입력 시 출력할 메시지를 저장 할 String 변수 선언
		String message;
		//학생의 번호를 nextInt의 현재값으로 초기화하고 index는 1 증가시킨다
		s.id=index++;
		//학생의 이름을 입력받는다.
		System.out.println("학생의 이름을 입력해주세요.");
		s.name=UtilScanner.nextLine(scanner);
		
		System.out.println("학생의 국어점수를 입력해주세요");
		s.kor=UtilScanner.nextInt(scanner,SCORE_MIN,SCORE_MAX);
		
		System.out.println("학생의 영어점수를 입력해주세요");
		s.eng=UtilScanner.nextInt(scanner,SCORE_MIN,SCORE_MAX);
		
		System.out.println("학생의 수학점수를 입력해주세요");
		s.math=UtilScanner.nextInt(scanner,SCORE_MIN,SCORE_MAX);
		
		array=ArrayUtil.add(array, s);
	}
	//학생의 목록을 "간략하게"출력하는 메소드
	public static void printAll() {
		if(ArrayUtil.isEmpty(array)) {
			//아직 아무도 입력 안됐으므로
			//경고 메세지만 출력
			System.out.println("아직 입력된 학생이 존재하지 않습니다.");
		} else {
			for(Student s:array) {
				System.out.printf("번호:%d 이름:%s\n",s.id,s.name);
			}
			System.out.println("상세보기할 학생의 번호나 뒤로 가시려면 0을 입력해주세요");
			int userChoice=UtilScanner.nextInt(scanner);
			
			Student temp=new Student();
			
			temp.id=userChoice;

			if(userChoice!=0&&!ArrayUtil.contains(array, temp)) {
				System.out.println("잘못 입력하셨습니다.");
				userChoice=UtilScanner.nextInt(scanner);
				temp.id=userChoice;
			} else if(userChoice!=0) {
				printOne(userChoice);
			}
		}
	}
	public static void printOne(int id) {
		//1. Student 변수 선언 및 초기화
		Student s=new Student();
		//2. 파라미터 id를 s의 id에 저장
		s.id=id;
		//3. array에서 s와 일치하는 (=equals()가 true가 나오는)칸의 index를 얻어온다
		int index=ArrayUtil.indexOf(array,s);
		//4. Student 변수 temp에 array의 index번 칸의 값을 저장시켜서 출력헤서 활용한다.
		Student temp=ArrayUtil.get(array, index);
		//5. temp를 사용해서 학생의 개별 정보를 출력해준다
		int sum=temp.kor+temp.eng+temp.math;
		System.out.printf("번호:%d 이름:%s\n",temp.id,temp.name);
		System.out.printf("국어:%03d 영어:%03d 수학:%03d\n",
				temp.kor,temp.eng,temp.math);
		System.out.printf("총점: %03d점 평균:%06.2f점\n",sum,sum/3.0);
		
		System.out.println("1.수정 2.삭제 3.뒤로가기");
		int userChoice=UtilScanner.nextInt(scanner);
		
		if(userChoice==1) {
			//수정메소드 update() 실행
			update(id);
		} else if(userChoice==2) {
			//삭제메소드 delete() 실행
			delete(id);
		} else if(userChoice==3) {
			//목록 출력 메소드를 처음부터 실행될 수 있도록 printAll()실행
			printAll();
		}
	}
	public static void update(int id) {
		Student temp=selectOne(id);
		
		System.out.println("새로운 이름을 입력해주세요");
		temp.name=UtilScanner.nextLine(scanner);
		
		System.out.println("새로운 국어점수를 입력해주세요");
		temp.kor=UtilScanner.nextInt(scanner,SCORE_MIN,SCORE_MAX);
		
		System.out.println("새로운 영어점수를 입력해주세요");
		temp.eng=UtilScanner.nextInt(scanner,SCORE_MIN,SCORE_MAX);
		
		System.out.println("새로운 수학점수를 입력해주세요");
		temp.math=UtilScanner.nextInt(scanner,SCORE_MIN,SCORE_MAX);
		
		printOne(id);
	}
	public static void delete(int id) {
		Student temp=new Student();
		temp.id=id;
		//사용자로부터 정말로 삭제할 지 동의를 받는다.
		System.out.println("정말로 삭제하시겠습니까? Y/N");
		String yesNo=UtilScanner.nextLine(scanner);
		if(yesNo.equalsIgnoreCase("Y")) {
			array=ArrayUtil.remove(array,temp);
			printAll();
		} else {
			printOne(id);
		}
		
		//String 클래스에 정의되어 있는 equasIgnoreCase()는
		//2개의 문자열이 대소문자 상관없이 스펠링이 같으면 true, 그 외에는 false가 리턴된다.
	}
	public static Student selectOne(int id) {
		Student result=null;
		
		Student temp=new Student();
		temp.id=id;
		if(ArrayUtil.contains(array, temp)) {
			result=ArrayUtil.get(array, ArrayUtil.indexOf(array,temp));
		}
		
		return result;
	}
}