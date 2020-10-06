
/*
Sample Input
num: 111001
base: 2
Sample Output
57
 */

import java.util.Scanner;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int base = scn.nextInt();
        int ans = getValueIndecimal(num, base);
        System.out.println(ans);
    }

    public static int getValueIndecimal(int num, int base) {
        int rv = 0;
        int power = 1;
        while (num > 0) {
            int dig = num % 10;
            num = num/10;
            rv += dig * power;
            power = power * base;
        }
        return rv;
    }
}	