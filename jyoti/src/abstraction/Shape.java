package abstraction;

public abstract class Shape {
	protected int d1;
	protected int d2;
	protected double area;
	
	public Shape(){
	this.d1=d1;
	this.d2=d2;
}
	public Shape(int d1){
	this();
	this.d1=d1;
}
	public Shape(int d1, int d2){
	this.d1=d1;
	this.d2=d2;
}
		public abstract void area();
		public void print(){
			
		}

}
