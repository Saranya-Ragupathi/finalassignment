package in.ineuron.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {

		 // Create a large dataset of integers
        List<Integer> numbers = Arrays.asList(10, 1, 5, 8, 3, 15, 20, 12, 7, 2, 4, 17, 11, 6, 9, 13, 19, 14, 16, 18);
        
        // Use the Stream API to filter out numbers less than or equal to 10
        List<Integer> filteredNumbers = numbers.stream().filter(n -> n > 10).toList();
        System.out.println("Filtered numbers: " + filteredNumbers);
        
        // Use the Stream API to sort the numbers in ascending order
        List<Integer> sortedNumbers = numbers.stream().sorted().toList();
        System.out.println("Sorted numbers: " + sortedNumbers);
	}

}
