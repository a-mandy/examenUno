package test.cenfotec.examen.kata;
import cenfotec.examen.kata.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;


public class AnalitycsTest {
	@Test
	public void masLargaTest() {
		String[] result = new String[3];
		
		result = Analitycs.masLarga("todo uno pi");
		
		assertEquals("todo",result, "debería devolverla palabra: todo");
		
	}
	@Test
	public void masCortaTest() {
		String frase = "yo casota casa";
		
		String[] arreglo = new String[3];
		arreglo[0]= "yo";
		arreglo[1]= "";
		
		String[] result= Analitycs.masCorta(frase);
		
		assertEquals("yo",result,"El resultado debería ser: yo ");
	}
	
	@Test
	public void primeraMasLargaTest() {
		
	}

}
