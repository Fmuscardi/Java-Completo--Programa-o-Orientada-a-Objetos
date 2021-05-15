package estruturasequencial;

import java.util.Scanner;

public class EscopoInicializacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double price = sc.nextDouble();
		double discount;
		
		if (price > 100.0) {
			discount = price * 0.1;
		} else {
			discount = 0;
		}
		System.out.println(discount);
		
		sc.close();
	}

}
