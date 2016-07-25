package com.snapdeal;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		String num = getStatic();
		try {
			System.out.println(Integer.parseInt(num));
		} catch (Exception e) {
			System.out.println("error while parsing");
		}
	}
	
	public static String getStatic()
	{
		String test="";
		return test;
	}
}
