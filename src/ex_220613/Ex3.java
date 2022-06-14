package ex_220613;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int check=0;
		Loop:while(true) {
			System.out.println("로또 프로그램을 시작합니다 번호를 선택해주세요\n1.자동 2.수동 3.종료");
			check=sc.nextInt();
			switch(check) {
			
				case 1:
					int[] playerNum=autoNum();
					int[] computerNum=autoNum();
					System.out.println("사용자의 숫자 : "+Arrays.toString(playerNum));
					System.out.println("컴퓨터의 숫자 : "+Arrays.toString(computerNum));
					System.out.println(numCheck(playerNum,computerNum)+"개의 숫자를 맞추셨습니다!");
					break;
				case 2:
					int[] computerNum_M=autoNum();
					System.out.println("입력할 숫자 6개를 차례로 입력 해 주세요");
					int[] playerNum_M=manualNum();
					System.out.println("사용자의 숫자 : "+Arrays.toString(playerNum_M));
					System.out.println("컴퓨터의 숫자 : "+Arrays.toString(computerNum_M));
					System.out.println(numCheck(playerNum_M,computerNum_M)+"개의 숫자를 맞추셨습니다!");
					break;
				case 3:
					System.out.println("프로그램을 종료합니다.");
					break Loop;
				default:
					System.out.println("1~3사이의 숫자를 입력해주세요");
			}
		}
		sc.close();
	}
	public static int[] autoNum() {
		Random rand=new Random();
		int[] lottoNum=new int[6];
		
		for(int i=0;i<lottoNum.length;) {
			boolean numSwitch=true;
			int temp=rand.nextInt(45)+1;
			
			for(int j=0;j<i;j++) {
				if(temp==lottoNum[j]) {
					numSwitch=false;
					break;
				}
			}
			
			if(numSwitch) {
				lottoNum[i]=temp;
				i++;
			}
		}
		
		return sortNum(lottoNum);
	}
	public static int[] manualNum() {
		Scanner sc=new Scanner(System.in);
		int [] manualN=new int[6];

		for(int i=0;i<manualN.length;) {
			boolean numSwitch=true;
			System.out.println((i+1)+"번째 숫자를 입력해주세요");
			int temp=sc.nextInt();
			
			while(temp<=0||temp>=46) {
				System.out.println("범위를 벗어난 숫자를 입력하셨습니다. 다시 입력해주세요");
				temp=sc.nextInt();
			}
			for(int j=0;j<i;j++) {
				if(temp==manualN[j]) {
					numSwitch=false;
					break;
				}
			}
			if(numSwitch) {
				manualN[i]=temp;
				i++;
			} else {
				System.out.println("중복된 숫자입니다. 다시 입력해주세요");
			}
		}
		sc.close();
		return sortNum(manualN);
	}
	public static int[] sortNum(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp;
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				i=-1;
			}
		}
		return arr;
	}
	public static int numCheck(int[] pNum, int[] cNum) {
		int count=0;
		for(int i=0;i<pNum.length;i++) {
			for(int j=0;j<cNum.length;j++) {
				if(pNum[i]==cNum[j]) {
					count++;
					break;
				}
			}
		}
		return count;
	}
}