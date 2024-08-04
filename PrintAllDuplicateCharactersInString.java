import java.util.*;
public class Main {
    public static void printDuplicates(String str)
    {
      char[] c=str.toCharArray();
      Arrays.sort(c);
      String s=new String(c);
      for(int i=0;i<str.length();i++)
      {
      int co=1;
      while(i<str.length()-1 && s.charAt(i)==s.charAt(i+1)) 
      {
          co++;
          i++;
      }
        if(co>1) {
      System.out.println(s.charAt(i)+", count:"+co);
                 }
      }
    }
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        printDuplicates(str);
    }
}

