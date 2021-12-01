import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Viết chương trình nhập và xuất 1 collection 2 chiều

        Đầu vào: Collection 2 chiều
        Đầu ra: Hiển thị collection 2 chiều vừa nhập
        Lưu ý: Tách thành các hàm nhỏ*/
public class JA2_2_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        System.out.printf("Nhập số lượng mảng : %d\n", len);
        int input;
        List<ArrayList<Integer>> listInt = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < len; i++) {
            System.out.printf("Nhâp số phần tử mảng %d\n", i);
            int len_arr = sc.nextInt();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            System.out.printf("Số lượng phần tử mảng %d\n", i);
            int sum = 0;
            for (int index = 0; index < len_arr; index++) {
                int value = sc.nextInt();
                temp.add(value);
                sum += value;
            }
            listInt.add(temp);
        }
        System.out.println("Truoc khi sort : " + listInt.toString() + "\n");
    }
}
