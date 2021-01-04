package Collections;

import java.util.ArrayList;


public class Main2arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,5,6};
		
		System.out.println(sumTwoElement(arr,6));
	}
	
	//ava program to find the sum of the two elements of a given 
	//array which is equal to a given integer.
	public static String sumTwoElement(int[] arrayNum,int target) {
		
		int sum=0;
		int indx=1;
		int num1=0;
		int num2=0;
		
		for(int i=1;i<arrayNum.length;i++) {
			if(arrayNum[i]==arrayNum[indx-1] || arrayNum[i]!=arrayNum[indx-1]) {
				sum =arrayNum[i]+arrayNum[indx-1];
				num1=arrayNum[i];
			    num2 =arrayNum[indx-1];
			    indx++;
				if(sum==target) {
					
					return String.format("%d +%d = %d", num1,num2,sum);
				}
				
				}
			}
		
		
		return null;
	}
}
