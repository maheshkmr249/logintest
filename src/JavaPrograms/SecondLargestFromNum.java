package JavaPrograms;

public class SecondLargestFromNum {

	public static void main(String[] args) {
		 int num = 12345;

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        while (num > 0) {

	            int digit = num % 10;

	            if (digit > largest) {
	                secondLargest = largest;
	                largest = digit;
	            }
	            else if (digit > secondLargest && digit != largest) {
	                secondLargest = digit;
	            }

	            num = num / 10;
	        }

	        System.out.println("Largest digit: " + largest);
	        System.out.println("Second largest digit: " + secondLargest);

	}

}
