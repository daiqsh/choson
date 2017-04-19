package com.cheers.classloader;

class SuperClass {
	
	public SuperClass() {
		System.out.println("SuperClass...");
	}
	public static int i=0;
	public static void func(){}
	static {
		System.out.println("Static area executed.");
	}
}

