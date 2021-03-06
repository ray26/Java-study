package com.imooc.animal;

public class Animal {
	/*
	 * public:允许在任意位置进行访问 
	 * private:只允许在本类中访问
	 * protected:当前类可以访问，同包子类/任意类型，跨包子类可以调用，跨包非子类不允许，
	 * 默认（不加任何修饰符）：允许在当前类，同包子类/非子类,调用正常，跨包子类/非子类,不允许调用
	 */
	private String name;//昵称
	private int month;//月份
	private String speices;//品种
	private static int st1=22;
	public static int st2=23;
	
	static{
		System.out.println("我是父类的静态代码块");
	}
	{
		 System.out.println("我师父类的构造代码块");
	}
	//父类的构造不允许被继承，不允许被重写
	public Animal() {
		System.out.println("我是子类的无参构造代码");
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpeices() {
		return speices;
	}

	public void setSpeices(String speices) {
		this.speices = speices;
	}
	//吃东西
	public void eat() {
		System.out.println(this.getName()+"在吃东西");
	}
	
	private String sleep(String name) {
		return "";
	}
}
