package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("André");
		palavras.add("Felipe");
		palavras.add("Camargo");
		palavras.add("Leite");
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.sort(comparador);
		System.out.println(palavras);
		
	}

}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
	}
	
}
