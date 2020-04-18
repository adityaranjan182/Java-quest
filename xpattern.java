import java.util.Scanner;
public class xpattern
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = scn.nextInt();
        pattern(n);
        scn.close();    
    }
    public static void pattern(int n)
    {
        for (int i = 1;i<=2*n-1;i++)
        {
            for (int j = 1; j<=2*n-1;j++)
            {
                if (i==j || i+j==2*n) 
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println("");
        }
        
    }
}