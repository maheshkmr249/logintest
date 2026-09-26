package JavaPrograms;

public class ReverseTheWords {
	public static void main(String[] args) {
	      String str = "mahesh kumar malknor";
	      String[] words = str.split(" ");
	      for(int i=words.length-1;i>=0;i--)
	      {
	        System.out.print(words[i]+" ");
	      }
	    }
}
