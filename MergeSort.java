//import java.util.ArrayList;

public class MergeSort{
    public static void main(String[] args) {
        int [] A = {2,5,6,1,9,8,7,4};
        int n = A.length;
        merge_sort(A, n);
        display(A, n);
        
    }
    public static void display(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void merge(int left[], int right[], int arr[], int leftcount, int rightcount) 
    {
        int i = 0;int j = 0;int k = 0;
        while (i < leftcount && j < rightcount)
        {
            if (left[i] < right[j])
            {
                arr[k++] = left[i++];
            }
            else
            {
                arr[k++] = right[j++];
            }
        }
        while (i < leftcount)
        {
            arr[k++] = left[i++];
        }
        while (j < rightcount)
        {
            arr[k++] = right[j++];
        }
    }
    public static void merge_sort(int [] arr, int n)
    {
        int mid = n / 2;
        if (n < 2)
        {
            return;
        }
        int [] left = new int[mid];
        int [] right = new int[n-mid];
        for (int i = 0; i < mid; i++)
        {
            left[i] = arr[i];
        }
        for (int j = mid; j < n; j++)
        {
            right[j-mid] = arr[j];
        }
        //display(left,mid);
        //display(right,n-mid);
        merge_sort(left, mid);
        merge_sort(right, n -mid);
        merge(left, right, arr, mid, n - mid);
    }
} 