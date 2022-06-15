package ex_220615_1;

//Student 데이터타입의 배열을 사용하여 다섯명의 학생을 관리하는 프로그램을 작성하시오
//동적할당 X
//심화:위 프로그램을 완성하신 분들은 ArrayUtil에 Student타입 배열을 동적할당하는 메소드들을 구현하시오.
import java.util.Scanner;
import ex_220615.*;

public class Ex2 {
		public static Student[] st=new Student[5];
		public static int count=0;
		public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("학생 성적 관리 프로그램 입니다. 1성적입력 2성적출력 3성적삭제 4종료");
			
			int check=UtilScanner.nextInt(sc,1,4);
			
			switch(check) {
			case 1:
				if(count>=5) {
					System.out.println("5명의 이상의 성적을 입력할 수 없습니다.");
					break;
				} else {
					st[count]=new Student();
					
					System.out.println("번호를 입력해주세요");
					st[count].id=UtilScanner.nextInt(sc);
					
					System.out.println("이름을 입력해주세요");
					st[count].name=UtilScanner.nextLine(sc);
					
					System.out.println("국어점수를 입력해주세요");
					st[count].kor=UtilScanner.nextInt(sc,0,100);
					
					System.out.println("영어점수를 입력해주세요");
					st[count].eng=UtilScanner.nextInt(sc,0,100);
					
					System.out.println("수학점수를 입력해주세요");
					st[count].math=UtilScanner.nextInt(sc,0,100);
					
					count++;
				}
				break;
			case 2:
				if(count<=0) {
					System.out.println("입력된 성적이 없습니다.");
				} else {
					System.out.println("성적출력 메뉴입니다. 1전체성적출력 2지정성적출력");
					
					int check_1=UtilScanner.nextInt(sc,1,2);
					
					if(check_1==1) {
						for(int i=0;i<count;i++) {
							int sumTemp=st[i].kor+st[i].eng+st[i].math;
							
							System.out.println("-------------------------");
							System.out.printf("번호:%d 이름:%s\n국어:%03d 영어:%03d 수학:%03d\n총점:%03d 평균:%6.2f\n",
									st[i].id,st[i].name,st[i].kor,st[i].eng,st[i].math,sumTemp,sumTemp/3.0);
							System.out.println("-------------------------");
						}
					} else if(check_1==2) {
						System.out.println("현재 입력된 성적의 갯수 : "+count);
						System.out.println("몇번째 성적을 출력할까요? 1~"+count);
						
						int nth=UtilScanner.nextInt(sc,1,count);
						
						int sumTemp=st[nth-1].kor+st[nth-1].eng+st[nth-1].math;
						
						System.out.printf("번호:%d 이름:%s\n국어:%03d 영어:%03d 수학:%03d\n총점:%03d 평균:%6.2f\n",
								st[nth-1].id,st[nth-1].name,st[nth-1].kor,st[nth-1].eng,st[nth-1].math
								,sumTemp,sumTemp/3.0);
					}
				}
				break;
			case 3:
				if(count<=0) {
					System.out.println("입력된 성적이 없습니다.");
				} else {
					System.out.println("현재 입력된 성적의 갯수 : "+count);
					System.out.println("몇 번째 성적을 삭제하시겠습니까? 1~"+count);
					
					int nth=UtilScanner.nextInt(sc,1,count);
					
					System.out.println(nth+"번째 성적을 삭제합니다.");
					st[nth-1]=null;
					count--;
					System.out.println("성적을 삭제했습니다. 현재 입력된 성적의 갯수 : "+count);
				}
				break;
			}
		}
	}
}
