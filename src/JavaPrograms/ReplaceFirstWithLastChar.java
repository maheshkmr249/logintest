package JavaPrograms;
public class ReplaceFirstWithLastChar {
    public static void main(String[] args) {
    String str = "mahesh kumar malknor";
    String[] words = str.split(" ");
    for(int i=0;i<words.length;i++)
    {
      char[] ch = words[i].toCharArray();
      char temp= ch[0];
      ch[0]=ch[ch.length-1];
      ch[ch.length-1]=temp;
      words[i] = new String(ch);
      
    }
    for(int i=0;i<words.length;i++)
    {
      System.out.println(words[i] +" ");
    }
    }
}