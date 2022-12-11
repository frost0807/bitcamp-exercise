package ex_220615_1;

import java.util.Scanner;
import ex_220615.*;

public class Ex3 {
    public static Student[] array;
    public static int index;
    public static Scanner scanner;
    
    public static final int SUBJECT_SIZE = 3;
    public static final int STUDENT_SIZE = 5;
    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;
    
    public static void init() {
        array = new Student[STUDENT_SIZE];
        index = 1;
        scanner = new Scanner(System.in);
    }
    
    public static void showMenu() {
        while(true) {
            String message="1.입력 2.출력 3.종료";
            int userChoice=UtilScanner.nextInt(scanner,1,3);
            
            if(userChoice==1) {
            	
            } else if(userChoice==2) {
            	
            } else if(userChoice==3) {
            	System.out.println("사용해 주셔서 감사합니다.");
            	break;
            }
        }
    }
    public static void insert() {
    	if(index<STUDENT_SIZE) {
    		//아직 배열에 빈 자리가 있으므로 입력 가능하다.
    		
    		//정보를 저장할 Student변수
    		Student s=new Student();
    		
    		//번호 입력
    		System.out.println("학생의 번호를 입력해주세요");
    		s.id=UtilScanner.nextInt(scanner);
    		
    		//이름 입력
    		System.out.println("학생의 이름을 입력해주세요");
    		s.name=UtilScanner.nextLine(scanner);
    		
    		//국어 입력
    		System.out.println("학생의 국어점수를 입력해주세요");
    		s.kor=UtilScanner.nextInt(scanner,0,100);
    		
    		//영어 입력
    		System.out.println("학생의 영어점수를 입력해주세요");
    		s.eng=UtilScanner.nextInt(scanner,0,100);
    		
    		//수학 입력
    		System.out.println("학생의 수학점수를 입력해주세요");
    		s.math=UtilScanner.nextInt(scanner,0,100);
    		
    		array[index]=s;
    		index++;
    	} else {
    		System.out.println("더 이상 입력이 불가능합니다.");
    	}
    }
    public static void print() {
    	if(index==0) {
    		System.out.println("아직 입력된 정보가 없습니다.");
    	} else {
    		for(Student s:array) {
    			int sum=s.kor+s.eng+s.math;
    			
    			System.out.printf("번호:%d 이름:%s\n국어:%03d 영어:%03d 수학:%03d\n총점:%03d 평균:%6.2f\n",
						s.id,s.name,s.kor,s.eng,s.math,sum,sum/3.0);
    		}
    	}
    }
    public static void main(String[] args) {
    	init();
    	showMenu();
    	scanner.close();
    }
}


