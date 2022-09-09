package _17.funcional_lambda.comparator_com_funcao.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import _17.funcional_lambda.comparator_com_funcao.model.entities.Product;

public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		//Comparator<Product> comp = (p1, p2) -> {
			//return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		//};
			
			//*new Comparator<Product>() {
			//@Override
			//public int compare(Product p1, Product p2) {
			//return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			//}
		//};
		
		list.sort((p1, p2)->p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		//list.sort(new MyComparator());
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
