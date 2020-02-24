import java.util.Scanner;
public class gcd_lcm
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        gcd(a, b);
        scn.close();
    }
    public static void gcd(int a, int b)
    {
        int oa = a;
        int ob = b;
        while (b%a != 0)
        {
            int rem = b%a;
            b = a;
            a = rem;
        }
        System.out.println("gcd = "+a);
        System.out.println("lcm = "+(oa*ob)/a);
    }
}