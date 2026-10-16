package JavaPrograms;

public class VowelsLeftConsonantsRight {

    public static void main(String[] args) {

        String str = "mah@esh123!";

        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        StringBuilder special = new StringBuilder();

        for (char ch : str.toCharArray()) {

            if (Character.isLetter(ch)) {

                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    vowels.append(ch);
                } else {
                    consonants.append(ch);
                }

            } else if (!Character.isDigit(ch)) {
                special.append(ch);
            } else {
                // Keep digits with consonants in the middle
                consonants.append(ch);
            }
        }

        String result = vowels.toString()
                + consonants.toString()
                + special.toString();

        System.out.println(result);
    }
}
