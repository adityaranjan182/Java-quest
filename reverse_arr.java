//import java.util.Scanner;
public class reverse_arr
{
    public static void main(String[] args) 
    {
        int [] arr = {4,5,2,8,3,0,9};
        reversing(arr);
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
    public static void reversing(int[]arr)
    {
        for (int i=0;i<=(arr.length)/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
}