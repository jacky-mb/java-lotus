/*
Nhập 1 số nguyên x từ bàn phím sau đó tính giá trị hàm số y = x^2 + 3x + 2

Đầu vào: 1 số nguyên nhập từ bàn phím
Đầu ra: Giá trị hàm số

VD: x=1 => Gia tri ham so voi x = 1 la 6
 */
package JA1403;

import java.util.Scanner;

public class JA1403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        double f = Math.pow(number,2) + Math.multiplyExact((long) number,3) + 2;
        System.out.printf("result : %.2f",f);
    }
}
