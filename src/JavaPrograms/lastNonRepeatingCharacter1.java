package JavaPrograms;

public class lastNonRepeatingCharacter1 {

	public static void main(String[] args) {
		String str = "programming";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		char[] ch = rev.toCharArray();
		
		for(char c:ch)
		{
			if(str.indexOf(c)==str.lastIndexOf(c))
			{
				System.out.println(c);
				break;
			}
		}
	}
}
