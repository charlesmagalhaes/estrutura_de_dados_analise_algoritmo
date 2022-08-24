import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] valorPorPessoa = new int[10];
		for (int i =0; i< valorPorPessoa.length;i++) {
			System.out.print("Informe o valor encontrado no bolso da pessoa "+(i+1)+": ");
			valorPorPessoa[i] = ler.nextInt();
			ler.nextLine();
		}
		
		System.out.println("----------------------------------------------------");
		
		System.out.print("Informe o valor encontrado com o bandido que confessou e roubou o menor valor: ");
		int valorBandidoConfesso = ler.nextInt();
		
		System.out.println("------------------------------------------------------");
		
		int totalValorRoubado = 0;
		String pessoaBandida = "";
		
		for (int i =0; i< valorPorPessoa.length;i++) {
			if (valorPorPessoa[i] >= valorBandidoConfesso && valorPorPessoa[i]%10 == 0) {
				totalValorRoubado += valorPorPessoa[i];
				pessoaBandida +="Pessoa "+ (i+1)+ ", ";
			}
			
		}
		
		
		System.out.println("Total do valor roubado: "+totalValorRoubado+" reais");
		
		System.out.println("------------------------------------------------------");
		
		System.out.print("Pessoa(s) que roubaram/roubou: "+pessoaBandida);

	}

}
