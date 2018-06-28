package com.example.java;

import java.util.Scanner;

public class ExampleString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String: ====== ");
		String name=sc.nextLine();
		
		char[] arr=name.toCharArray();
		String upperAndLower="";
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				char c=name.toUpperCase().charAt(i);
				upperAndLower=upperAndLower+c;
			}
			else upperAndLower=upperAndLower+arr[i];
		}

		System.out.println("Upper and lower case letters: ======== ");
		System.out.println(upperAndLower);
		
		
	}

}
