/*
https://www.beecrowd.com.br/judge/pt/problems/view/1168

beecrowd | 1168
LED
Autor Desconhecido

João quer montar um painel de leds contendo diversos números. Ele não possui muitos leds, e não tem certeza se conseguirá montar o número desejado. Considerando a configuração dos leds dos números abaixo, faça 
um algoritmo que ajude João a descobrir a quantidade de leds necessário para montar o valor.

		 _     _  _       _   _  _   _   _ 
		| | |  _| _| |_| |_  |_   | |_| |_|
		|_| | |_  _|   |  _| |_|  | |_|  _|
		

Entrada
A entrada contém um inteiro N, (1 ≤ N ≤ 1000) correspondente ao número de casos de teste, seguido de N linhas, cada linha contendo um número (1 ≤ V ≤ 10100) correspondente ao valor que João quer montar com os leds.

Saida
Para cada caso de teste, imprima uma linha contendo o número de leds que João precisa para montar o valor desejado, seguido da palavra "leds".

				-------------------------------------------------
				|  Exemplo de Entrada	|	  Exemplo de Sa�da  |
				|  3                    |                  	    |
				|  115380               |   27 leds       	    |
				|  2819311              |   29 leds       	    |
				|  23456                |   25 leds        	    |
				-------------------------------------------------
*/
import java.util.Scanner;

public class LED {
  
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("informe o numero de casos: ");
	    int N = scanner.nextInt();
	    int sequencia[] = new int[N];
      
	    for(int i = 0; i < N; i++) {
	    	
	    	int total = 0;
        
	    	System.out.println("\nInforme o numero: ");
	    	sequencia[i] = scanner.nextInt();
        
	    	String string = String.valueOf(sequencia[i]);
	    	String[] separado = string.split("");
        
	    	for(int j = 0; j < separado.length; j++){
	    		
	    		switch (separado[j]) {
				case "0":
				case "6":
				case "9":
					total += 6;
					break;
					
				case "1":
					total += 2;
					break;
					
				case "2":
				case "3":
				case "5":
					total += 5;
					break;

				case "4":
					total += 4;
					break;
					
				case "7":
					total += 3;
					break;
					
				case "8":
					total += 7;
					break;
					
				default:
					throw new IllegalArgumentException("Unexpected value: " + separado[j]);
            }
          }
          System.out.println(total + " leds");
      }
    scanner.close();
	} 
}
