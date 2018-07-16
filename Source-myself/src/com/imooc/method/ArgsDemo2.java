package com.imooc.method;
/**
 * 关于可变参数列表和重载的问题
 * @author ray
 * @version 1.0
 */
public class ArgsDemo2 {
	
	//求两个整数的和
	//可变参数列表所在的方法是最后被访问的
	/*
	public int plus(int a,int b) {
		System.out.println("不带可变参数的方法被调用!");
		return a+b;
	}*/
	
	public int plus(int... a) {
		int sum=0;
		for(int n:a) {
			sum=sum+n;
		}
		System.out.println("带可变参数列表的方法被调用");
		return sum;
	}
	public static void main(String[] args) {
		ArgsDemo2 ad2=new ArgsDemo2();
		System.out.println(ad2.plus(1,2));

	}

}
