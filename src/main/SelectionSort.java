package main;

public class SelectionSort {
	public static void doSwap(int[] array, int firstIndex, int secondIndex){
		int copyFirstIndex = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = copyFirstIndex;
		
	}
	
	public static int indexOfMinimum(int[] array, int startIndex){
		int minIndex = startIndex;
		int minValue = array[startIndex];
		
		for (int i = minIndex + 1; i < array.length; i++){
			if (array[i] < minValue){
				minIndex = i;
				minValue = array[i];
			}
		}
		return minIndex;
	}
}
