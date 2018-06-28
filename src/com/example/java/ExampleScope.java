package com.example.java;

public class ExampleScope {
    int x=0;
    public void method() {
    	int x=1;
    	System.out.println(" local variable x value is: "+x);
    }
	
	
	public static void main(String[] args) {
		ExampleScope es=new ExampleScope();
		System.out.println("Instance variable x value is: "+es.x);
		es.method();

	}

}
