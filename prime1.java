import java.util.Scanner;
public class prime1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number 'a': ");
        int a = scn.nextInt();
        System.out.println("enter another number 'b': ");
        int b = scn.nextInt();
        scn.close();
        allprime(a,b);
    }
    public static void allprime(int a,int b)
    {
        int flag;
        for(int i=a;i<b;i++)
        {
            flag=1;
            for(int k=2;k<=(int)i/2;k++)
            {
                if(i%k==0)
                {
                    flag=0;
                    break;
                }
                
            }
            if(flag==1)
            {
                System.out.println(i);
            }
            
        }
    }
}
