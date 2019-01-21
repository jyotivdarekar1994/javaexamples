package polymorphismDemo;

public class SalesPerson extends Employee{
	
	private int no_of_sales;
	private double petrol;
	
	public SalesPerson(String name, double basicsalary, int ns, int km, double petrol){
		super(name, basicsalary);
		this.no_of_sales=ns;
		this.petrol=50*km;
	}
	public double calculateSalary(){
		this.totalsalary=super.calculateSalary()+this.no_of_sales+this.petrol;
		return this.totalsalary;
	}
}
