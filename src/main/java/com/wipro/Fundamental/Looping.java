package com.wipro.Fundamental;
import java.util.Scanner;
public class Looping {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int y=0;
		int a= sc.nextInt();
		int temp=a;
		while(a>0) {
		int x=a%10;
		y=y*10+x;
		a=a/10;
		}
		if(temp==y) {
			System.out.println(y+" is a Palindrome");
		}
		else {
			System.out.println(y+" is not a Palindrome");
		}
	}
}
