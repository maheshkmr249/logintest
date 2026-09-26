package JavaPrograms;

public class UpperAndLowerCase {

	public static void main(String[] args) {
		
		      String str = "mahesh kumar malknor";
		      String[] words = str.split(" ");
		      StringBuilder sb = new StringBuilder();
		      for(String w:words)
		      {
		        for(int i=0;i<w.length();i++)
		        {
		          if(i%2==0)
		          {
		            sb.append(Character.toUpperCase(w.charAt(i)));
		          }
		          else
		          {
		            sb.append(Character.toLowerCase(w.charAt(i)));
		          }
		        }
		        sb.append(" ");
		      }
		      System.out.println(sb);
		    }

	}


