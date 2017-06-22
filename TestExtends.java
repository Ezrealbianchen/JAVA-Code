package com.Ezreal;

class Person {
	
	private String name;
	private int age;
	public Person() {
		
		System.out.println("调用Person无参构造方法");
	}
	
	public Person(String name,int age) {
		this();
		this.name = name;
		this.age  = age ;
		System.out.println("调用有参的构造方法");
		
	}
	public void show() {
		System.out.println("姓名:"+name+"年龄:"+age);
		
	}
}

class Student extends  Person {
	private String department;
	public Student() {
		
		System.out.println("调用子类无参构造方法");
	}
	
	public Student(String name,int age,String dep) {
		
		super(name,age);
		this.department = dep;
		System.out.println("我是"+dep+"部门的学生!");
		System.out.println("调用了子类有参构造方法");
	}
	
	
}


public class TestExtends {
	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student("野马",23,"机电");
		stu1.show();
		stu2.show();
	}
	
}
