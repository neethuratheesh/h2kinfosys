package com.learn.third;

public class TestInheritance {

	public static void main(String[] args) {
	//	SubClass sub = new SubClass();
	//	System.out.println(sub.superclassString);
	//	sub.checkSuperMethod();
		
		// ClassName objectName = new Constructor()
		// ReferenceType object = new InstanceType()
		// Parent instance = new Child()
		SuperClass superClass = new SubClass();
		System.out.println(superClass.superclassString);
		superClass.checkSuperMethod();
		// 
		
		//SuperClass superClassInstance = new SuperClass("overloaded");
		// try to access Object Methods 
		
		
		
		
	}

}
