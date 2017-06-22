package com.Ezreal;

class Animal1 {
	private void beat() {
		System.out.println("心脏跳动");
	}
	
	public void breath() {
		this.beat();
		System.out.println("呼吸");
	}
	
}

class Wolf {
	private Animal1 a;
	
	public Wolf(Animal1 a) {
		this.a = a;
	}
	
	public void run(){
		System.out.println("我在奔跑");
	}
	
	public void breath(){
		a.breath();
	}
	
}

class Bird1 {
	private Animal1 a;
	
	public Bird1(Animal1 a){
		this.a = a;
	}
	
	public void fly(){
		System.out.println("我在飞");
	}
	public void breath(){
		a.breath();
	}
}

public class TestConsist {
	public static void main(String[] args) {
		Animal1 a = new Animal1();
		a.breath();
		
		Bird1 b = new Bird1(a);
		b.breath();
		b.fly();
		
		Wolf w = new Wolf(a);
		w.breath();
		w.run();
	
	}
}
