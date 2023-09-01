import java.util.Scanner;
public class number
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%9==0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}