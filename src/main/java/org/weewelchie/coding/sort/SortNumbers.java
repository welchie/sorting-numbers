package org.weewelchie.coding.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * In a language of your choice, using all best practice principles you’re aware of, could you please provide code that reads a list of 10 numbers ranging between 1 to 100.
Assuming there are 4 duplicates in the list of numbers, the output should remove the duplicates and sort the remaining numbers in descending order. Please state any assumptions you’ve made.
 * 
 * Decided to use the HashSet implementation as this ensures that duplicates are not stored in the list. 
 * Another approach would be to use a standard Array, use Arrays.sort and then loop though skipping duplicate values.
 * @param args
 * @author welch
 */
public class SortNumbers {
	
	public static void main (String[] args)
	{
		Integer[] numbersTest1 = {1, 21, 25, 30, 30, 15, 100, 89, 89, 10}; 
		Integer[] numbersTest2 = {10, 20, 20, 5, 5, 55, 55, 100 , 100, 10}; 
		Integer[] numbersTest3 = {100, 100, 100, 100, 99, 99, 1, 2 , 16, 20}; 
		Integer[] numbersTest4 = {1, 1, 2, 2, 2, 2, 2, 2 , 99, 53}; 
		Integer[] numbersTest5 = {-1, 1, 2, 2, 2, 2, 2, 2 , -99, 53};
		
		SortNumbers s = new SortNumbers();
		
		//Remove duplicates and sort 
		List<Integer> numbersWithDuplicates = new ArrayList<Integer>(Arrays.asList(numbersTest1));
		s.removeduplicatesAndSortUsingHashSet(numbersWithDuplicates);
		
		numbersWithDuplicates = new ArrayList<Integer>(Arrays.asList(numbersTest2));
		s.removeduplicatesAndSortUsingHashSet(numbersWithDuplicates);
		
		numbersWithDuplicates = new ArrayList<Integer>(Arrays.asList(numbersTest3));
		s.removeduplicatesAndSortUsingHashSet(numbersWithDuplicates);
		
		numbersWithDuplicates = new ArrayList<Integer>(Arrays.asList(numbersTest4));
		s.removeduplicatesAndSortUsingHashSet(numbersWithDuplicates);
		
		numbersWithDuplicates = new ArrayList<Integer>(Arrays.asList(numbersTest5));
		s.removeduplicatesAndSortUsingHashSet(numbersWithDuplicates);
		
	}
	
	/**
	 * Assumptions:
	 *      There can be any number of duplicates.
	 *      Positive and negative numbers can be in the list
	 *      Using HashSet that does not use duplicates
	 * @param numbers
	 * @author welch
	 */
	public void removeduplicatesAndSortUsingHashSet(List<Integer> numbers)
	{
		System.out.println("Orginal data: " + numbers);
		//Using a HashSet removes the duplicates
		List<Integer> listWithoutDuplicates = new ArrayList<Integer>( new LinkedHashSet<Integer>(numbers));
		System.out.println("Unsorted data without duplicates: " + listWithoutDuplicates);
		
		//Collections.sort gives sorting in an ascending order, Collections.reversOrder() puts it into descending order.
		Collections.sort(listWithoutDuplicates, Collections.reverseOrder());
		System.out.println("Sorted data in descending order: " + listWithoutDuplicates);
		System.out.println("-----------------------");
	}
	
}
