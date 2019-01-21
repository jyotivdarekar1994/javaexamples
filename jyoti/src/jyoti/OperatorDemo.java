package jyoti;

public class OperatorDemo {
	
	public static void main(String[] args){
		
		
		int a=5;
		System.out.println(a++);
		System.out.println(a);
		a++;
		a--;
		int b=5;
		int d=5;
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
		
		int c=a+++b+++d++;
		System.out.println(c);
		int e=++a+b+++d;
		System.out.println(e);
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(c);
		
		
		
	}

}
