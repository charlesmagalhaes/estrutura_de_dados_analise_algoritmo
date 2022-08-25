
public class ExercicioUm {

	public static void main(String[] args) {
		 int[][] tabuada = new int[10][10];
		 String espaco="";
		 
		 System.out.println("                 Array bidimensional: Tabuada 10x10");
		 System.out.println("----------------------------------------------------------------------");

	        for (int i = 0; i < tabuada.length; i++) {
	            for (int j = 0; j < tabuada.length; j++) {
	            	tabuada[i][j] = i+j;
	            	if(i+j<10) {	            	
	            		espaco = " ";  
	            	}
	                System.out.print(j+"+"+i+"="+tabuada[i][j]+espaco+"|");
	                espaco ="";
	            }
	            	System.out.println();
	        }

	}

}
