package JavaPrograms;

public class FindSecondMaxDigitFromString {

	public static void main(String[] args) {
		
		String str= "mah23e56sh";
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				int digit = ch-'0';
				if(digit>largest)
				{
					secondlargest = largest;
					largest = digit;
				}
				else if(digit>secondlargest && digit!=largest)
				{
					secondlargest = digit;
				}
			}
		}
		System.out.println("Second largest is: "+secondlargest);
	}
}
