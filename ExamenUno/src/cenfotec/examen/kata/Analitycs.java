package cenfotec.examen.kata;


public class Analitycs {
	public static String[] masLarga(String frase){
		String[] arreglo = new String[3]; 
		arreglo = frase.split(" ");
		String larga = "";
		String[] result = new String[3];
		int maslarga=0;
		
		larga = unaPalabraLarga(arreglo, larga, maslarga);
		return result;	
	}

	private static String unaPalabraLarga(String[] result, String larga, int maslarga) {
		for(int i=0;i<3;i++){
			if(result[i].length() >maslarga) {
				larga = result[i];
			}
			result[0]= larga;
		}
		return larga;
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


