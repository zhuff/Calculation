package testing;

public class Calculation {
	

	public static int sub(int a, int b){
		return a - b;
		
	}
	
	public static int mul(int a, int b){
		return a * b;
		
	}
	
	public static int div(int a, int b){
		return a / b;
		
	}
	
	
	public static void main(String[] args){
		
		System.out.println("sub:" + sub(16,4));
		System.out.println("mul:" + mul(16,4));
		System.out.println("div:" + div(16,4));
		
	}
	

}
