package JavaPrograms;

public class AlphaNumericSeperation {

	public static void main(String[] args) {
		String str = "mahesh1!kumar2@malknor$3";
	      String Alphabets = str.replaceAll("[^a-zA-z]","");
	      System.out.println(Alphabets);
	      String Numerics = str.replaceAll("[^0-9]","");
	      System.out.println(Numerics);
	      String Specials = str.replaceAll("[A-Za-z0-9]", "");
	      System.out.println(Specials);

	}

}
