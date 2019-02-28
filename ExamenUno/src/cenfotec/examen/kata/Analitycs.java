package cenfotec.examen.kata;


public class Analitycs {
	public static String[] masLarga(String frase){
		String[] arreglo = new String[3]; 
		arreglo = frase.split(" ");
		
		String[] result = new String[3];
		int maslarga=0;
		
		result = unaPalabraLarga(arreglo, maslarga, result);
		return result;	
	}

	private static String[] unaPalabraLarga(String[] arreglo,  int maslarga ,String[] result) {
		int larga = 0;
		for(int i=0;i<3;i++){
			if(arreglo[i].length() >larga) {
				larga = arreglo[i].length();
				result[0]= arreglo[i];
			}else {
				if(arreglo[i].length()==larga) {
			
					result[i]= arreglo[i];
				}
			}
			
		}
		return result;
	}
		
	public static String[] masCorta(String frase) {
		String[] arreglo,result = new String[3];
		arreglo = frase.split(" ");
		
		String palabra = arreglo[0];
		
		for(int i=1; i<arreglo.length;i++) {
			if(palabra.length()< arreglo[i].length()) {
				result[0]=arreglo[0];
			}
		}
		
		return result;
	}
}


