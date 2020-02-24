import java.util.Scanner;
public class reverse{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();
        scn.close();
        reverseprint(n);
    }
    public static void reverseprint(int n)
    {
        while (n>0)
        {
            int b = n%10;
            System.out.println(b);
            n = n/10;
        }
    }
}