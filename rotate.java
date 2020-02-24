import java.util.Scanner;
public class rotate
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        rotatenum(n, k);
        scn.close();
        
    }
    public static void rotatenum(int n, int k)
    {
        int temp = n;
        int count = 0;
        while(n>0)
        {
            n = n/10;
            count++;
        }
        if (k>count){
            k = k%count;
        }
        if (k<0){
            k = count+k;
        }
        double div = Math.pow(10,k);
        int qut = (int)(temp/div);
        int rem = (int)(temp%div);
        int num = rem*((int)Math.pow(10, count-k));
        int newnum = num + qut;
        System.out.println(newnum);
    }
}