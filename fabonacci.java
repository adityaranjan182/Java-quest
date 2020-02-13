import java.util.Scanner;
public class fabonacci{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("n: ");
        int n = scn.nextInt();
        scn.close();
        printfabo(n);
    }
    public static void printfabo(int n)
    {
        int a = 0;
        int b = 1;
        for (int i = 0; i<n; i++)
        {
            System.out.println((i+1)+" :"+a);
            int c = a+b;
            a = b;
            b = c;
        }

    }
}