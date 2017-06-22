package com.Ezreal;

abstract class Shape{
	
	protected String name;
	public Shape(String name) {
		this.name = name;
		System.out.println("名称:"+name);
	}
	
	abstract public double getArea();
	abstract public double getLength();
		
}

class Circle extends Shape{
	private final double Pi = 3.14;
	private double radius;
	
	public Circle(String name,double r){
		super(name);
		this.radius = r;
	}
	
	public double getArea() {
		return Pi*Pi*radius;
	}
	
	public double getLength() {
		return 2*Pi*radius;
	}
}

class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	public Rectangle(String name,double width,double height) {
		
		super(name);
		this.height = height;
		this.width  = width;
	}
	
	public double getArea(){
		return width*height;
	}
	
	public double getLength(){
		return 2*(width+height);
	}
}

public class TestAbstuct {
	public static void main(String[] args) {
	
		Shape rect = new Rectangle("长方形",6.5,10.3);
		System.out.println("面积="+rect.getArea());
		System.out.println("周长="+rect.getLength());
		Shape circle = new Circle("圆",10.2);
		System.out.println("面积="+circle.getArea());
		System.out.println("周长="+circle.getLength());
	}	
}
