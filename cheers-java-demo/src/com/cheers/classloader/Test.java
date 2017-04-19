package com.cheers.classloader;

public class Test {

	SuperClass cc1 = null;
	
	public static void TestClassLoader(SuperClass w) throws ClassNotFoundException {
//        Class.forName("com.cheers.classloader.SuperClass");
//		SuperClass c = new SuperClass();
//		SuperClass.i = 9;
//		SuperClass.func();
//		new SubClass();
//		Class.forName("com.cheers.classloader.SubClass");
//		//
		ClassLoader.getSystemClassLoader().loadClass("com.cheers.classloader.SuperClass");
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Test.TestClassLoader(null);
	}

}
