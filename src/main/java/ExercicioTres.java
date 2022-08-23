
public class ExercicioTres {

	public static void main(String[] args) {
		String[] carroModelo = {"Fusca", "Vectra", "Gol", "Uno", "Palio"};
		double[] quilometrosPorLitro = {10.9, 11.6, 9.1, 10.3, 13.2 };
		
		double consumoAuxiliar = 0;
		int index = 0;
		
		for(int i = 0; i < carroModelo.length; i++) {
			if(quilometrosPorLitro[i]>consumoAuxiliar) {
				consumoAuxiliar = quilometrosPorLitro[i];
				index = i;
			}
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.println("	Modelo mais econômico é o "+carroModelo[index]);
		System.out.println("-------------------------------------------------------");
		
		for(int i = 0; i < carroModelo.length; i++) {
			System.out.printf("Carro Modelo: "+carroModelo[i]+" - "+"Litros consumidos em 1000km : %.2f %n",1000/quilometrosPorLitro[i]);
		}
	

	}

}
