package memoriaarrayslistas.boxingunboxingwrapperclasses.boxingunboxing.application;

public class Program {

	public static void main(String[] args) {
		
		int x = 20;
		Object obj1 = x;
		Integer obj2 = x;
		
		
		System.out.println(obj1);
		
		// Object (Tipo primitivo)
		
		int y = (int) obj1;
		
		System.out.println(y);
		
		// Integer (Wrapper Class)
		
		y = obj2 * 2;
		
		System.out.println(y);
		
		

	}

}
