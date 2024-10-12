import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.venta.SomeRandomFunctionality;

public class SomeRandomFunctionalityTest {

	@Test
	void FivePlusSevenEqualsTwelve(){
		SomeRandomFunctionality instance = new SomeRandomFunctionality();
		assertEquals(12, instance.sum(5, 7));
	}

	@Test
	void FiveTimesSevenEqualsTwelve(){
		SomeRandomFunctionality instance = new SomeRandomFunctionality();
		assertEquals(35, instance.mult(5, 7));
	}

	@Test
	void FiveDividedBySevenEqualsTwelve(){
		SomeRandomFunctionality instance = new SomeRandomFunctionality();
		assertEquals(0, instance.divide(5, 7));
	}
}
