package JavaPrograms;
public class ConvertEvenPlaceCharToEvenDigits {
    public static void main(String[] args) {
    String str = "mahesh";
    char[] ch = str.toCharArray();
    int digit = 2;
    for(int i=0;i<ch.length;i++)
    {
      if(i%2==0)
      {
        ch[i]=(char)(digit + '0');
        digit = digit + 2;
      }
    }
    System.out.println(ch);
    }
}