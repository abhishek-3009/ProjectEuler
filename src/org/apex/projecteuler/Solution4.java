package org.apex.projecteuler;

//Find largest Palindrome from multiplication of 3 digit numbers

public class Solution4 {

	public static void main(String[] args) {
		int largestPalindrome=0, num;
		for(int i=100;i<1000;i++) {
			for(int j=i+1;j<1000;j++) {
				num=i*j;
				// check if number is palindrome
				if(isPalindrome(String.valueOf(num))==true && num > largestPalindrome) {
					largestPalindrome= num;
				}
			}
		}
		System.out.println("The Largest Palindrome is: "+largestPalindrome);

	}

	public static boolean isPalindrome(String str) {
		String str2="";
		for(int i=(str.length()-1);i >= 0 ;i--) {
			str2 +=str.charAt(i);
		}
		if(str.equals(str2)) {
			return true;
		}else
			return false;
	}
}