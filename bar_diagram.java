import java.util.Scanner;
public class bar_diagram
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i =0 ; i<arr.length;i++)
        {
            arr[i] = scn.nextInt();
        }
        print_bar(arr);
        scn.close();
    }
    public static int max_term(int [] arr)
    {
        int max = arr[0];
        for (int i=0; i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static void print_bar(int [] arr)
    {
        for (int i= bar_diagram.max_term(arr);i>=1;i--)
        {   
            for (int j=0;j<arr.length;j++)
            {   
                if (arr[j]>=i)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
