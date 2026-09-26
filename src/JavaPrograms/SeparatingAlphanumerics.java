package JavaPrograms;

public class SeparatingAlphanumerics {
	public static void main(String[] args) {
	      String str = "Mahesh1@kumar2#Malknor3$";
	      String Alphabets ="";
	      String Numerics ="";
	      String Specials ="";
	      for(int i=0;i<str.length();i++)
	      {
	        char ch = str.charAt(i);
	        if(Character.isAlphabetic(ch))
	        {
	          Alphabets=Alphabets+ch;
	        }
	        else if(Character.isDigit(ch))
	        {
	          Numerics=Numerics+ch;
	        }
	        else
	        {
	          Specials = Specials+ch;
	        } 
	      }
//	      System.out.println("Alphabets are: "+Alphabets);
//	      System.out.println("Numerics are: "+Numerics);
//	      System.out.println("Specials are: "+Specials);
	      System.out.println(Alphabets + "," +Numerics+", "+Specials);
	      }
}
