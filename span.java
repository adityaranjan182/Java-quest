import java.util.Scanner;
public class span
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<arr.length;i++)
        {
            arr[i]= scn.nextInt();
        }
        diff(arr);
        scn.close();
    }
    public static void diff(int [] arr)
    {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1;i<arr.length;i++)
        {
            if (max<arr[i])
            {
                max = arr[i];
            }
            if (min>arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("difference of max and min is "+(max-min));
    }
}