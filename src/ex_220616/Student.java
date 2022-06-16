package ex_220616;
//학생 클래스
//필드:번호,이름,국어,영어,수학
//메소드:총점계산,평균계산,정보출력,equals() 오버라이드
public class Student {
	//필드
	public int id;
	public String name;
	public int korean;
	public int english;
	public int math;
	public final int SUBJECT_SIZE=3;
	
	//생성자
	//1. 파라미터가 있는 생성자
	Student(int userId,String userName, int userKorean,int userEnglish,int userMath){
		this.id=userId;
		this.name=userName;
		this.korean=userKorean;
		this.english=userEnglish;
		this.math=userMath;
	}
	//2.파라미터가 없는 생성자
	public Student() {
		this.id=-1;
		this.name="아직 입력 안됨";
		this.korean=100;
		this.english=90;
		this.math=80;
	}
	//3.equals() 오버라이드
	public boolean equals(Object obj) {
		//먼저 파라미터로 들어온 Object객체가 실체화가 끝난 즉, Student클래스 인스턴스인지를
		//instanceof라는 키워드를 통해 쳌하여 맞으면 추가적인 코드를 진행한다.
		//instanceof키워드는 상속개체인가 and 참조변수가 가리키는 인스턴스가 null인지도 같이 체크한다.
		if(obj instanceof Student) {
			return this.id==((Student)obj).id;
		}
		return false;
	}
	//4.정보 출력용 메소드
	public void printInfo() {
		System.out.printf("번호:%d 이름:%s\n",this.id,this.name);
		System.out.printf("국어:%03d 영어:%03d 수학:%03d\n",this.korean,this.english,this.math);
		System.out.printf("총점:%03d 평균:%06.2f\n",calculateSum(),calculateAverage());
	}
	//메소드
	public int calculateSum() {
		return this.korean+this.english+this.math;
	}
	public double calculateAverage() {
		return (double)calculateSum()/SUBJECT_SIZE;
	}
}
