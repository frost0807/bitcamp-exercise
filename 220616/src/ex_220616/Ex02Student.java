package ex_220616;

import java.util.*;

public class Ex02Student {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student2 s3=new Student2(4,"최준석",50,50,51);
		
		s3.setId(40);
		s3.setName("최준석");
		s3.setKorean(80);
		s3.setEnglish(90);
		s3.setMath(85);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("s3의 이름:"+s3.getName());

		s3.printInfo();
		
		Object o=new Object();
		
		System.out.println("s1.id:"+s1.id);
		System.out.println("s1.name:"+s1.name);
		
		System.out.println("s1 총점:"+s1.calculateSum());
		System.out.println("s1 평균:"+s1.calculateAverage());
	}
}
