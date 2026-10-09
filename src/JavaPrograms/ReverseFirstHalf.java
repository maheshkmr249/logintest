package JavaPrograms;

public class ReverseFirstHalf {

	public static void main(String[] args) {
		String str = "mahesh";
		int mid = str.length()/2;
		String result = "";
		for(int i=mid-1;i>=0;i--)
		{
			result = result+str.charAt(i);
		}
		for(int i=mid;i<str.length();i++)
		{
			result = result+str.charAt(i);
		}
		System.out.println(result);
	}
}
