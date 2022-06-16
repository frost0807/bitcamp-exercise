package ex_220616;

public class ArrayUtilString {
	public static int size(String[] arr) {
		return arr.length;
	}
	public static boolean isEmpty(String[] arr) {
		if(size(arr)==0) {
			return true;
		} else {
			return false;
		}
	}
	public static String get(String[] arr,int index) {
		return arr[index];
	}
	public static boolean contains(String[] arr,String element) {
		for(int i=0;i<size(arr);i++) {
			if(element.equals(get(arr,i))) {
				return true;
			}
		}
		return false;
	}
	public static int indexOf(String[] arr,String str) {
		for(int i=0;i<size(arr);i++) {
			if(get(arr,i).equals(str)) {
				return i;
			}
		}
		return -1;
	}
	public static int lastIndexOf(String[] arr,String str) {
		for(int i=size(arr)-1;i>=0;i--) {
			if(get(arr,i).equals(str)) {
				return i;
			}
		}
		return -1;
	}
	public static String[] add(String[] arr,String element) {
		String[] temp=new String[size(arr)+1];
		for(int i=0;i<size(arr);i++) {
			temp[i]=arr[i];
		}
		temp[size(arr)]=element;
		return temp;
	}
	public static String[] set(String[] arr,int index,String element) {
		arr[index]=element;
		return arr;
	}
	public static String[] removeByIndex(String[] arr,int index) {
		if(index<0||index>=size(arr)) {
			return arr;
		} else {
			String[] temp=new String[0];
			for(int i=0;i<size(arr);i++) {
				if(i!=index) {
					temp=add(temp,get(arr,i));
				}
			}
		return temp;
		}
	}
	public static String[] removeByElement(String[] arr, String element) {
		return removeByIndex(arr,indexOf(arr,element));
	}
}