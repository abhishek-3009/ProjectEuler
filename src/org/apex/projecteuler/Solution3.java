package org.apex.projecteuler;

/* Find Largest Prime Factor For A Number 600851475143 --> 6857*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		//scanning the number to find the largest prime factor of
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Number To Find Largest Prime Factor");
		double num=scanner.nextDouble();
		scanner.close();
		
		int largestPrimeFactor=0;
		//finding factors as arrayList from factors method
		ArrayList<Integer> list= factors(num);
		//checking factors from prime and finding the largest.
		for(int counter=0;counter < list.size();counter++){
			if((isPrime(list.get(counter)))==true && largestPrimeFactor < list.get(counter)) {
				largestPrimeFactor=list.get(counter);
			}
		}
		System.out.println("Largest Prime Factor is: "+largestPrimeFactor);
	}

	public static ArrayList<Integer> factors(double num) {
		ArrayList<Integer> arrList=new ArrayList<Integer>();
		int r;
		for(int i=2;i <= Math.sqrt(num);i++) {
			if (num%i==0) {
				r= (int)num/i;
				if (r!= i) {
					arrList.add(r);
				}
				arrList.add(i);
			}
		}
		return arrList;

	}

	public static boolean isPrime(int num){
		for(int i=2;i <= Math.sqrt(num);i++) {
			if(num%i ==0) {
				return false;
			}
		}
		return true;

	}

}