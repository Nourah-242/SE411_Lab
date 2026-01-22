package SE411_Labs;
import java.util.Arrays;
import java.util.List;

public class App {
	
	
	public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
	
	 public static double sumNumbers(List<? extends Number> list) {
	        double sum = 0;
	        for (Number num : list) {
	            sum += num.doubleValue();
	        }
	        return sum;
	    }
	
	public static void main(String[] args) {
		
	
		        // a) PrintableList of Strings
		        String[] wordArray = {"Hello", "Generics", "In", "Java"};
		        PrintableList<String> stringList = new PrintableList<>(wordArray);

		        System.out.println("Printing Strings:");
		        stringList.printAll();

		        System.out.println("-----");

		        // b) PrintableList of Integers
		        Integer[] nums = {10, 20, 30, 40};
		        PrintableList<Integer> intList = new PrintableList<>(nums);

		        System.out.println("Printing Integers:");
		        intList.printAll();
		        
		     // Test with Integer
		        NumberBox<Integer> intBox = new NumberBox<>();
		        intBox.setItem(10);
		        System.out.println("Integer item: " + intBox.getItem());
		        System.out.println("Integer sum: " + intBox.add(5));  // 10 + 5

		        System.out.println("-----");

		        // Test with Double
		        NumberBox<Double> doubleBox = new NumberBox<>();
		        doubleBox.setItem(2.5);
		        System.out.println("Double item: " + doubleBox.getItem());
		        System.out.println("Double sum: " + doubleBox.add(1.2)); // 2.5 + 1.2
		    
		        List<String> words = Arrays.asList("Hello", "Wildcards");
		        List<Integer> ints = Arrays.asList(1, 2, 3, 4);
		        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.0);

		        System.out.println("Printing Strings:");
		        printList(words);

		        System.out.println("-----");

		        System.out.println("Printing Integers:");
		        printList(ints);

		        System.out.println("-----");

		        printList(words);
		        printList(ints);

		        System.out.println("Sum of Integers: " + sumNumbers(ints));
		        System.out.println("Sum of Doubles: " + sumNumbers(doubles));
	
	
	}
		}

	


