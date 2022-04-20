/*
 * https://www.beecrowd.com.br/judge/pt/problems/view/1024
 * 
 * beecrowd | 1024
 * Criptografia
 * Autor: Neilor Tonin - Brasil
 * 
 * Solicitaram para que você construisse um programa simples de criptografia. Este programa deve possibilitar enviar mensagens codificadas sem que alguém consiga lê-las.
 * O processo é muito simples. São feitas três passadas em todo o texto.
 *
 * Na primeira passada, somente caracteres que sejam letras minúsculas e maiúsculas devem ser deslocadas 3 posições para a direita, segundo a tabela ASCII: letra 'a' 
 * deve virar letra 'd', letra 'y' deve virar caractere '|' e assim sucessivamente. Na segunda passada, a linha deverá ser invertida. Na terceira e última passada, todo e 
 * qualquer caractere a partir da metade em diante (truncada) devem ser deslocados uma posição para a esquerda na tabela ASCII. Neste caso, 'b' vira 'a' e 'a' vira '`'.
 *
 * Por exemplo, se a entrada for “Texto #3”, o primeiro processamento sobre esta entrada deverá produzir “Wh{wr #3”. O resultado do segundo processamento 
 * inverte os caracteres e produz “3# rw{hW”. Por último, com o deslocamento dos caracteres da metade em diante, o resultado final deve ser “3# rvzgV”.
 *
 * Entrada
 * 
 * A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém um inteiro N (1 ≤ N ≤ 1*104), indicando a quantidade de linhas que o 
 * problema deve tratar. As N linhas contém cada uma delas M (1 ≤ M ≤ 1*103) caracteres.
 * 
 * Saída
 * 
 * Para cada entrada, deve-se apresentar a mensagem criptografada.
 * 
 * 
 */

import java.util.Scanner;

public class Criptografia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String mensagem, codificado;
		int asciiValue = 0;

		System.out.println("Digite a quantidade de casos de teste a ser realizados: ");
		int N = sc.nextInt();
		sc.nextLine();
		
		String[] mensagem_final = new String[N];
		
		for (int i = 0; i < N; i++) {
			
			codificado = "";
		
			System.out.println("Digite a mensagem que será codificada: ");
			mensagem = sc.nextLine();
			
				for (int j = 0; j < mensagem.length(); j++) {
					if (Character.isLetter(mensagem.charAt(j))) {
						asciiValue = (int) mensagem.charAt(j) + 3;
						codificado += (char) asciiValue;
					} else 
						codificado += mensagem.charAt(j);
				}
			
			StringBuilder strb = new StringBuilder(codificado);
			codificado = strb.reverse().toString();
			
			char[] dividido = codificado.toCharArray();
			
				for (int j = 0 ; j < dividido.length ; j++) {
					if(j >= dividido.length / 2) {
						asciiValue = (int) dividido[j] - 1;
						dividido[j] = (char) asciiValue;
					}
					mensagem = String.valueOf(dividido);
				}
			mensagem_final[i] = mensagem;
		}	
		
		for(int i = 0;i < N; i++) {
			System.out.println(mensagem_final[i]);
		}
		
		sc.close();
	}
}