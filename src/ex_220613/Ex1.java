package ex_220613;

import java.util.*;

//배열
//배열이란 똑같은 데이터타입이고 똑같은 목적을 가진 변수를
//여러개가 필요할 때, 굳이 각각의 변수를 따로 만드는 것이 아니라
//하나의 읾으로 묶어서 제어할 수 있게 만들어주는 데이터타입이다.

//배열은 우리가 사용할 때 반드시 총 몇개의 변수(=길이)를 저장할지를
//명시해주어야 하고, 또 똑같은 데이터타입만 묶어줄 수 있다.

//배열의 선언과 초기화
//데이터타입[] 배열이름=new 데이터타입[길이]

//기본형 데이터타입의 배열은 각 칸이 0으로 초기화된다.
//참조형 데이터타입의 배열은 각 칸이 null로 초기화된다.

//null값 : 주소는 있지만 초기화 준비가 안 되어있는 상태


public class Ex1 {
	public static void main(String[] args) {
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		
		int no_1, no_2, no_3, no_4, no_5, no_6;
		
		int temp=rand.nextInt(45)+1;
		no_1=temp;
		
		while(no_1==temp) {
			temp=rand.nextInt(45)+1;
		}
		no_2=temp;
		while(no_1==temp||no_2==temp) {
			temp=rand.nextInt(45)+1;
		}
		no_3=temp;
		while(no_1==temp||no_2==temp||no_3==temp) {
			temp=rand.nextInt(45)+1;
		}
		no_4=temp;
		while(no_1==temp||no_2==temp||no_3==temp||no_4==temp) {
			temp=rand.nextInt(45)+1;
		}
		no_5=temp;
		while(no_1==temp||no_2==temp||no_3==temp||no_4==temp||no_5==temp) {
			temp=rand.nextInt(45)+1;
		}
		no_6=temp;
		System.out.printf("로또번호는 %d %d %d %d %d %d\n", no_1, no_2, no_3, no_4, no_5, no_6);
		
		int sortedNo1=0;
		int sortedNo2=0;
		int sortedNo3=0;
		int sortedNo4=0;
		int sortedNo5=0;
		int sortedNo6=0;
		
		sortedNo1=no_1;
		if(sortedNo1>no_2) {
			sortedNo1=no_2;
		}
		if(sortedNo1>no_3) {
			sortedNo1=no_3;
		}
		if(sortedNo1>no_4) {
			sortedNo1=no_4;
		}
		if(sortedNo1>no_5) {
			sortedNo1=no_5;
		}
		if(sortedNo1>no_6) {
			sortedNo1=no_6;
		}
		System.out.println("최소값은 "+sortedNo1);
	}
}
