import java.util.Scanner;
public class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double N=sc.nextDouble();
        double M=sc.nextDouble();
        double C=(N+M)/2;
        System.out.printf("%.4f",C);
    }
}