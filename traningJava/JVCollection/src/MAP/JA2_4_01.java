/*Cho 1 hashMap, tiến hành thêm vào hashMap các phần tử có key và value lần lượt là: ("Viet Nam", "Ha Noi"),
 ("Hoa Ky", "Washington, D.C"), ("Han Quoc", "Seoul"). Viết chương trình hiển thị các phần tử của map đó theo nội dung: [Value] là thủ đô của [Key].
        Đầu vào: HashMap
        Đầu ra: Danh sách thủ đô tương ứng với Quốc gia
        Ví dụ: Ha Noi là thủ đô của Viet Nam...*/
package MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JA2_4_01 {
    public static void main(String[] args) {
        Map<String,String> map = Map.of(
                "Viet Nam", "Ha Noi",
                "Hoa Ky", "Washington, D.C",
                "Han Quoc", "Seoul"
        );
        for (Map.Entry<String,String> entry:map.entrySet()) {
            System.out.printf("%s là thủ đô của %s\n",entry.getKey(),entry.getValue());
        }
    }
}
/*
Cho 2 hash map sau: map1 { K, V: 1 - Red, 2 - Green, 3 - Blue } và map2 { K, V: 4 - White, 5 - Black, 6 - Orange }.
        Viết chương trình thêm toàn bộ phần tử map thứ nhất sang map thứ hai
        Đầu vào: Map1 và Map2
        Đầu ra:  { K, V: 1 - Red, 2 - Green, 3 - Blue, 4 - White, 5 - Black, 6 - Orange }*/
class JA2_4_02{
    public static void main(String[] args) {
        Map<Integer,String> mapA = new HashMap<>(Map.of(
                1, "Red",
                2, "Green",
                3, "blue"
        ));
        Map<Integer,String> mapB = new HashMap<>(Map.of(
                4,"White",
                5,"Black",
                6,"Orange"
        ));
        mapA.putAll(mapB);
        System.out.println(mapA.toString());
    }
}
    /*Cho hash map HM sau: { K, V: 1 - Red, 2 - Green, 3 - Blue }. Viết chương trình kiểm tra trong hashmap trên có chứa key = 4 hay không?
        Đầu vào: HashMap HM
        Đầu ra: Không chứa key = 4*/
class JA2_4_03{
        public static void main(String[] args) {
            Map<Integer,String> mapA = new HashMap<>(Map.of(
                    1, "Red",
                    2, "Green",
                    3, "blue"
            ));
            boolean isContainsKet4 = mapA.containsKey(4);
            System.out.println(isContainsKet4);
        }
}

class JA2_4_04{
    public static void main(String[] args) {
        Map<Integer,String> mapA = new HashMap<>(Map.of(
                1, "Red",
                2, "Green",
                3, "blue"
        ));
        mapA.remove(1);
        System.out.println(mapA.toString());
    }
}
/*Viết chương trình khởi tạo TreeMap và dùng hàm put đưa vào đó 1 vài phần tử, mỗi phần tử có dạng cặp  <key value>  (key thuộc kiểu số nguyên).
    Hiển thị Treemap đó ra với thứ tự được sắp xếp sẵn theo thứ tự key bằng vòng lặp foreach

    Đầu vào: Khởi tạo và cấp phát bộ nhớ cho 1 TreeMap
    Đầu ra: Hiển thị TreeMap ra ngoài màn hình*/
class JA2_4_05{
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Cam");
        map.put(2, "Buoi");
        map.put(3, "Tao");
        map.put(4, "Quyt");
        for (Map.Entry<Integer,String> entry: map.entrySet())
        {
            System.out.printf("%d : %s\n",entry.getKey(),entry.getValue());
        }
    };
}