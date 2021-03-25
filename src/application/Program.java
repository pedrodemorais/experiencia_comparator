package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> lista = new ArrayList();
		lista.add(new Product("TV",1900.00));
		lista.add(new Product("Geladeira",2900.00));
		lista.add(new Product("DVD",300.00));
		lista.add(new Product("Fogao",500.00));
		
		lista.sort(new MyComparator());
		
		for(Product p: lista) {
			System.out.println(p);
			
		}

	}

}
