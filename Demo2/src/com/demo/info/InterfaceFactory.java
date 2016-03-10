package com.demo.info;

interface Fruit {
	public void eat();
}

class Apple implements Fruit {
	public void eat() {
		System.out.println("³ÔÆ»¹û");
	}
}

class Orange implements Fruit {
	public void eat() {
		System.out.println("³ÔéÙ×Ó");
	}

}

class Factory {
	public static Fruit getInstance(String className) {
		Fruit fruit = null;
		if ("apple".equals(className)) {
			fruit = new Apple();
		}
		if ("orange".equals(className)) {
			fruit = new Orange();

		}

		return fruit;

	}
}

public class InterfaceFactory {
	public static void main(String args[]) {
		Fruit fruit = Factory.getInstance(args[0]);
		if (fruit != null) {
			fruit.eat();

		}

	}

}
