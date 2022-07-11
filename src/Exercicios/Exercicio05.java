package Exercicios;
import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		
		
		int sum = 0;
		int number;
		
		Scanner input = new Scanner(System.in);
		
		do{
			
			System.out.println("Digite um número inteiro: ");
			number = input.nextInt();
			
			sum+=number;
			
		}while(number != 0);
		
		System.out.println("\nA soma dos numeros digitado é: " + sum);
		
		input.close();
	
	}

}
