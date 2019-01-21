package jyoti;

public class StarForlLoop {
	
	public static void main(String[] args) {
		int i;
		int j;
		//char line;
		
		/*for(i=0; i<=4;i++)
		{
			for(j=0; j<=4; j++){
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
		for(i=0; i<=4;i++)
		{
			for(j=i; j<=4; j++){
				System.out.print("*");
			}
			System.out.println("\n");
		}
	*/
		/*for(i=0; i<=4;i++)
		{
			for(j=0; j<=i; j++){
				System.out.print("*");
			}
			System.out.println("\n");
		}*/
		
		for(i=4; i<=4;i--)
		{
			for(j=i; j<=i; j--){
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	
}
