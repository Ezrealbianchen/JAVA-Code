package com.Ezreal;

abstract class Inner {
	String name;
}

public class AppTest {
	public static void main(String[] args) {
		(
				new Inner(){
					void setName(String name) {
						this.name = name;
						System.out.println("name:"+this.name);
					}
				}
		).setName("�Ż�");		
		
	}
	
}
