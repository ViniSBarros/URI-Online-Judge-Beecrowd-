/*
 * https://www.beecrowd.com.br/judge/pt/problems/view/1253
 * 
 * beecrowd | 1253
 * Cifra de César
 * Autor: TopCoder - USA
 * 
 * Júlio César usava um sistema de criptografia, agora conhecido como Cifra de César, que trocava cada letra pelo equivalente em duas posições adiante no alfabeto (por exemplo, 'A' vira 'C', 'R' vira 'T', etc.). 
 * Ao final do alfabeto nós voltamos para o começo, isto é 'Y' vira 'A'. Nós podemos, é claro, tentar trocar as letras com quaisquer número de posições.
 * 
 * Entrada
 * 
 * A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. Cada caso de teste é composto por duas linhas. A primeira linha contém uma string 
 * com até 50 caracteres maiúsculos ('A'-'Z'), que é a sentença após ela ter sido codificada através desta Cifra de César modificada. A segunda linha contém um número que varia de 0 a 25 e que representa quantas 
 * posições cada letra foi deslocada para a direita.
 * 
 * Saída
 * 
 * Para cada caso de teste de entrada, imprima uma linha de saída com o texto decodificado (transformado novamente para o texto original) conforme as regras acima e o exemplo abaixo.
 * 
 * 
 */

import java.util.Scanner;

public class CifraDeCesar {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String sentenca, codificado = new String();
		char codigo;
		int chave = 0;
		
		System.out.println("Quantos teste você deseja realizar? ");
		int N = leitor.nextInt();
		
		leitor.nextLine();
		
		for(int i = 0; i < N; i++) {
			
			do {
				System.out.println("Informe a sentença a ser codificada: ");
				sentenca = leitor.nextLine();
				sentenca = sentenca.toUpperCase();
				
				} while(sentenca.length() > 50);
				
			do {
				System.out.println("Informe quantas posições as letras serão deslocadas: ");
				chave = leitor.nextInt();
				
				leitor.nextLine();
				
				} while(chave < 0 || chave > 25);
			
					for(int j = 0; j < sentenca.length(); j++) {
			
						int value[] = new int[sentenca.length()];
						int newValue[] = new int[sentenca.length()];
						
						value[j] = (int) sentenca.charAt(j);
						newValue[j] = value[j] - chave;
						
						if(newValue[j] < 65) {
							newValue[j] += 26;
						}
						
						codigo = (char) newValue[j];
						
						codificado += codigo;
						
					}
					System.out.println(codificado);
					codificado = "";
		}
		leitor.close();
	}
 }
