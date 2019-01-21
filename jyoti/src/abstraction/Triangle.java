package abstraction;

public class Triangle extends Shape {
	
	public Triangle(int d1, int d2){
	this.d1=d1;
	this.d2=d2;
	}
	
	public void area(){
		this.area=0.5*this.d1*this.d2;
		
	}
}
