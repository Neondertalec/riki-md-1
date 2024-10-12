import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.venta.SomeRandomFunctionality;

public class SomeRandomFunctionalityTest {

	@Test
	void FivePlusSeverEqualsTwelve(){
		SomeRandomFunctionality instance = new SomeRandomFunctionality();
		assertEquals(12, instance.sum(5, 7));
	}
}
