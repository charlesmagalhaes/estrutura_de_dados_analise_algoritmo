
public class ExercicioDois {

	public static void main(String[] args) {
		int[] numerosInteiros = {11, 8, 13, 19, 22, 25, 29, 33, 15, 44};
		
		int contador =0;
		for (int i =0; i <  numerosInteiros.length; i++) {
			contador=0;
			for(int j = 0; j < numerosInteiros[i];j++) {
				if(numerosInteiros[i]%(j+1)==0) {
					contador++;
				}
			}
			
			if(contador==2) {
				System.out.println("Numero primo: "+numerosInteiros[i]+" posição: "+i);
			}
			
		}
	

	}

}
