package polymorphismDemo;


public class Manager extends Employee  {
	private double projectallo;
	public Manager(String name, double basicsalary, double projectallo) {
		super(name, basicsalary);
		this.projectallo=projectallo;
	}
	
	public double calculateSalary(){
		this.totalsalary = super.calculateSalary() + this.projectallo;
		return this.totalsalary;
	}
}
