package JavaPrograms;

public class FindSecondMinDigitFromString {

	public static void main(String[] args) {
		String str= "mah23e56sh";
		int min = Integer.MAX_VALUE;
		int secondmin = Integer.MAX_VALUE;
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				int digit = ch-'0';
				if(digit<min)
				{
					secondmin = min;
					min = digit;
				}
				else if(digit>min && digit<secondmin)
				{
					secondmin = digit;
				}
			}
		}
		System.out.println("Second minimum is: "+secondmin);
	}
}
