package test;

import java.util.*;

public class Quick {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count; //입력 할 숫자의 갯수
		LinkedList<Integer> ll=new LinkedList<>(); //입력할 숫자를 저장할 LinkedList
		count=sc.nextInt();
		for(int i=0;i<count;i++) { //정렬할 숫자를 입력
			ll.add(sc.nextInt());
		}
		System.out.println(quickSort(ll)); //quick정렬 후 리스트 출력
	}
	static public LinkedList<Integer> quickSort(LinkedList<Integer> list) {
		if(list.size()<=1) { //정렬 요소 갯수가 0, 1개면 그대로 리턴
			return list;
		} else if(list.size()==2) { //정렬 요소 갯수가 2개면 대소 비교 후 리턴
			if(list.get(0)>list.get(1)) { //앞의 숫자가 더 클 떄
				list.add(list.get(0));
				list.remove(0);
				return list;
			}
			else { //뒤의 숫자가 더 클때
				return list;
			}
		} else { //정렬 요소 갯수가 3개 이상일때 퀵 정렬 재귀함수 작성
			int middle=list.get(0);
			list.remove(0);
			LinkedList<Integer> lower=new LinkedList<>(); //더 작은값을 담을 리스트
			LinkedList<Integer> higher=new LinkedList<>(); //더 큰값을 담을 리스트
			for(int i=0;i<list.size();i++) { //숫자 하나를 지정해서 그 숫자와의 대소비교를 통해 새로 생성한 리스트들에 요소 분배
				if(list.get(i)<=middle) {
					lower.add(list.get(i));
				} else {
					higher.add(list.get(i));
				}
			}
			list.clear(); //분배 된 요소들을 재귀함수로 정렬한 후 새로 담기위해 내용삭제
			list=quickSort(lower);
			list.add(middle);
			list.addAll(quickSort(higher));
			
			return list; //정렬된 리스트 리턴
		}
	}
}
