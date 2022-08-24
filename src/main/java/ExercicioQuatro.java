import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] pessoas = new int[10];
		for (int i =0; i< pessoas.length;i++) {
			System.out.print("Informe o valor encontrado no bolso da pessoa "+(i+1)+": ");
			pessoas[i] = ler.nextInt();
			ler.nextLine();
		}
		
		System.out.println("------------------------------------------------");
		
		System.out.print("Informe o valor encontrado com o bandido que confessou: ");
		int bandido = ler.nextInt();
		
		for (int i =0; i< pessoas.length;i++) {
			System.out.println("Valor: "+pessoas[i]);
			
		}
		
		
		System.out.print("Valor encontrado pelo bandido confesso: "+bandido);

	}

}
