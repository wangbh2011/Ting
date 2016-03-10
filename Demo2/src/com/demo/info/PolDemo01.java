package com.demo.info;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.swing.internal.plaf.basic.resources.basic;

class Au {
	public void fun1() {
		System.out.println("A: method 1");
	}

	public void fun2() {
		System.out.println("A: method 2");
	}
}

class Bu extends Au {
	public void fun1() {
		System.out.println("B: method 1");
	}

	public void fun3() {
		System.out.println("B: method 3");
	}
}

class Cu extends Au {
	public void fun1() {
		System.out.println("C: method 1");
	}
	public void fun4() {
		System.out.println("C: method 4");
	}


}

public class PolDemo01 {
	public static void main(String args[]) {
		// Au au = new Bu(); //向上转型
		// Bu bu = (Bu)au; //向下转型
		// au.fun1();
		// au.fun2();
		// bu.fun1();
		// bu.fun2();
		// bu.fun3();
		fun(new Bu());
		fun(new Cu());
	}

	public static void fun(Au a) {
		a.fun1();
		if (a instanceof Bu) {
			Bu b = (Bu)a;
			b.fun3();
		}

	}

}
