import java.util.Scanner;
public class frequency
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        digitfrequency(n, d);
        scn.close();
    }
    public static void digitfrequency(int n, int d)
    {
        int count = 0;
        while (n>0)
        {
            int rem = n%10;
            if (rem == d)
            {
                count += 1;
            }
            n = n/10;
        }
        System.out.println("count of "+d+" is "+count);
    }
}