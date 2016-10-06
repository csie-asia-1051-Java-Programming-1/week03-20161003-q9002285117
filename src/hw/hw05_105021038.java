package hw;

import java.util.Scanner;
public class hw05_105021038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入n");
		int n = scn.nextInt();
		int a = 0;
		for(int i = 1;i<=n;i++){
			a = a  +(i*(i+1));	
		}
		System.out.println(a);
		
		
	}

}
