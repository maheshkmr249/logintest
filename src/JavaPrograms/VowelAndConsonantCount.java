package JavaPrograms;

public class VowelAndConsonantCount {

	public static void main(String[] args) {
		String str = "MaheshkuMarmalknor";
	     int vowelcount=0;
	     int consonatcount=0;
	     char[] ch = str.toCharArray();
	     for(char c:ch)
	     {
	      if("aeiouAeiou".indexOf(c)!=-1)
	      {
	        vowelcount++;
	      }
	      else
	      {
	        consonatcount++;
	      }
	     }
	     System.out.println(vowelcount);
	     System.out.println(consonatcount);
	}
}
