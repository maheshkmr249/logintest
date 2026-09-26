package JavaPrograms;

public class ReverseEachWord {
	public static void main(String[] args) {
	      String str = "mahesh kumar malknor";
	      String[] words = str.split(" ");
	      
	      for(String w:words)
	      {
	        String reverse="";
	        for(int i=w.length()-1;i>=0;i--)
	        {
	          reverse=reverse+w.charAt(i);
	        }
	        System.out.print(reverse+" ");
	      }
	      
	    }
}
