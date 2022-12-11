package FirstJAVA_Package;

import java.util.Scanner;

public class Score {
	String name;
	int kor=0, eng=0, math=0, total=0;
	float avg=0.0f;
	
	public void set_Score() {
		Scanner sc=new Scanner(System.in);
		System.out.println("이름입력");
		name=sc.next();
		System.out.println("국어성적입력");
		kor=sc.nextInt();
		System.out.println("영어성적입력");
		eng=sc.nextInt();
		System.out.println("수학성적입력");
		math=sc.nextInt();
		total=kor+eng+math;
		avg=total/3.0f;
	}
	
	public void get_Score() {
		System.out.println("이름 :"+name);
		System.out.println("국어점수 :"+kor);
		System.out.println("영어점수 :"+eng);
		System.out.println("수학점수 :"+math);
		System.out.println("총점 :"+total);
		System.out.println("평균 :"+String.format("%.1f", avg));
	}
	public static void main(String[] args) {}
}
