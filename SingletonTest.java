package com.Ezreal;

class Singleton{
	final private void test() {
		System.out.println("���෽��");
	}
	private void print() {
		System.out.println("���෽��");
	}
}

public class SingletonTest extends Singleton{
	final private void test() {
		System.out.println("���෽��");
	}
	
	private void print() {
		System.out.println("���෽��");
	}
	public static void main(String[] args) {
		(new SingletonTest()).test();
		
		
	}
}