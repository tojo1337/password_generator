package com.example;
import java.util.Random;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) throws Exception{
		//TODO add the loading stub in here
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Character : ");
		int charNum = Integer.parseInt(sc.nextLine());
		System.out.print("Number of password to generate : ");
		int countNum = Integer.parseInt(sc.nextLine());
		char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
					'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
					'!','@','#','$','%','^','^','&','*','(',')','-','_','+','=','.',',',';',':'
					,'1','2','3','4','5','6','7','8','9','0'};
		System.out.println("Length of array : "+arr.length);
		int len = arr.length;
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<countNum;i++){
			for(int j=0;j<charNum;j++){
				int rint = rand.nextInt(len);
				sb.append((char)arr[rint]);
			}
			System.out.println(sb.toString());
			sb.setLength(0);
		}
	}
}