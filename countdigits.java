import java.util.Scanner;
public class countdigits
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printNumbers(n);
        scn.close();
    }
    public static void count(int n)
    {
        int digit = 0;
        int n1 = n;
        while (n>0)
        {
            n = n/10;
            digit++;
        }
        System.out.println("total no of digits are "+digit);
        int div = (int) Math.pow(10, digit-1);
        while (div!=0)
        {
            int b = n1/div;
            System.out.println(b);
            n1 = n1%div;
            div/=10;
            
        }
    }

    public static void printNumbers(int n){
        if(n==0){
            return;
        }
        printNumbers(n/10);
        System.out.println(n%10);
    }
}