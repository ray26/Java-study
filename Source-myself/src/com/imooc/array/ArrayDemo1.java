package com.imooc.array;

import java.util.Scanner;

public class ArrayDemo1 {
	
	public static void main(String[] args) {
		//定义整型数
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		//从键盘接受数据，为数组赋值
		for(int i=0;i<=4;i++) {
			System.out.println("请输入第"+(i+1)+"个元素");
			a[i]=sc.nextInt();
		}
		System.out.println("数组元素的内容为:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("使用增强型for循环输出数组内容");
		for(int n:a) {
			System.out.print(n+"   ");
		}
		//求数组元素的累加和
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
