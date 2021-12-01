package JA1401;

import java.util.Scanner;


public class JA13_04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        char c = scan.next().charAt(0);
        float b = scan.nextFloat();
        boolean d = scan.nextBoolean();
        String s = String.valueOf(a) + String.valueOf(b) + String.valueOf(c) +String.valueOf(d);
        System.out.println(s);
    }
}