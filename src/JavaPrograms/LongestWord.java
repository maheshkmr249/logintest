package JavaPrograms;

public class LongestWord {

	public static void main(String[] args) {
		String str = "This is selenium and java";
	      String[] words = str.split(" ");
	      String longestword = "";
	      for(String w:words)
	      {
	        if(w.length()>longestword.length())
	        {
	          longestword=w;
	        }
	      }
	      System.out.println("Longest word is: "+longestword);
	}
}
