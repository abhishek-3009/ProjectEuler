package org.apex.projecteuler;
/*What is the smallest positive number that 
 * is evenly divisible by all of the numbers from 1 to 20*/
import java.util.ArrayList;
import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Number to find a minimum number divisible by 1 to the entered number");
		int num=scanner.nextInt();
		scanner.close();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=1;i<=num;i++) {
			arr.add(i);
		}
		int temp;
	//	System.out.println(arr.get(2));
		for(int i=0;i< arr.size();i++) {
			
			for(int j=i+1;j< arr.size();j++) {
				if(arr.get(j)%arr.get(i)==0 && arr.get(i)>1) {
					temp= arr.get(j)/arr.get(i);
					arr.set(j, temp);
				}
			}
		}
		int prod=1;
		for(int k:arr) {
			prod*=k;
		}
		System.out.println("The smallest number divisible by numbers 1 to "+num+" is: "+prod);
	}

}
