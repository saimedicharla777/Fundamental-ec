package com.wipro.Fundamental;

import java.util.Scanner;

public class Test {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("Even number:"+a);
		}
		else {
			System.out.println("Odd number:"+a);
		}
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		if(b>c && b>d) {
			System.out.println(b+"is greater than "+c +"and "+d);
		}
		else if(c>b && c>d) {
			System.out.println(c+"is greater than "+b +"and "+d);
		}
		else {
			System.out.println(d+"is greater than "+b +"and "+c);
		}
		
			
	}
	

}
