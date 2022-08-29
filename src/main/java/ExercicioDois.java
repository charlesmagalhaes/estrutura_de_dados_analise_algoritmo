import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posição" + i);
            vetorA[i] = scan.nextInt();
        }
 
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        int contador = 0;
		for (int i =0; i <  vetorA.length; i++) {
			contador=0;
			for(int j = 0; j < vetorA[i];j++) {
				if(vetorA[i]%(j+1)==0) {
					contador++;
				}
			}
			
			if(contador==2) {
				System.out.println("Numero primo: "+vetorA[i]+" posição: "+i);
			}

		}
    }
}
