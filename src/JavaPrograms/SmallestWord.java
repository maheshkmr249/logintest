package JavaPrograms;

public class SmallestWord {

	public static void main(String[] args) {
		String str = "This is selenium and java";
	      String[] words = str.split(" ");
	      String smallestword = words[0];
	      for(String w:words)
	      {
	        if(w.length()<smallestword.length())
	        {
	          smallestword=w;
	        }
	      }
	      System.out.println("Smallest word is: "+smallestword);
	}
}
