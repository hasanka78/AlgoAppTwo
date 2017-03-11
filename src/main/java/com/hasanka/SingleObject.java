package com.hasanka;

public class SingleObject {
	
	private static SingleObject ins = new  SingleObject();
	
	private SingleObject() {
	}
	
	public static SingleObject getInstance(){
		return ins;
	}
	
	void showMessage(){
		System.out.println("hi from singleton obj");
	}

}
