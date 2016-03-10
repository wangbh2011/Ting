package com.demo.info;

public class InterfaceImpl extends InterfaceDemo02 implements InterfaceDemo01 {
	public void say() {
		System.out.println(AUTHOR);
	}

	public String getInfo() {
		return "pretty!";
	}

	public void print() {
		System.out.println("Hello world");
	}

	public static void main(String args[]) {
		InterfaceImpl sun = new InterfaceImpl();
		sun.say();
		sun.getInfo();
		sun.print();

	}

}
