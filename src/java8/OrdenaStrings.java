package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("André");
		palavras.add("Felipe");
		palavras.add("Camargo");
		palavras.add("Leite");
		
		
		palavras.sort(new ComparadorPorTamanho());
		palavras.forEach(new ConsumidorDeStrings());
	}

}


class ConsumidorDeStrings implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
	}
	
}
