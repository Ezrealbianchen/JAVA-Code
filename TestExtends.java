package com.Ezreal;

class Person {
	
	private String name;
	private int age;
	public Person() {
		
		System.out.println("����Person�޲ι��췽��");
	}
	
	public Person(String name,int age) {
		this();
		this.name = name;
		this.age  = age ;
		System.out.println("�����вεĹ��췽��");
		
	}
	public void show() {
		System.out.println("����:"+name+"����:"+age);
		
	}
}

class Student extends  Person {
	private String department;
	public Student() {
		
		System.out.println("���������޲ι��췽��");
	}
	
	public Student(String name,int age,String dep) {
		
		super(name,age);
		this.department = dep;
		System.out.println("����"+dep+"���ŵ�ѧ��!");
		System.out.println("�����������вι��췽��");
	}
	
	
}


public class TestExtends {
	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student("Ұ��",23,"����");
		stu1.show();
		stu2.show();
	}
	
}
