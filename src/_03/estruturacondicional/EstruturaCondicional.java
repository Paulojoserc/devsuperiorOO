package _03.estruturacondicional;

import java.util.Scanner;

public class EstruturaCondicional {
	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int hora;

			System.out.println("Que horas s�o ?");
			hora = sc.nextInt();

			if (hora < 12) {
				System.out.println("Bom dia");
			} else if (hora >= 12 && hora < 18) {
				System.out.println("Boa tarde");
			} else {

				System.out.println("Boa noite");

			}

			sc.close();

		}
}
