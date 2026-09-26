package JavaPrograms;

public class ReverseSpecificWord {
	public static void main(String[] args) {
	      String str = "Learning java and selenium";
	      String[] words = str.split(" ");
	      String w=words[0];
	      String rev="";
	      for(int i=w.length()-1;i>=0;i--)
	      {
	        rev=rev+w.charAt(i);
	      }
	    System.out.println(rev+" "+words[1]+" "+words[2]+"  "+words[3]);
}
}