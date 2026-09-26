package JavaPrograms;
public class MultipleTryExample {

    public static void main(String[] args) {

        try {
            int a = 10 / 2;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}