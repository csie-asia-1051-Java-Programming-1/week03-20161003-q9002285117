package hw;

import java.util.Scanner;

public class hw04_105021038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.print("輸入一個正整數");
		int v1 = scn.nextInt();
		int sum = 1, i = 1;
		while (i <= v1) {
			sum = sum * i;
			i++;
		}
		System.out.print(sum);

	}

}
