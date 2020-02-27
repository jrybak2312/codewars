import java.math.BigInteger;

public class Solution {
    public static int zeros(int n) {
        int result = 0;
        int divider = 5;
        int power = 1;
        while (n / divider > 0) {
            result += n / divider;
            divider = (int) Math.pow(divider, ++power);
        }
        return result;
    }

    public static void main(String[] args) {
             // System.out.println(zeros(75));
     /*   printDetails(70);
        System.out.println("0000000000000000".length());*/
     /*   for (int i = 0; i < 40; i++) {
            printDetails(i);
        }*/

    }

    private static void printDetails(int i) {
        System.out.print(factorial(i));
        System.out.println("; zeros = " + zeros(i));
    }

    private static BigInteger factorial(int n) {
        BigInteger number = BigInteger.valueOf(1);
        for (int i = 1; i < n + 1; i++) {
            number = number.multiply(BigInteger.valueOf(i));
            System.out.print(i + " * ");
        }
        System.out.print("=");
        return number;
    }
}


