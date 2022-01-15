package javaTraning;

public class Main {
	public static void main(String[] args) {
		/*
		 * lesson1(); lesson2();
		 */
		/*
		 * System.out.println("お名前は？"); Scanner scanner = new Scanner(System.in); String
		 * name=scanner.next();
		 * 
		 * System.out.println("おいくつ？"); int age=scanner.nextInt();
		 */
		
		/*
		 * lesson3_1("Toma"); lesson3_1("shohe");
		 */
		Person.hello();
	    
		Person person = new Person("tanaka");
		System.out.println(person.name);
		System.out.println(person.name);
		Person person2 = new Person("tanaka2");
		System.out.println(person2.name);
		Person.count();
	}
	public static void lesson1() {
		// lesson1
		int length =6;
		int height =8;
		double number1 = 8.5;
		double number2 = 3.4;
		
		System.out.println("hello,world!");
		System.out.println("やぁjava");
		System.out.println(5);
		System.out.println(5+2);		
		System.out.println(12/3);		
		System.out.println(3*6);		
		System.out.println(8%3);		
		System.out.println("こんにちは" + "世界");		
		System.out.println("38"+"19");		
		System.out.println(38+19);		
		int number;
		number =3;
		System.out.println(number);
		String name;
		name="wanko";
		System.out.println(name);
		
		System.out.println("面積は"+length * height);
		System.out.println("合計は"+ (number1 + number2));
		System.out.println("合計は"+ (double)5/ 2);
		
	}

	public static void lesson2() {
		//lesson2
		String[] names = {"ninja","wanko","hituji"};
	    boolean bool = 3*9 == 27;
	    
	    // 変数boolの値を出力してください
	    System.out.println(bool);
	    
	    //whilt
	    //int n=0;
	    //while (n <=100) {
	    //	System.out.println(n);
	    //	n++;
	    //}
	    
	    //for
	    for(int i =0;i<=5;i++) {
	    	
	    	if(i==3) {
	    		break;
	    	}else {
		    	System.out.println(i);
	    	}
	    }
	    
	    for (String name1:names) {
	    	System.out.println(name1);
	    }
	
	}
	
	public static void lesson3_1(String name) {
		System.out.println(name);
	}
	
	public static int add(int number1 , int number2) {
		return number1 + number2;
	}
	

}
