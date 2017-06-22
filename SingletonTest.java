package com.Ezreal;

class Singleton{
	final private void test() {
		System.out.println("父类方法");
	}
	private void print() {
		System.out.println("父类方法");
	}
}

public class SingletonTest extends Singleton{
	final private void test() {
		System.out.println("子类方法");
	}
	
	private void print() {
		System.out.println("子类方法");
	}
	public static void main(String[] args) {
		(new SingletonTest()).test();
		
		
	}
}