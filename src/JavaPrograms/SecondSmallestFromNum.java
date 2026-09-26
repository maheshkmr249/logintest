package JavaPrograms;

public class SecondSmallestFromNum {

	public static void main(String[] args) {
		int num = 12345;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        while (num > 0) {

            int digit = num % 10;

            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            }
            else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }

            num = num / 10;
        }

        System.out.println("Smallest digit: " + smallest);
        System.out.println("Second smallest digit: " + secondSmallest);

	}

}
