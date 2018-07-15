package com.imooc.method;

public class MathDemo {

	//求两个int类型数的和
	public int plus(int m,int n) {
		return m+n;
	}
	
	//求两个double类型数的和
	public double plus(double m,double n) {
		return m+n;
	}
	//求数组元素的累加和
	public int plus(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int m=5,n=10;
		int[] arr= {1,2,3,4,5};
		MathDemo mathdemo=new MathDemo();
		System.out.println("int类型的累加和"+mathdemo.plus(m, n));
		System.out.println("double类型的累加和"+mathdemo.plus(5.60,7.80));
		System.out.println("数组元素的累加和"+mathdemo.plus(arr));
	}

}
