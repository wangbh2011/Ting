package com.demo.info;

interface USB { // �����˽��
	public void start();

	public void end();

}

class Computer implements USB {
	public void start() {
		System.out.println("���� USB");
	}

	public void end() {
		System.out.println("�ر�USB");
	}

}

class Flash implements USB {
	public void start() {
		System.out.println("��ӡ������USB");
	}

	public void end() {
		System.out.println("��ӡ���ر�USB");
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
