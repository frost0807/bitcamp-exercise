package ex_220613;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] id=new int[5];
		String[] name=new String[5];
		int[] kor=new int[5];
		int[] eng=new int[5];
		int[] math=new int[5];
		int length=0;
		Loop:while(true) {
			System.out.println("성적입력 프로그램입니다. 번호를 선택해주세요\n1.성적입력 2.성적출력 3.종료");
			int check=sc.nextInt();
			
			if(check>3||check<1) {
				System.out.println("알맞은 범위의 숫자를 입력해주세요.");
				continue;
			}
			switch(check) {
			case 1:
				if(length>=5) {
					System.out.println("5명을 초과해서 입력할 수 없습니다.");
					break;
				} else {
					System.out.println("번호를 입력해주세요");
					int tempId=sc.nextInt();
					while(tempId<=0) {
						System.out.println("범위가 잘못 되었습니다. 다시 입력해주세요");
						tempId=sc.nextInt();
					}
					
					System.out.println("이름을 입력해주세요");
					sc.nextLine();
					String tempName=sc.nextLine();
					
					System.out.println("국어점수를 입력해주세요");
					int tempKor=sc.nextInt();
					while(tempKor<0||tempKor>100) {
						System.out.println("범위가 잘못 되었습니다. 다시 입력해주세요");
						tempKor=sc.nextInt();
					}
					
					System.out.println("영어점수를 입력해주세요");
					int tempEng=sc.nextInt();
					while(tempEng<0||tempEng>100) {
						System.out.println("범위가 잘못 되었습니다. 다시 입력해주세요");
						tempEng=sc.nextInt();
					}
	
					System.out.println("수학점수를 입력해주세요");
					int tempMath=sc.nextInt();
					while(tempMath<0||tempMath>100) {
						System.out.println("범위가 잘못 되었습니다. 다시 입력해주세요");
						tempMath=sc.nextInt();
					}
					id[length]=tempId;
					name[length]=tempName;
					kor[length]=tempKor;
					eng[length]=tempEng;
					math[length]=tempMath;
					for(int i=0;i<5;i++) {
						if(id[i]!=0) {
							length++;
							break;
						}
					}
				}
				break;
			case 2:
				if(id[0]==0) {
					System.out.println("아직 저장된 성적이 없습니다.");
					break;
				} else {
					System.out.printf("총 %d명의 성적을 출력합니다.\n",length);
					for(int i=0;i<length;i++) {
						int sum=kor[i]+eng[i]+math[i];
						System.out.println("----------------------------");
						System.out.printf("%d번째 입력한 성적\n번호:%d 이름:%s\n국어:%03d 영어:%03d 수학:%03d\n총점:%03d 평균:%6.2f\n",
								i+1,id[i],name[i],kor[i],eng[i],math[i],sum,sum/3.0);

						System.out.println("----------------------------");
					}
				}
				break;
			case 3:
				break Loop;
			default:
				break;	
			}
		}
	}

}
