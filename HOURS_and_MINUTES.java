import java.util.Scanner;
public class convert
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int hours=n/60;
        int minutes=n%60;
        System.out.printf("%d Hour(s) %d Minute(s)",hours,minutes);
    }
}