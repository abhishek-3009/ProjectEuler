package com.abhi.basic;

import java.util.Scanner;

public class DimWeightCalc {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		do{
			System.out.println("Enter length: ");
			int length=s.nextInt();
			System.out.println("Enter width: ");
			int width=s.nextInt();
			System.out.println("Enter height: ");
			int height=s.nextInt();
			int temp= length*width*height;
			int dimWeight= temp/250;
			System.out.println("Dim Weight is : "+dimWeight);
			System.out.println("Another Calculation? Enter 0 to exit");
			int str= s.nextInt();
			if(str==0) {
				break;
			}
			
		}while(1==1);
		s.close();
		
	}

}
