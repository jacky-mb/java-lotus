/*
Nhập từ bàn phím 1 điểm gồm tung độ (y) và hoành độ (x) và các hệ số a, b,c  của đường thẳng ax+by+c = 0.
Sau đó tính khoảng cách từ điểm đó đến đường thẳng

Đầu vào: Nhập vào 1 điểm gồm tung độ, hoành độ và các hệ số của đường thẳng
Đầu ra: In ra khoảng cách từ điểm đó đến đường thẳng theo mẫu sau:
                              Khoang cach tu diem A( [hoanh do] , [tung do] ) den duong thang [a]x + [b]y + [c] =0 la [khoang cach]
*/
package JA1404;

import java.util.Scanner;

public class JA1404 {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int c = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int distance = Math.multiplyExact(a,x) + Math.addExact(b,y) + c;
        System.out.print(distance);
    }
}
