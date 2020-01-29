package core;

import java.util.Scanner;

public class Abc {
	//	int a=10,b;
	//	public void setInfo() {
	//		Scanner in=new Scanner(System.in);
	//		System.out.println("Enter a number:");	
	//		b=in.nextInt();
	//	}
	//a<5 return true or false


	public static void main(String[] args) {
		int b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");	
		b=in.nextInt();
		Boolean abc=result(b);
		System.out.println(abc);
		//Abc a=new Abc();
		//a.setInfo();
		//a.result(b);
	}
	public static Boolean result(int b) {
		int a=10;
		if(a<b) {
			return true;
		}
		else {
			return false;
		}}
}


