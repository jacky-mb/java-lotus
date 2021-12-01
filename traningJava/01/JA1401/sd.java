package JA1401;

import java.util.Scanner;
class ScannerDemo1
{
    public static void main(String[] args)
    {
// Declare the object and initialize with
// predefined standard input object
        Scanner sc = new Scanner(System.in);

// Character input
        char c = sc.next().charAt(0);

// Print the read value
        System.out.println(c);
    }
}