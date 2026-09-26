package JavaPrograms;

public class FirstNonRepeating {

	public static void main(String[] args) {
		String str = "programming";
		char[] ch = str.toCharArray();
		
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
