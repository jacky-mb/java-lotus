/*Cho mảng 2 chiều a = [ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } ]. Viết chương trình in mảng 2 chiều a ra màn hình.

        Đầu vào: Mảng a
        Đầu ra:  [ { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 } ]*/

import java.util.Arrays;

public class JA2_1_03 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int len_c = a.length;
        for(int i = 0;i<len_c;i++){
            System.out.println(Arrays.toString(a[i]));
//            int len_r = a[i].length;
//            for(int j = 0;j<len_r;j++){
//                System.out.println(a[i][j]);
//            }
        }
    }
}

