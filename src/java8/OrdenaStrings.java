package java8;

import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("André");
		palavras.add("Felipe");
		palavras.add("Camargo");
		palavras.add("Leite");

		palavras.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
		palavras.forEach(t -> System.out.println(t));
	}

}
