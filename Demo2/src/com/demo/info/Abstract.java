package com.demo.info;

import com.sun.accessibility.internal.resources.accessibility;

public class Abstract {
	public static void main(String args[]) {
		B b = new B();
		b.print();
		

	}

}

abstract class A {
	public A(){
		System.out.println("A class");
	}
	public static final String INFO = "pretty";
	private String name;

	public String getName(String name) {
		return this.name;

	};

	public void setName(String name) {
		this.name = name;
	}

	public abstract void print(); // 定义抽象类

}

class B extends A {
	public B(){
		System.out.println("B class");
	}

	@Override
	public void print() {
		System.out.println("name :" + INFO);

	}

}