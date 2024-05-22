package listaDosArray;

import java.util.Scanner;

public class somaDosVetores {

	public static void main(String[] args) {
		//declaração de variavel
		int a[] = new int[5];
		int som=0;
		Scanner ler = new Scanner(System.in);

		//entrada de dados
		for(int i =0; i<=4; i++) {
			System.out.println("Informe um número: ");
			a[i]= ler.nextInt();

			som += a[i];
		}


		//saida de dados
		if (som >= 30) {
			System.out.println("O resultado da soma é: " +som +", um núemro maior que 30");
		} else {
			System.out.println("O resultado da soma é: " +som +". um núemro menor que 30");
		}

		ler.close();

	}

}
