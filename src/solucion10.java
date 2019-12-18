
public class solucion10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][] = new int[3][3];
	
		System.out.println("######### Aleatoriamente ####################");
		for (int x=0; x < matriz.length; x++) {
			  for (int y=0; y < matriz[x].length; y++) {
			    
			    matriz[x][y] = (int) (Math.random()*20)+1;
			  }
		}
		
		for (int x=0; x < matriz.length; x++) {
			  for (int y=0; y < matriz[x].length; y++) {
			    System.out.print ("|" + matriz[x][y] + "\t|");
			  }
			  System.out.println ("");
		}
		System.out.print("");
		System.out.println("########## Ordenada #########################");
		int t;
		for(int i=0; i < matriz.length; i++){//ordena la matriz de abajo hacia arriba
			for(int j=0;j< matriz[i].length; j++){
			for(int x=0; x < matriz.length; x++){
				for(int y=0; y < matriz[x].length; y++){
						if(matriz[i][j] > matriz[x][y]){
						t = matriz[i][j];
						matriz[i][j] = matriz[x][y];
						matriz[x][y] = t;
			}
				}
			}
			}
	    }
		
		for (int i=matriz.length-1;i>=0;i--){//imprime la matriz ascendentemente
			
			for(int j=matriz.length-1;j>=0;j--){
				
				System.out.print ("|" + matriz[i][j] + "\t|");
			
			}
			
			System.out.println("");
		}
	}

}
