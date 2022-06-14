package ex_220613;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import ex_220613.ArrayUtil;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Loop:while(true) {
			System.out.println("--------------------------------------------");
			System.out.println("로또 프로그램을 시작합니다. 시행횟수를 선택해주세요(1~10회)\n0을 입력하면 종료");
			System.out.println("--------------------------------------------");
			int tryNum=UtilScanner.nextInt();
			while(tryNum<0||tryNum>10) {
				System.out.println("1~10중에 입력해주세요");
				tryNum=UtilScanner.nextInt();
			}
			int[] computerNum=autoNum();
			int[][] playerNum=new int[tryNum][];
			System.out.printf("총 %d회를 시행합니다.\n\n",tryNum);
			for(int i=0;i<tryNum;i++) {
				System.out.println((i+1)+"회차를 시행합니다. 자동은 1 수동은 2 입력해주세요");
				int check=UtilScanner.nextInt();
				while(check<=0||check>2) {
					System.out.println("1 2 중에 입력해주세요");
					check=UtilScanner.nextInt();
				}
				switch(check) {
					case 1:
						playerNum[i]=autoNum();
						break;
					case 2:
						playerNum[i]=manualNum();
						break;
					case 0:
						break Loop;
					default:
						break;
				}
			}
			System.out.println("결과를 출력합니다.");
			System.out.println("컴퓨터의 숫자 : "+Arrays.toString(computerNum));
			for(int i=0;i<tryNum;i++) {
				System.out.printf("%d회차 결과 : %25s 총 %d개 맞추셨습니다!\n",i+1,Arrays.toString(playerNum[i]),numCheck(computerNum,playerNum[i]));
			}
		}
		sc.close();
	}
	public static int[] autoNum() {
		Random rand=new Random();
		int[] lottoNum=new int[0];
		
		for(int i=0;i<6;i++) {
			int temp=rand.nextInt(45)+1;
			
			while(ArrayUtil.contains(lottoNum, temp)) {
				temp=rand.nextInt(45)+1;
			}
			lottoNum=ArrayUtil.add(lottoNum, temp);
		}
		return sortNum(lottoNum);
	}
	public static int[] manualNum() {
		Scanner sc=new Scanner(System.in);
		int [] manualN=new int[0];

		for(int i=0;i<6;i++) {
			System.out.println((i+1)+"번째 숫자를 입력해주세요");
			int temp=UtilScanner.nextInt();
			
			while(temp<=0||temp>=46) {
				System.out.println("범위를 벗어난 숫자를 입력하셨습니다. 다시 입력해주세요");
				temp=UtilScanner.nextInt();
			}
			while(ArrayUtil.contains(manualN, temp)) {
				System.out.println("중복된 숫자입니다. 다시 입력해주세요");
				temp=UtilScanner.nextInt();
			}
			manualN=ArrayUtil.add(manualN, temp);
		}
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
			if(ArrayUtil.contains(pNum, cNum[i])) {
				count++;
			}
		}
		return count;
	}
}