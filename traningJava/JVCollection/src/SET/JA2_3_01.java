/*Viết chương trình tạo 1 set bất kỳ thực hiện thêm 1 vài phần tử cho set vừa tạo sau đó hiển thị kích cỡ của set và từng phần tử của set vừa tạo ra màn hình

        Đầu vào: 1 set bất kì
        Đầu ra: Hiển thị kích cỡ và từng phần tử của set đó*/
package SET;

import java.util.*;

public class JA2_3_01 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3));
        System.out.printf("%d\n",set.size());
        for (Integer i: set){
            System.out.println(i);
        }
    }
}
/*Cho 1 set các chuỗi sau: Toan, Ly, Hoa, Van, Anh, Toan Cao Cap, Sinh Hoa
        Viết chương trình xóa phần tử "Ly" trong danh sách trên
        Đầu vào: "Toan", "Ly", "Hoa", "Van", "Anh", "Toan Cao Cap", "Sinh Hoa"
        Đầu ra: Toan, Hoa, Van, Anh, Toan Cao Cap, Sinh Hoa*/
class JA2_3_04{
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(Arrays.asList("Toan", "Ly", "Hoa", "Van", "Anh", "Toan Cao Cap", "Sinh Hoa"));
        set.remove("Ly");
        System.out.println(set.toString());
    }
}

class JA2_3_02{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,2,3,5,6,6));
        System.out.println(set.toString());
    }
}
/*Cho set sau: ["Cam", "Quyt", "Mit", "Dua", "Le", "Tao", "Oi"] và chuỗi s = "Hvit". Viết chương trình sử dụng hàm contains để kiểm tra chuỗi s có chứ trong set trên không?

        Đầu vào: Set  ["Cam", "Quyt", "Mit", "Dua", "Le", "Tao", "Oi"] và chuỗi s
        Đầu ra: Chuỗi s không chứa trong set*/
class JA2_3_07{
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(Arrays.asList("Cam", "Quyt", "Mit", "Dua", "Le", "Tao", "Oi"));
        boolean isContain = set.contains("Cadm");
        System.out.print(isContain);
    }
}
/*Cho set sau: ["Cam", "Quyt", "Mit", "Dua", "Le", "Tao", "Oi"]. Viết chương trình kiểm tra set trên có rỗng hay không?
    Đầu vào: Set ["Cam", "Quyt", "Mit", "Dua", "Le", "Tao", "Oi"]
    Đầu ra: "Set có phần tử"*/
class JA2_3_03{
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("Cam", "Quyt", "Mit", "Dua", "Le", "Tao", "Oi"));
        System.out.println(set.isEmpty());
        System.out.println(set.toString());
    }
}

/*
Viết chương trình khởi tạo 2 set từ 2 mảng kiểu số nguyên, thực hiện các yêu cầu sau:

    Thêm vào mỗi set một vài phần tử
    Xóa 1 phần tử của set bằng hàm remove,
    Xóa mọi phần tử của set B nếu phần tử đó cũng tồn tại trong set A bằng hàm remove all
    Xóa mọi phần tử của set bằng hàm clear*/
class JA2_3_05{
    public static void main(String[] args) {
        Set<Integer> setA = new TreeSet<>(Arrays.asList(1, 2,3,4,231,232,23));
        Set<Integer> setB = new TreeSet<>(Arrays.asList(2,3,54,56,56,65,34,34));
        setA.removeAll(setB);
        System.out.println(setA.toString());
        setA.clear();
        System.out.println(setA.toString());
    }
}
/*
Cho 2 mảng sau, arr1= [ 1, 2, 5, 0, 6, 7] và arr2 = [ 0, 9, 7, 5, 3, 8].
        Viết chương trình chuyển 2 mảng thành 2 set và tìm các phần tử chung của 2 set đó

        Đầu vào: set1 và set2
        Đầu ra: phần tử chung của 2 set là: 0, 5 và 7*/
class JA2_3_08{
    public static void main(String[] args) {
        Integer[] a = {1, 2, 5, 0, 6, 7};
        Integer[] b = {0, 9, 7, 5, 3, 8};
        Set<Integer> setA = new TreeSet<>();
        Collections.addAll(setA,a);
        Set<Integer> setB = new TreeSet<>();
        Collections.addAll(setB,b);
        setA.retainAll(setB);
        System.out.println(setA.toString());
    }
}