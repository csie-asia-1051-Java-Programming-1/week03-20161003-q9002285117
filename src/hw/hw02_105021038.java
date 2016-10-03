package hw;

import java.util.Scanner;

public class hw02_105021038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請輸入幾個數");
int v1=scn.nextInt();
int a=0;
int b=0;
int c=0;
int data[]=new int[v1];
for(int i=0;i<v1;i++){
	data[i]=scn.nextInt();
}
for(int i=0;i<v1;i++){
	if(data[i]>0){
		a++;
		
	}else if(data[i]==0){
		b++;
	}else {
		c++;
	}
}
System.out.println("正數"+a+"零"+b+"負數"+c);


	}
}
