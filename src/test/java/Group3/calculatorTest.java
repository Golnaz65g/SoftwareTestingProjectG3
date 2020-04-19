package Group3;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTest {

	@Test
	public void addTest() {
		calculator junit= new calculator();
		int result= junit.add(200, 100);
		assertEquals (300,result);
	}

}
