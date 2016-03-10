package com.demo.info;

interface USB { // 定义了借口
	public void start();

	public void end();

}

class Computer implements USB {
	public void start() {
		System.out.println("启动 USB");
	}

	public void end() {
		System.out.println("关闭USB");
	}

}

class Flash implements USB {
	public void start() {
		System.out.println("打印机启动USB");
	}

	public void end() {
		System.out.println("打印机关闭USB");
	}
}

class OutPut {
	public static void imput(USB usb) {
		usb.start();
		usb.end();
	}
}

public class InterfaceDemo03 {
	public static void main(String args[]) {
		OutPut.imput(new Flash());
		OutPut.imput(new Computer());
	}

}
