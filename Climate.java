import java.util.Scanner;
public class number
{
  public static void main(String args[])
  {
      int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      if(n>20)
      {
         System.out.println("HOT");
      }
      else
      {
          System.out.println("COLD");
      }
  }
}