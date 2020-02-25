import java.util.Scanner;
public class array_sum
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int [] arr1 = new int[a];
        int [] arr2 = new int[b];
        System.out.println("enter arr1 = ");
        for (int i=0;i<arr1.length;i++)
        {
            arr1[i] = scn.nextInt();
        }
        System.out.println("enter arr2 = ");
        for (int i = 0; i<arr2.length;i++)
        {
            arr2[i] = scn.nextInt();
        }
        print_sum(arr1, arr2);
        scn.close();
    }
    public static void print_sum(int[] arr1, int[] arr2)
    {
        System.out.println("arr_sum = ");
        int c = arr1.length - arr2.length;
        if (c>0)
        {
            for (int i = 0; i<c;i++)
            {
                System.out.println(arr1[i]);
            }
            for (int i = 0; i<arr2.length;i++)
            {
                System.out.println(arr2[i]+arr1[i+c]);
            }
        }
        else
        {
            for (int i = 0; i<-c;i++)
            {
                System.out.println(arr2[i]);
            }
            for (int i = 0; i<arr1.length;i++)
            {
                System.out.println(arr1[i]+arr2[i-c]);
            }
        }
    }
}
