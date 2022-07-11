package Exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		
		int idade, contador21 = 0, contador50 = 0;
		
		System.out.println("Digite uma idade: ");
		idade = entrada.nextInt();
		
		while(idade != -99) {
			
			System.out.println("Para encerrar digite -99");
			idade = entrada.nextInt();
			
			if(idade < 21 && idade >= 0) {
				
				contador50++;
				
				
			}
			else if (idade > 50) {
				
				contador50++;
				
				
			}
		System.out.println("O total de pessoas com menos de 21 anos " + contador21);
		System.out.println("O total de pessoas com mais de 50 anos " + contador50);			
		}
		

		
	}
	

}
