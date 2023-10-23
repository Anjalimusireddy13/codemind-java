import java.util.Scanner;
public class Convert_Second
 {
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
	    int seconds = in.nextInt();
        int sec = seconds % 60;
        int hour = seconds / 60;
        int min = hour % 60;
        hour = hour / 60;
        System.out.printf("H:M:S-"+ hour + ":" + min + ":" + sec);
    }
 }