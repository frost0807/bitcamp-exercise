package FirstJAVA_Package;

import java.util.*;

public class First_JAVA_Class {
	
	public static void main(String[] args) {
		
		Score[] user = new Score[10];
		for(int i=0;i<3;i++)
		{
			user[i]=new Score();
		}
		for(int i=0;i<3;i++)
		{
			user[i].set_Score();
		}
		for(int i=0;i<3;i++)
		{
			user[i].get_Score();
			System.out.println("");
		}
	}
}