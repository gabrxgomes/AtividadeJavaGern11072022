package Exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Informar todos os números de 1000 a 1999 que quando divididos por 11
		//obtemos resto = 5. (FOR)
		
		
		for (int i=1000; i < 2000; i++){ //inteiro i vale 1000 o valor base, enquanto i for menor que 2000 ou seja 1999 porque o maximo tem q ser 1999
		    if (i%11==5) {
		        System.out.println(i);
		    }
		}
	}

}
