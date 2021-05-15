package memoriaarrayslistas.listas.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");

		System.out.println(list.size());

		list.remove("Ana");

		list.remove(1);

		for (String string : list) {
			System.out.println(string);
		}

		System.out.println("-----------------------");

		list.remove(0);
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String string : list) {
			System.out.println(string);
		}

		System.out.println("-----------------------");

		System.out.println("Index of element: " + list.indexOf("Bob"));
		System.out.println("Index of element: " + list.indexOf("Marco"));

		System.out.println("-----------------------");

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String string : result) {
			System.out.println(string);
		}

		System.out.println("-----------------------");

		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

	}
}
