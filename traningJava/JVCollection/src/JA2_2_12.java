import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Cho list sau: [1, 2, 1, 3, 3, 4, 3, 5, 5]. Viết chương trình liệt kê số lần xuất hiện của các phần tử trong list trên

        Đầu vào: List [1, 2, 1, 3, 3, 4, 3, 5, 5]
        Đầu ra: "Giá trị - Số lần xuất hiện: 1 - 2, 2 - 1, 3 - 3, 4 - 1, 5 - 2"*/
public class JA2_2_12 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 3, 4, 3, 5, 5));
        int counter =0;
        for (int i = 0; i <arr.size(); i++) {
            int temp = arr.get(i);
            for (int j = 0; j < arr.size(); j++) {
                if(arr.get(i)==arr.get(j)){
                    counter+=1;
                }
            }
            System.out.printf("%d - %d\n",arr.get(i),counter);
            counter=0;
        }

    }
}
