package org.apex.projecteuler;

/*By considering the terms in the Fibonacci 
 * sequence whose values do not exceed four million, 
 * find the sum of the even-valued terms.*/

public class Solution2 {

	public static void main(String[] args) {

		int finalSum=2;
		int sum,first=1,second=2;
		while(second < 4000000) {
			sum=first+second;
			if (sum%2==0) {
				finalSum+=sum;
			}
			first=second;
			second=sum;
		}
		System.out.println("Sum of even-valued terms: "+finalSum);
	}

}
