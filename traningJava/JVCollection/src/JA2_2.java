import java.util.ArrayList;
import java.util.Arrays;

/*Cho List T sau: { 123, 421, 723, 89, 90, 61, 33, 22, 54 }. Viết chương trình tìm kiếm tất cả những số tăng trong danh sách T.
 Biết rằng số tăng là số mà từng vị trí trong số đó tính từ trái qua phải thì phải nhỏ hơn hoặc bằng số đằng sau nó.
        Đầu vào: List T
        Đầu ra: Các số tăng là: 123, 89, 33, 22*/
public class JA2_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(123, 421, 723, 89, 90, 61, 33, 22, 54));
        int temp = arr.get(0);
        for (int i =0;i<arr.size();i++) {
            if(temp<= arr.get(i)){
                System.out.println(arr.get(i));
                temp = arr.get(i);
            }
        }
    }
}
