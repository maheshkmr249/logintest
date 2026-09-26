package JavaPrograms;

public class SwapFirstAndLastDigit {
	 public static void main(String[] args) {
	      int num = 12345;
	      String str = String.valueOf(num);
	      char[] ch = str.toCharArray();
	      char temp = ch[0];
	      ch[0] = ch[ch.length-1];
	      ch[ch.length-1] = temp;
	      String orignal = new String(ch);
	      System.out.println(orignal);
	    }
}
