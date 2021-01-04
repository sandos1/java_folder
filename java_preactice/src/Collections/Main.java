package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// Get the Array 
        int intArr[] = { 10, 20,22, 15, 22, 35 }; 
        String strArr[] = { "10", "20", "15", "22", "35" }; 
        int intKey = 22; 
        
        int indx = Arrays 
                .binarySearch(intArr, intKey);
        
        System.out.println(intKey 
                           + " found at index = "
                           + Arrays 
                                 .binarySearch(intArr, intKey)); 
        
        System.out.println(indx);
        sortArray(intArr,strArr);
        sumArray(intArr);
        twoDimenArr() ;
        System.out.println(search(intArr, 223));
        remove(intArr, 22);
        
        System.out.println(maxMin(intArr));
        
        int[] array =  {20, 20, 30, 40, 50, 50, 50};
        
        removeDuplicate(array);
        
        int[] array1 = {49, 1, 3, 200, 2, 4, 70, 5};
        longestconsecutive(array1);
        
        
        
                           
		

	}
	
	
	
	
	//Write a Java program to sort a numeric array and a string array.
	public static void sortArray(int[] numArray, String[] strArray) {
		
		Arrays.sort(numArray);
		Arrays.sort(strArray);
		
		System.out.println(Arrays.toString(numArray));
		System.out.println(Arrays.toString(strArray));
	}

	//Write a Java program to sum values of an array.
	public static void sumArray(int[] numArray) {
		int sum=0;
		
		for(int i=0; i<numArray.length;i++) {
			sum +=numArray[i];
		}
		
		System.out.println("The sum is:"+sum);
		
	}
	
	public static void twoDimenArr() {
		//Two dimensional array:
		int[][] twoD_arr = new int[10][10];
		
		for(int i=0; i<10;i++) {
			
			for(int j=0;j<10;j++) {
				 System.out.printf("%2d ",twoD_arr[i][j]);
			}
			System.out.println();
		}
	}
	
	//Write a Java program to test if an array contains a specific value.
	//Write a Java program to find the index of an array element.( I used binary search method)
	public static String search(int[] array,int val) {
		if(array==null) {
			return "-1";
		}
		
		Arrays.sort(array);
		for(int value:array) {
			if(value==val) {
				return String.format("value found: "+value+" "
						+ "at index :"+ Arrays.binarySearch(array, val));
			}
		
		}
		return "-1";
		
	}
	
	//Write a Java program to remove a specific element from an array.
	public static void remove(int[] array,int ele) {
		
		List<Integer> newarr = new ArrayList<>();
		for(int i =0; i<array.length;i++) {
			if(array[i]!=ele) {
				newarr.add(array[i]);
			}
		}
		System.out.println(newarr.toString());
	}
	
	//Write a Java program to find the maximum and minimum value of an array.
	public static String maxMin(int []arr) {
		int min = Integer.MAX_VALUE;
		System.out.println(min);
		
		int max= Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++) {
			if(min >arr[i]) {
				min=arr[i];
			}
		}
		
		for(int i=0; i<arr.length;i++) {
			if(max <arr[i]) {
				max=arr[i];
			}
		}
		return String.format("Min: %d Max: %d", min,max);
	}
	
	//Write a Java program to remove the duplicate elements of a given 
	//array and return the new length of the array.
	
	public static void removeDuplicate(int[]arr) {
		
		List<Integer> newarrIntegers = new ArrayList<>();
		
		for(int i=0; i<arr.length;i++) {
			if(!newarrIntegers.contains(arr[i])) {
				newarrIntegers.add(arr[i]);
			}
		}
		
		System.out.println(newarrIntegers.toString());
	}
	
	//Write a Java program to find the length of the longest consecutive elements 
	//sequence from a given unsorted array of integers.
	public static void longestconsecutive(int[] arr) {
		Arrays.sort(arr);
		List<Integer> newarrIntegers=new ArrayList<>();
		
		int init=Integer.MAX_VALUE;
		for(int i=0; i<arr.length;i++) {
			
			if(init<arr[i]) {
				newarrIntegers.add(arr[i]);
				init++;
			}
		}
		
		System.out.println(newarrIntegers.toString());
	}
}
