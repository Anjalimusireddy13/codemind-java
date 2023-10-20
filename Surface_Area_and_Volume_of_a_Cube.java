import java.util.*;
public class cube
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,area,volume;
        s=sc.nextInt();
        area=(6*(s*s));
        volume=(s*s*s);
    System.out.printf("Surface area = %d and Volume = %d",area,volume);
    }
}