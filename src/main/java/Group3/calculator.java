package Group3;

public class calculator {
	@Test
	
	public int add(int a, int b) {
		return a+b;
	}
	
	@Test
	
	public void subTest() {
		calculator junit= new calculator();
		int result= junit.sub(300, 100);
		assertEquals (200,result);
	}
	
	@Test
	
	public void mulTest() {
		calculator junit= new calculator();
		int result= junit.mul(20, 20);
		assertEquals (400,result);
	}
	
	@Test
	
	public void divTest() {
		calculator junit= new calculator();
		int result= junit.div(8, 4);
		assertEquals (2,result);
	}
	
	@Test
	public void squareTest() {
		calculator junit= new calculator();
		int result= junit.square(5);
		assertEquals(25, result);
		
	}
}
