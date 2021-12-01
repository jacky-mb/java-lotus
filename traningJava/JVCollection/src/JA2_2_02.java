import java.util.*;

/*Đề bài
        Cho 1 danh sách các chuỗi sau: Toan, Ly, Hoa, Van, Anh, Toan Cao Cap, Sinh Hoa
        Viết chương trình biến đổi danh sách trên thành một Array sau đó in Array đó ra màn hình

        Đầu vào: List: "Toan", "Ly", "Hoa", "Van", "Anh", "Toan Cao Cap", "Sinh Hoa"
        Đầu ra: Array: Toan, Ly, Hoa, Van, Anh, Toan Cao Cap, Sinh Hoa*/
public class JA2_2_02 {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>(List.of("Toan", "Ly", "Hoa", "Van", "Anh",
                "Toan Cao Cap", "Sinh Hoa"));
        System.out.println(Arrays.toString(list.toArray()));
    }
}
/*    Cho List T sau: { 1, 4, 7, 8, 9, 6, 3, 2, 5 }. Viết chương trình xóa phần tử thứ 3 trong list T

        Đầu vào: List T
        Đầu ra: List T sau khi xóa phần tử thứ 3 : { 1, 4, 7, 9, 6, 3, 2, 5 }*/
class JA2_2_08{
    public static void main(String[] args) {
        List<Integer> T = new ArrayList<Integer>(List.of(1, 4, 7, 8, 9, 6, 3, 2, 5));
        T.remove(3);
        System.out.println(T.toString());
    }
}
/*List T sau: { 1, 4, 7, 8, 9, 6, 3, 2, 5 }. Viết chương trình xáo trộn list T sau đó hiển thị lại list T ra màn hình

    Đầu vào: List T
    Đầu ra: List T sau khi xáo trộn*/
class JA2_2_05{
    public static void main(String[] args) {
        List<Integer> T = new ArrayList<Integer>(List.of(1, 4, 7, 8, 9, 6, 3, 2, 5));
        Collections.sort(T);
        System.out.println(T.toString());
    }
}
/*Cho danh sách C sau: { "Cam", "Quyt", "Mit", "Dua", "Dua", "Le", "Tao", "Oi" }. Viết chương trình sắp xếp các chuỗi trên theo thứ tự bảng chữ cái từ a -> z sau đó in danh sách C ra màn hình

Đầu vào: danh sách C
Đầu ra: danh sáchsau khi sắp xếp : { "Cam", "Dua", "Dua", "Le", "Mit", "Oi", "Quyt", "Tao" }*/
class JA2_2_11{
    public static void main(String[] args) {
        List<String> T = new ArrayList<String>(List.of("Cam", "Quyt", "Mit", "Dua", "Dua", "Le", "Tao", "Oi"));
        T.sort(Comparator.naturalOrder());
        System.out.println(T.toString());
    }
}
class JA2_2_07{
    public static void main(String[] args) {
        List<String> T = new ArrayList<String>(List.of("Cam", "Quyt", "Mit", "Dứa", "Dừa", "Le", "Tao", "Oi"));
        T.sort(Comparator.naturalOrder());
        System.out.println(T.toString());
    }
}
    /*Viết hàm sắp xếp mảng theo thứ tự giảm dần dựa vào giá trị trung bình cộng của mỗi danh sách trong mảng.
        Thực hiện nhập, sắp xếp và xuất mảng sau khi sắp xếp.*/
class JA2_1{
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
                sum+=value;
            }
            listInt.add(temp);
        }
        System.out.println("Truoc khi sort : " + listInt.toString()+"\n");
        float avg = 0;
        for (int i = 0; i < listInt.size(); i++) {
            int sum = 0;
            float t_avg =0;
            for (int j = 0; j < listInt.get(i).size(); j++) {
                sum+=listInt.get(i).get(j);
            }
            t_avg = (float)sum/listInt.get(i).size();
            if(avg<t_avg & i>=1){
                Collections.swap(listInt,i,i-1);
            }
        }
        System.out.println("Sau khi sort"+listInt.toString());
    }
}

