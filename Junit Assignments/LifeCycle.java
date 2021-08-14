import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifeCycle 
{
	Junit4 LH;
	
	@BeforeAll
	static void beforeAll() 
 {
		System.out.println(" running before all");
	}
	
	@BeforeEach
	void init() {
		LH=new Junit4();
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("running After each Method");
	}
	
	@Test
	void Add()
	{
		int expected=10;
		int actual=LH.add(8,2);
		assertEquals(expected,actual,"addtion");
	}
	
	@Test
	void Divide()
	{
		assertThrows(ArithmeticException.class,()->LH.divide(10, 0),"divide by zero throws exception");
	}
	
	@Test
	void AreaCircle()
	{
		assertEquals(314.1592653589793,LH.AreaC(10.0),"return area of circle");
	}
	
	@AfterAll
	static void afterAll()
	{
		System.out.println("running after all");
		
	}


	
	
	
}
