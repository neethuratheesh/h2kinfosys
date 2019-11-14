package com.learn.third;

public class Constructor {
	/* Constructor in Java  - You can Overload them
	 * 1. Access Modifier
	 * 2. Method name = className
	 * 3. parameters  - arguments or inputs in ()
	 * 4. Method Body {}
	 * 5. Exception - we will discuss this later (in exception handling)
	 */
	public Constructor(String param) {
		System.out.println("This is Simplest Constructor of class :: "+ param);
	}
	
	public Constructor() {
		System.out.println("This is Simplest Constructor of class no-arg:: ");
	}
	
	public static void main(String[] args) {
		// ClassName objectName = new ClassName()
		// ClassName() <-- this is constructor
		Constructor construct1 = new Constructor("With Param");
		Constructor construct2 = new Constructor();
		

	}

}
