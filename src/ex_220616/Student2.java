package ex_220616;

//캡슐화가 적용된 학생클래스
public class Student2 {
	//필드
	private int id;
	private String name;
	private int korean;
	private int english;
	private int math;
	private final int SUBJECT_SIZE=3;
	
	public Student2(int userId,String userName, int userKorean,int userEnglish,int userMath){
		this.id=userId;
		this.name=userName;
		this.korean=userKorean;
		this.english=userEnglish;
		this.math=userMath;
	}
	public Student2() {
		this.id=-1;
		this.name="아직 입력 안됨";
		this.korean=-1;
		this.english=-1;
		this.math=-1;
	}
	public boolean equals(Object obj) {
		//먼저 파라미터로 들어온 Object객체가 실체화가 끝난 즉, Student클래스 인스턴스인지를
		//instanceof라는 키워드를 통해 쳌하여 맞으면 추가적인 코드를 진행한다.
		//instanceof키워드는 상속개체인가 and 참조변수가 가리키는 인스턴스가 null인지도 같이 체크한다.
		if(obj instanceof Student) {
			return this.id==((Student)obj).id;
		}
		return false;
	}
	//메소드
	public void printInfo() {
		System.out.printf("번호:%d 이름:%s\n",this.id,this.name);
		System.out.printf("국어:%03d 영어:%03d 수학:%03d\n",this.korean,this.english,this.math);
		System.out.printf("총점:%03d 평균:%06.2f\n",calculateSum(),calculateAverage());
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getKorean() {
		return korean;
	}
	public int getEnglish() {
		return english;
	}
	public int getMath() {
		return math;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public void setMath(int math) {
		this.math = math;
	}
	private int calculateSum() {
		return this.korean+this.english+this.math;
	}
	private double calculateAverage() {
		return (double)calculateSum()/SUBJECT_SIZE;
	}
}
