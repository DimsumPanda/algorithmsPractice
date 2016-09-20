package test;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;
import main.SelectionSort;

public class TestSort {

	
	@Test
	public void testSwap1(){
		int[] array = {1,3,4};		
		int[] expectedResult = {4,3,1};
		SelectionSort.doSwap(array, 0, 2);
		assertTrue(Arrays.equals(array, expectedResult));
	}
	
	@Test
	public void testSort(){
		int[] primes = {5, 12, 1, 15, 78, 3};
		int minimumIndex = SelectionSort.indexOfMinimum(primes, 3);
		assertEquals(minimumIndex, 5);
	}
	
	@Test
	public void testSort2(){
		int[] primes = {5, 12, 1, 15, 78, 3};
		int minimumIndex = SelectionSort.indexOfMinimum(primes, 1);
		assertEquals(minimumIndex, 5); //fail on purpose
	}
	@Test
	public void testSort3(){
		int[] primes = {5, 12, 1, 15, 78, 3};
		int minimumIndex = SelectionSort.indexOfMinimum(primes, 1);
		assertEquals(minimumIndex, 2);
	}
}
