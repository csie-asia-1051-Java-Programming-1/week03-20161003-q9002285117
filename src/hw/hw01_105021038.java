package hw;

import java.util.Scanner;

public class hw01_105021038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入一個正整數值(不含 0)");
		int v1 = scn.nextInt();
		int sum=0;
		while(v1>0){
		sum=sum+1;
		v1=v1/10;
		}System.out.println(sum);
		
		

	}

}