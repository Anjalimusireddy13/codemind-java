import java.util.Scanner;
public class climate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        if(c>20)
        {
            System.out.println("HOT");
        }
        else
        {
            System.out.println("COLD");
        }
    }
}