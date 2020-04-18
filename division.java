import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("take the value of b (divident) = ");
        int b = scn.nextInt();
        System.out.print("take the value of a (divisor) = ");
        int a = scn.nextInt();
        divide(a, b);
        scn.close();
    }

    public static int count(int digit) {
        int temp = 0;
        while (digit > 0) {
            digit = digit / 10;
            temp++;
        }
        return temp;
    }

    public static void divide(int a, int b) {
        if (a != 0) {
            int quotient = 0;
            int temp = 10 * a;
            int Bdigit = count(b);
            while (Bdigit > count(a)) {
                if (temp < b) {
                    b = b - temp;
                    quotient += 10;
                } else {
                    Bdigit--;
                }
            }
            while (b >= a) {
                quotient++;
                b = b - a;
            }
            int remainder = b;
            System.out.println(" Quotient is " + quotient + " and Remainder is " + remainder);
        } else {
            System.out.println("dividing by zero is undermined");
        }
    }
}
