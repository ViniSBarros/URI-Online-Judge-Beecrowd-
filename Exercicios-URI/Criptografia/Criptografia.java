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