package polymorphismDemo;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("Started");
		
		Employee e1=new Employee("Jyoti", 20000);
		e1.calculateSalary();
		e1.print();
		
		Manager m1 = new Manager("Vikas", 20000.0,5000);
		m1.calculateSalary();
		m1.print();
		
		SalesPerson s1=new SalesPerson("Aarav", 20000, 5, 10, 10);
		s1.calculateSalary();
		s1.print();
		
		System.out.println("Completed");
	}
}
