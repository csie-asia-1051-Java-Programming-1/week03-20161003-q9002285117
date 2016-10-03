package ex;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021038 傅琬鈞
 */
import java.util.Scanner;
public class ex05_105021038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int v1=scn.nextInt();
		if(v1%2==0){
			System.out.print("偶數");
		}else{
			System.out.print("奇數");
		}
		
	}

}
