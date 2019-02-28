package cenfotec.examen.kata;


public class Analitycs {
	public static String[] masLarga(String frase){
		String[] result = new String[3]; 
		result = frase.split(" ");
		String larga = "";
		int maslarga=0;
		
		larga = unaPalabra(result, larga, maslarga);
		return result;	
	}

	private static String unaPalabra(String[] result, String larga, int maslarga) {
		for(int i=0;i<3;i++){
			if(result[i].length() >maslarga) {
				larga = result[i];
			}
			result[0]= larga;
		}
		return larga;
	}
		
		
}


