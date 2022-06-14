package ex_220613;

public class ArrayUtil {
	//1. int[]
	//A. 현재 배열의 길이를 리턴하는 size()
	public static int size(int[] arr) {
		return arr.length;
	}
	public static boolean isEmpty(int[] arr) {
		if(ArrayUtil.size(arr)==0) {
			return true;
		} else {
			return false;
		}
	}
	public static int get(int[] arr,int index) {
		return arr[index];
	}
	public static boolean contains(int[] arr,int element) {
		for(int i=0;i<size(arr);i++) {
			if(element==get(arr,i)) {
				return true;
			}
		}
		return false;
	}
	public static int indexOf(int[] arr,int ch) {
		for(int i=0;i<size(arr);i++) {
			if(ch==get(arr,i)) {
				return i;
			}
		}
		return -1;
	}
	public static int lastIndexOf(int[] arr,int ch) {
		for(int i=size(arr)-1;i>=0;i--) {
			if(ch==get(arr,i)) {
				return i;
			}
		}
		return -1;
	}
	public static int[] add(int[] arr,int element) {
		int[] temp=new int[size(arr)+1];
		for(int i=0;i<size(arr);i++) {
			temp[i]=arr[i];
		}
		temp[size(arr)]=element;
		return temp;
	}
	public static int[] add(int[] arr,int index,int element) {
		int[] temp=new int[0];
		for(int i=0;i<index;i++) {
			temp=add(temp,get(arr,i));
		}
		temp=add(temp,element);
		for(int i=index;i<size(arr);i++) {
			temp=add(temp,get(arr,i));
		}
		return temp;
	}
	public static int[] set(int[] arr,int index,int element) {
		arr[index]=element;
		return arr;
	}
	public static int[] removeByIndex(int[] arr,int index) {
		if(index<0||index>=size(arr)) {
			return arr;
		} else {
			int[] temp=new int[0];
			
			for(int i=0;i<size(arr);i++) {
				if(i!=index) {
					temp=add(temp,get(arr,i));
				}
			}
			return temp;
		}
	}
	public static int[] removeByElement(int[] arr,int element) {
		return removeByIndex(arr,indexOf(arr,element));
	}
}