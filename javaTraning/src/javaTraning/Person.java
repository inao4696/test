package javaTraning;

import java.util.Scanner;

public class Person {
	public String name;
	public String firstname;
	public static int count =0;
	
	Person(String name){
		System.out.println("インスタンスが作成されました");
		this.name = name;
		Person.count = count +1;
		System.out.println(Person.count);
	}
	
	Person(String name,String firstname){
		System.out.println("インスタンスが作成されました");
		this.name = name;
		this.firstname = firstname;
	}
	
	public static void hello() {
		System.out.println("hello");
	}
	
	public  void name() {
		System.out.println("名前は？");
		Scanner scanner = new Scanner(System.in); 
		String name=scanner.next();
		System.out.println(name);
	}
	
	public static void count() {
		System.out.println(Person.count);
	}

}
