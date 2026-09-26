package JavaPrograms;

public class SecondLargesttFromArray {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4, 5};

	        int first = Integer.MIN_VALUE;
	        int second = Integer.MIN_VALUE;

	        for (int num : arr) {

	            if (num > first) {
	                second = first;
	                first = num;
	            }
	            else if (num > second && num != first) {
	                second = num;
	            }
	        }

	        System.out.println("Largest Element: " + first);
	        System.out.println("Second Largest Element: " + second);

	}

}
