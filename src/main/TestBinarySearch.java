package main;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBinarySearch {

	@Test
	public void testBinarySearch(){
		
		int[] byFives = {5,10,15,20,25,30,35,40,45};
		int target = 25;
		
		assertEquals(4, BinarySearch.doSearch(byFives, target));
	}
	@Test
	public void testBinarySearch2(){
		
		int[] byFives = {5,10,15,20,25,30,35,40,45};
		int target = 25;
		
		assertEquals(3, BinarySearch.doSearch(byFives, target));
	}
	
}
