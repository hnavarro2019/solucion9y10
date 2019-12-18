import java.util.Scanner;

public class solucion9 {

	public static void main(String args[])
	{
		
			int[] elementos = new int[5];
			
			for (int i=0;i<elementos.length;i++)
			{
				elementos[i] = (int) (Math.random()*20)+1;
			}
			
			System.out.println("######### Aleatoriamente ####################");
	        //-----------------------------
	        for (int i = 0; i < elementos.length; i++) {
	           
	        			System.out.println("_________");
	            		System.out.println("|" + elementos[i] + "\t|");
	            	
	            }
	        System.out.println("_________");
	        
	        int cuentaintercambios=0;
	        for(boolean ordenado=false;!ordenado;){
	            for (int i=0;i<elementos.length-1;i++){
	                if (elementos[i]>elementos[i+1]){
	                    int variableauxiliar=elementos[i];
	                    elementos[i]=elementos[i+1];
	                    elementos[i+1]=variableauxiliar;
	                    cuentaintercambios++;
	                }
	            }
	            if (cuentaintercambios==0){
	                ordenado=true;
	            }
	            cuentaintercambios=0;
	        }
	        
	        System.out.println("########## Ordenada #########################");
	        //-----------------------------
	        for (int i = 0; i < elementos.length; i++) {
	           
	            		System.out.println("_________");
	            		System.out.println("|" + elementos[i] + "\t|");
	            	
	            }
	        System.out.println("_________");
	        System.out.println("#############################################");
		
	}
	
}
