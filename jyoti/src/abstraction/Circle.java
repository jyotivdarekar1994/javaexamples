package abstraction;

public class Circle extends Shape{
	public Circle(int d1){
		super(d1);
	}
	public void area(){
		this.area=3.14*this.d1*this.d1;
		
	}
}
