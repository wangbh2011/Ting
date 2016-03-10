package com.demo.info;

interface Fruit {
	public void eat();
}

class Apple implements Fruit {
	public void eat() {
		System.out.println("吃苹果");
	}
}

class Orange implements Fruit {
	public void eat() {
		System.out.println("吃橘子");
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
		Fruit fruit;
		
		// 我要吃苹果
		fruit = Factory.getInstance("apple");
		eateFruit(fruit);
		// 我要吃橘子
		fruit = Factory.getInstance("orange");
		eateFruit(fruit);

	}
	
	private static void eateFruit(Fruit fruit){
		if (fruit != null) {
			System.out.println("我想要吃------>");
			fruit.eat();
			System.out.println("");
		}
		
	}

}
