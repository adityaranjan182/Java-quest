import java.util.Scanner;
public class decimal2anybase
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = scn.nextInt();
        System.out.println("take base: ");
        int r = scn.nextInt();
        convert(n, r);
        scn.close(); 
    }
    public static void convert(int n, int r)
    {
        int digit = 0;
        int k = 0;
        while(n>0)
        {
            int rem = n%r;
            digit += rem*(int)Math.pow(10,k);
            n = n/r;
            k++;
        }
        System.out.println(digit); 
    }
}
