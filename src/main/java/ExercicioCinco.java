import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayEscrita[] arrayEscrita = new ArrayEscrita[3];
		
		arrayEscrita[0] = new ArrayEscrita();
		arrayEscrita[1] = new ArrayEscrita();
		arrayEscrita[2] = new ArrayEscrita();
		
		do {
			
			for(int i = 0; i <  arrayEscrita.length; i++) {
				if(arrayEscrita[i].getModificado() == false) {
					System.out.print("Digite o valor array "+(i+1)+" : ");
					arrayEscrita[i].setValor(ler.nextInt());
					arrayEscrita[i].setModificado(true);
				}else {
					System.out.println("Esse valor não pode mais ser modificado, pois já foi modificado uma vez!");
				}
				
			 }
			
			System.out.println();
			System.out.print("Digite 1 para voltar ao For ou 0 para sair ");
		} while ( ler.nextInt() == 1);
		
		

		

		ler.close();
		System.out.println("Programa finalizado!!!");
	}

}
