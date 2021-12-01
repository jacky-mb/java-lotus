package OOP_BASIC;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class test {
    public static int input;
    private static final Scanner sc = new Scanner(System.in);
    public static boolean bError = true;

    public static void main(String[] args) throws Exception {
        do{
            try {
                input = sc.nextInt();
                if(input<1 || input >31) throw  new Exception();
                bError= false;
            } catch (Exception e){
                System.out.println("You did not enter an integer, please enter an integer value");
                sc.nextLine();
            }
        }while (bError);
    }
}
