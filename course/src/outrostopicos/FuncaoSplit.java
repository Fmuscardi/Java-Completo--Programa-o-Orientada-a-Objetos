package outrostopicos;

import java.util.Scanner;

public class FuncaoSplit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);

		sc.close();
	}
}
