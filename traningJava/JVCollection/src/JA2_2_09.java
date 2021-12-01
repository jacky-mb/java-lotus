import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*Đề bài
        Cho danh sách các chuỗi sau: one Two three Four five six one three Four
        Viết chương trình thay thế phần tử tất cả phần tử 'one' trong danh sách trên thành 'ten'

        Đầu vào: Danh sách chuỗi "one Two three Four five six one three Four"
        Đầu ra: Danh sách chuỗi sau khi thay thế: "ten three Four five six ten three Four"*/
public class JA2_2_09 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>(List.of(
                "one","Two","three",
                "Four","five","six","one","three","Four"));
        for (int i = 0;i<arr.size();i++){
            if(arr.get(i)=="one"){
                arr.set(i,"ten");
            }
        }
        System.out.println(Arrays.toString(arr.toArray()));
    }
}
