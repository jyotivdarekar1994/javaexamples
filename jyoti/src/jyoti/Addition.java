package jyoti;

class Addition{
	
	int x = 10;
	
	public void hello() {
		System.out.println("Hello");
	}
	public void display() {
		this.display();
	}
	
	public static void main(String[] args) {
		Addition add = new Addition();
		add.display();
		
		Addition add1 = new Addition();
		add1.display();
	}
	
}