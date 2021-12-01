import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*Viết chương trình nhập vào chuỗi họ và tên ở dạng chưa chuẩn hóa, hiển thị email theo ví dụ sau: “   NgUyen VaN   An    ”    => AnNV@hvitclan.vn

Đầu vào: 1 chuỗi là họ tên và có dạng chưa chuẩn hóa
        Đầu ra: 1 chuỗi là email đã được chuẩn hóa


        VD: “   NgUyen VaN   An    ”    => AnNV@hvitclan.vn*/
public class JA2_1_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split("[, ?.@]+");
        String name = a[a.length - 1];
        String email = name + "@hvitclan.vn";
        System.out.print(email);
    }
}
