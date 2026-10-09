package JavaPrograms;

public class ReverseLast2chars {

	public static void main(String[] args) {
		String str = "mahesh";
		String result = str.substring(0, str.length()-2)
						+str.charAt(str.length()-1)
						+str.charAt(str.length()-2);
		System.out.println(result);
	}
}
