package JA1401;

import java.math.BigDecimal;
import java.util.Scanner;

class JA14_01 {

    public static float getSin(float degree){
        return (float) Math.sin(degree);
    }
    public static float getPow(float number){
        return (float) Math.pow(number,2);
    }
    public static float getSqrt(float number){
        return (float) Math.sqrt(number);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float degree = scan.nextFloat();
        float number = scan.nextFloat();
        float sqrt = scan.nextFloat();
        System.out.printf("sin : %.2f\npow : %.2f\nsqrt : %.2f",getSin(degree),getPow(number),getSqrt(sqrt));
    }
}