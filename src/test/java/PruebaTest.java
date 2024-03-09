import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PruebaTest {
	@Test
	public void test01() {
		List<String> lista = new ArrayList<>();
		String hola = "hola";
		lista.add(hola);
		assertTrue(lista.contains("hola"));
		System.out.print("hola mundo");
	}
	

}
