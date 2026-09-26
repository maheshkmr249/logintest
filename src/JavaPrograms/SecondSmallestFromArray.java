package JavaPrograms;

public class SecondSmallestFromArray {

	public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

        int minimum = Integer.MAX_VALUE;
        int secondMinimum = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {

            if (a[i] < minimum) {
                secondMinimum = minimum;
                minimum = a[i];
            }
            else if (a[i] < secondMinimum && a[i] != minimum) {
                secondMinimum = a[i];
            }
        }

        System.out.println("Minimum: " + minimum);
        System.out.println("Second Minimum: " + secondMinimum);
    }
}
