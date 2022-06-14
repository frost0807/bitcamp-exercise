package ex_220613;

import java.util.Arrays;
import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		Random rand=new Random();
		int temp;
		
		int[] lottoNumbers=new int[6];
		//for문을 사용하여 lottoNumbers에 숫자를 저장
		for(int i=0;i<lottoNumbers.length;i++) {
			lottoNumbers[i]=rand.nextInt(45)+1;
			
			for(int j=0;j<i;j++) {
				if(lottoNumbers[i]==lottoNumbers[j]) {
					lottoNumbers[i]=rand.nextInt(45)+1;
					j=-1;
				}
			}
		}
		for(int i=0;i<lottoNumbers.length-1;i++) {
			if(lottoNumbers[i]>lottoNumbers[i+1]) {
				temp=lottoNumbers[i];
				lottoNumbers[i]=lottoNumbers[i+1];
				lottoNumbers[i+1]=temp;
				i=-1;
			}
		}
		System.out.println(Arrays.toString(lottoNumbers));
	}
}
