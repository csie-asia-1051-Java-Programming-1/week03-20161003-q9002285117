package hw;

import java.util.Scanner;

public class hw03_105021038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一正整數");
		int v1 = scn.nextInt();
		int sum = 1;
		for (int i = 1; i <= v1; i++){
			sum=sum*i;
		}System.out.print(sum);
	}


	}


