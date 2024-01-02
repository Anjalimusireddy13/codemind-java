import java.util.Scanner;
public class grade
{
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
        float sub_1 = in.nextFloat();
        float sub_2 = in.nextFloat();
        float sub_3 = in.nextFloat();
        float sub_4 = in.nextFloat();
        float sub_5 = in.nextFloat();

        float total;
        float m;
        float percentage;

        // Calculate total, average and percentage
        total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
        m= (float)(total / 5.0);
        percentage = (float)((total / 500.0) * 100);
     if(m>=90)
     {
         System.out.println("Grade A");
     }
     else if(m>=80&&m<90)
     {
         System.out.println("Grade B");
     }
     else if(m>=70&&m<80)
     {
         System.out.println("Grade C");
     }
     else if(m>=60&&m<70)
     {
         System.out.println("Grade D");
     }
     else if(m>=40&&m<60)
     {
         System.out.println("Grade E");
     }
     else
     {
         System.out.println("Grade F");
     }
    }
}