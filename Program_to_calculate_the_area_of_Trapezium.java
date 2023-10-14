import java.util.Scanner;
public class trapezium
{
    public static void main(String args[])
    {
        double a,b,h;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        h=sc.nextDouble();
        double area=((a+b)/2)*h;
        System.out.printf("%.4f",area);
    }
}