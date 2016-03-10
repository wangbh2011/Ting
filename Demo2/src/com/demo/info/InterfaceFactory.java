package com.demo.info;

interface Fruit {
	public void eat();
}

class Apple implements Fruit {
	public void eat() {
		System.out.println("��ƻ��");
	}
}

class Orange implements Fruit {
	public void eat() {
		System.out.println("������");
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
		
		// ��Ҫ��ƻ��
		fruit = Factory.getInstance("apple");
		eateFruit(fruit);
		// ��Ҫ������
		fruit = Factory.getInstance("orange");
		eateFruit(fruit);

	}
	
	private static void eateFruit(Fruit fruit){
		if (fruit != null) {
			System.out.println("����Ҫ��------>");
			fruit.eat();
			System.out.println("");
		}
		
	}

}
