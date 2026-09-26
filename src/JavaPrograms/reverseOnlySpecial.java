package JavaPrograms;
public class reverseOnlySpecial {

    public static void main(String[] args) {

        String str = "ma!he@sh$";

        char[] ch = str.toCharArray();

        int left = 0;
        int right = ch.length - 1;

        while (left < right) {

            if (Character.isLetterOrDigit(ch[left])) {
                left++;
            }
            else if (Character.isLetterOrDigit(ch[right])) {
                right--;
            }
            //here special chars are changing there positions
            else {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println(new String(ch));
    }
}