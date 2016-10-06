package hw;

import java.util.Scanner;

public class hw02_105021038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);

int i=1;
int a=0;
int b=0;
int c=0;
while(i==1){
	System.out.println("請輸入一個整數");
	int v1=scn.nextInt();
	if(v1>0)
	{
		a=a+1;
	}else if(v1==0)
	{
		b=b+1;
	}else if(v1<0)
	{
		c=c+1;
	}System.out.println("是否繼續輸入(1=要 2=不要)");
	int v2=scn.nextInt();
	if(v2==2)
	{
		i=0;
	}
}
System.out.println("正數"+a+"零"+b+"負數"+c);


	}
}
