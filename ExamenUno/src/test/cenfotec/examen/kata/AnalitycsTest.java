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

}
