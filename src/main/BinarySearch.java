package main;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String args[]){
		int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		int[] unsorted = {12, 5, 60, 14, 13, 78};
		
		int x = 67;
		int result = doSearch(primes, x);
		
		printStatements(primes, result);
		
		int[] primesCopy = primes;
		System.out.println(Arrays.toString(primesCopy));
		SelectionSort.doSwap(primesCopy, 0, 2);
		System.out.println(Arrays.toString(primesCopy));
		System.out.println(SelectionSort.indexOfMinimum(primes, 5));

		System.out.println(Arrays.toString(SelectionSort.sortArray(unsorted)));
		
	}
	

	public static int doSearch(int[] array, int target){
		int min = 0;
		int max = array.length-1;
		
		while (max >= min){
			
		int guess = (min+max)/2;	
		if (array[guess] == target){
			return guess;
		} else if (array[guess] < target){
			min = guess + 1;
		} else if (array[guess] > target){
			max = guess - 1;
		}
		}
		return -1;
	}
	
	public static boolean isPrime(int prime){
		if (prime == -1){
			return false;
		} else return true;
	}
	
	public static void printStatements(int[] array, int number){
		
		if (isPrime(number)){
		System.out.println("The target number is " + array[number]);
		System.out.println("The index of the target number is at " + number);
		}
		else {
			System.out.println("The number is not prime");
		}
	}
	

	
}
