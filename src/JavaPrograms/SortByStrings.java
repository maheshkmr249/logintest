package JavaPrograms;
import java.util.Arrays;

public class SortByStrings {

    public static void main(String[] args) {

        Object[][] emp = {
            {3, "Chethan", 3000},
            {1, "Bala", 1000},
            {2, "Abhijith", 2000}
        };

        Arrays.sort(emp, (a, b) ->
            ((String) a[1]).compareTo((String) b[1])
        );

        for (Object[] e : emp) {
            System.out.println(e[0] + " " + e[1] + " " + e[2]);
        }
    }
}