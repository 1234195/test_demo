import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

			

class MinMaxFind {

	Junit1 minMaxFinder;
	@BeforeEach
	void init() {
		minMaxFinder=new Junit1();
	}
	int[] a1= {56,34,7,3,54,3,34,34,54};
	int[] a2= {95,26,30,13,87,40};
	int[] a3= {2,15,35,75,35};
	
	@Test
	void testMaxMin() {
		int[] expected1= {3,56};
		int[] actual1=minMaxFinder.findMinMax(a1);
		int[] expected= {13,95};
		int[] actual=minMaxFinder.findMinMax(a2);
		
		int[] expected2= {2,75};
		int[] actual2=minMaxFinder.findMinMax(a3);
		assertArrayEquals(expected,actual);
		assertArrayEquals(expected1,actual1);
		assertArrayEquals(expected2,actual2);
	}
	
	@Test
	void testMin() {
		int value1=minMaxFinder.getMin(a1);
		int value2=minMaxFinder.getMin(a2);
		int value3=minMaxFinder.getMin(a3);
		assert(value1==3);
		assert(value2==13);
		assert(value3==2);
	}
	
	@Test
	void testMax() {
		int value1=minMaxFinder.getMax(a1);
		int value2=minMaxFinder.getMax(a2);
		int value3=minMaxFinder.getMax(a3);
		assert(value1==56);
		assert(value2==95);
		assert(value3==75);
	}

}
