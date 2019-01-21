package polymorphismDemo;



public class Employee {
	
	private int id;
	private String name;
	private double  basicsalary;
	protected double totalsalary;
	private double pf;
	private static int count=1;
	
	public Employee(String name, double basicsalary){
		this.name=name;
		this.id=count++;
		this.pf=0.10*basicsalary;
		this.basicsalary=basicsalary;
		
	}
	
	public double calculateSalary(){
		return this.totalsalary=this.basicsalary+this.pf;
	}
	
	public void print(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(totalsalary);
	}
	
	
}
