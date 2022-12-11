package ex_220615_1;

import ex_220615.Student;

public class Ex1 {

	public static void main(String[] args) {
		//우리가 만든 데이터타입의 변수를 만들 때에는 Random변수를 만들때와 똑같은 형태를 가지게 된다.
		Student s=new Student();
		//해당 변수의 내부 공간에 접근할 때에는 변수이름.공간이름으로 접근하게 된다.
		//즉 Student 변수 s의 id에 3을 저장해라는 다음과 같이 적는다.
		s.id=3;
		s.name="최준석";
		s.kor=80;
		s.eng=90;
		s.math=95;
		
		//마찬가지로 현재 해당공간의 내부 공간값을 호출할 때도 똑같이 적어준다.
		//.이라는 문법은 "~~의"라고 생각하면 편하다.
		System.out.println("s.id:"+s.id);
		System.out.println("s.name:"+s.name);
		int sum=s.kor+s.eng+s.math;
		System.out.println("sum:"+sum);
		System.out.println("avg:"+sum/3.0);
		
		Student s2=new Student();
		//우리가 필요하다면 s2에는 새로운 값을 저장할 수 있다.
		s2.id=1;
		s2.name="김준석";
		s2.kor=77;
		s2.eng=80;
		s2.math=100;
		
		System.out.println();
		System.out.println("s.id:"+s2.id);
		System.out.println("s.name:"+s2.name);
		int sum2=s2.kor+s2.eng+s2.math;
		System.out.println("sum:"+sum2);
		System.out.println("avg:"+sum2/3.0);
		
		Student[] arr=new Student[3];
		
		arr[0]=new Student();
		
		//또한 우리가 만든 데이터타입의 내부 공간은 기본형 데이터타입이면 0, 참조형 데이터타입이면 null로 초기화가 된다.
		System.out.println("arr[0].id:"+arr[0].id);
		System.out.println("arr[0].name:"+arr[0].name);
		
		Student s3=new Student();
		
		s3.id=1;
		s3.name="김준석";
		s3.kor=77;
		s3.eng=80;
		s3.math=100;
		
		System.out.println("s2.equals(s3):"+s2.equals(s3));
		//따라서 우리가 직접 필요할 때 equals()를 만들어주거나
		//아니면 두 공간의 특정 값들을 직접 비교하게 코드를 작성해야 한다.
		System.out.println("s2==s3:"+(s2==s3));
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("s2.id==s3.id:"+(s2.id==s3.id));
	}
}
