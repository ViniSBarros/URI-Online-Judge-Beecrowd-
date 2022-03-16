/*
 * https://www.beecrowd.com.br/judge/pt/problems/view/1253
 * 
 * beecrowd | 1253
 * Cifra de C�sar
 * Autor: TopCoder - USA
 * 
 * J�lio C�sar usava um sistema de criptografia, agora conhecido como Cifra de C�sar, que trocava cada letra pelo equivalente em duas posi��es adiante no alfabeto (por exemplo, 'A' vira 'C', 'R' vira 'T', etc.). 
 * Ao final do alfabeto n�s voltamos para o come�o, isto � 'Y' vira 'A'. N�s podemos, � claro, tentar trocar as letras com quaisquer n�mero de posi��es.
 * 
 * Entrada
 * 
 * A entrada cont�m v�rios casos de teste. A primeira linha de entrada cont�m um inteiro N que indica a quantidade de casos de teste. Cada caso de teste � composto por duas linhas. A primeira linha cont�m uma string 
 * com at� 50 caracteres mai�sculos ('A'-'Z'), que � a senten�a ap�s ela ter sido codificada atrav�s desta Cifra de C�sar modificada. A segunda linha cont�m um n�mero que varia de 0 a 25 e que representa quantas 
 * posi��es cada letra foi deslocada para a direita.
 * 
 * Sa�da
 * 
 * Para cada caso de teste de entrada, imprima uma linha de sa�da com o texto decodificado (transformado novamente para o texto original) conforme as regras acima e o exemplo abaixo.
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
		
		System.out.println("Quantos teste voc� deseja realizar? ");
		int N = leitor.nextInt();
		
		leitor.nextLine();
		
		for(int i = 0; i < N; i++) {
			
			do {
				System.out.println("Informe a senten�a a ser codificada: ");
				sentenca = leitor.nextLine();
				sentenca = sentenca.toUpperCase();
				
				} while(sentenca.length() > 50);
				
			do {
				System.out.println("Informe quantas posi��es as letras ser�o deslocadas: ");
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
