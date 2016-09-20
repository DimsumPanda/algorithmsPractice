package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import main.BinarySearch;

public class testSwap {

	
	@Test
	public void testSwap1(){
		int[] array = {1,3,4};		
		int[] expectedResult = {4,3,1};
		BinarySearch.doSwap(array, 0, 2);
		assertTrue(Arrays.equals(array, expectedResult));
	}
}
