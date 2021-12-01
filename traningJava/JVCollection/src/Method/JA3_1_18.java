package Method;

import java.util.*;

/*Cho mảng a = { 1, 4, 7, 8, 9, 6, 3, 2, 5 }. Viết hàm tìm phần tử chẵn đầu tiên trong mảng sau đó hiển thị phần tử đó.
        Đầu vào: Mảng a
        Đầu ra: Phần tử chẵn đầu tiên = 4*/
public class JA3_1_18 {
    public static Integer findElement(ArrayList<Integer> a){
        for (int value: a ) {
            if(value% 2 == 0){
                return value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 7, 5, 9, 1, 3, 1, 5));
        Integer firstE = JA3_1_18.findElement(arr);
        System.out.println(firstE);
    }
}
/*Viết chương trình Java nhập vào một mảng số nguyên, thực hiện sắp xếp theo thứ tự tăng dần rồi in ra màn hình mảng đã được sắp xếp

Đầu vào: 1 mảng số nguyên bất kì chưa được sắp xếp
    Đầu ra: 1 mảng số nguyên đã được sắp xếp theo thứ tự tăng dần và hiển thị mảng đó ra ngoài màn hình

    *Lưu ý: Không sử dụng các thuật toán sắp xếp đã được học */

class JA3_1_12{
    public static void sortASC(int[] arr){
        int temp =0;
//        int len = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>=arr[j+1]){
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,56,3,43,56,54,3,43,3};
        sortASC(arr);
    }
}
/*Cho 1 mảng số nguyên arr = [ 1, 4, 7, 8, 9, 6, 3, 2, 5 ]. Viết hàm thay thế mọi phần tử bằng phần tử nhỏ nhất
, còn phần tử nhỏ nhất thì được thay thế bằng phần tử nhỏ thứ hai.
        Đầu vào: Mảng arr
        Đầu ra: Mảng arr sau khi thay thế: [ 2, 1, 1, 1, 1, 1, 1, 1, 1 ]*/
class JA3_1_11{

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 4, 7, 8, 9, 6, 3, 2, 5));
        /*Tim lai min2*/
        ArrayList<Integer> array2 = new ArrayList<>(array);
        int min = Collections.min(array);
        /*Lay cac vi tri cua min*/
        for (int i = 0; i < array2.size(); i++) {
            array2.remove((Integer) min);
        }
        int min2 = Collections.min(array2);

        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) == min){
                array.set(i,min2);
            }
            else {
                array.set(i,min);
            }
        }
        System.out.println(array.toString());
    }
}
/*Viết hàm tính chu vi và diện tích hình tròn.*/
class JA3_2_06{
    public static float calc(float r){
        return (float) (Math.PI*Math.pow(r,2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float s = calc(r);
        System.out.println(s);
    }
}

/*Viết chương trình nhập vào một chuỗi ở dạng chưa chuẩn hóa, hiển thị một chuỗi đã chuẩn hóa.

    Đầu vào: 1 chuỗi là họ tên và có dạng chưa chuẩn hóa . Ví dụ: " Nguyen van     a "
    Đầu ra: 1 chuỗi là họ tên có dạng "Nguyen van a"*/
class JA3_2_08{

    public static void main(String[] args) {
        String name ="anh le      tuan";
        String[] n = name.split("^([a-z]+[,.]?[ ]?|[a-z]+['-]?)+$");
        System.out.println(Arrays.toString(n));
        for (int i = 0; i < n.length; i++) {
            n[i]= n[i].trim();
        }
        System.out.println(Arrays.toString(n));
    }
}

class  JA3_1_17{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,23,234,45,23,3,23,423,2345,342));
        arr.removeIf(array->array%2!=0);
        System.out.println(arr.toString());
    }
}

/*
Viết hàm vẽ 1 bàn cờ caro 20x20 ô, mỗi ô có thể là 4 dấu chấm, ví dụ*/
class JA3_1_02{
    public static void main(String[] args) {
        int c = 5;
        int r = 4;
        int[][] a = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("."+"\t");
            }
            System.out.println("\n");
        }
    }
}
/*Cho List T sau: { 1, 4, 7, 8, 9, 6, 3, 2, 5 }. Viết hàm chuyển đổi List T sang Set có các phần tử của List T
    Đầu vào: List T
    Đầu ra: Set S = [ 1, 4, 7, 8, 9, 6, 3, 2, 5 ]*/
class JA3_1_01{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 7, 8, 9, 6, 3, 2, 5));
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set.toString());
    }
}

    /*Cho chuỗi Str = "Hvit Clan Is Number One ". Viết hàm đếm số khoảng trắng trong chuỗi.
        Đầu vào: Chuỗi str
        Đầu ra: Số khoảng trắng = 5*/
class JA3_1_06 {

    public static void main(String[] args) {
        String s = "Hvit Clan Is Number One ";

        long c = s.chars().filter(ch -> ch == ' ').count();

        System.out.println("So khoang trang: " + c);
    }
}

/*Viết hàm trả lại danh sách là đảo ngược của 1 danh sách truyền vào.

Đầu vào: Một danh sách các chuỗi
Đầu ra: Một danh sách đảo ngược của danh sách đầu vào và in các phần tử của danh sách đó ra ngoài màn hình

Ví Dụ: Danh sách gồm các chuỗi: Nguyen Duc Toan, Nguyen Hoang Truong, Nguyen Dong Khanh
=> Kết quả: Nguyen Dong Khanh, Nguyen Hoang Truong, Nguyen Duc Toan

*Lưu ý: Không sử dụng vòng lặp for duyệt từ cuối mảng như những bài trước*/
class JA3_1_09{
    public static void reverseString(List<String> s){
        Collections.reverse(s);
    }
    public static void main(String[] args) {
        List<String> s = new ArrayList<>(Arrays.asList( "Nguyen Duc Toan", "Nguyen Hoang Truong"," Nguyen Dong Khanh"));
        reverseString(s);
        System.out.println(s);
    }
}

/*Viết chương trình nhập vào một họ tên bất kì và thực hiện chuẩn hóa họ tên đó.

    Ví Dụ: Trước khi chuẩn hóa: " nguyen        van   Toan", sau khi chuẩn hóa "Nguyen Van Toan".

    Gợi ý
    Gợi ý cho file source.java
    Sử dụng Trim() để cắt khoảng trắng ở hai đầu.

    Sử dụng split() để thực hiện tách chuỗi.

    Viết một hàm dùng vòng lặp for kết hợp với subtring() và toUpper() để thực hiện in hoa.*/
class JA3_1_10{
    public static String formatName(String name){
        name = name.trim();
        String[] names = name.split("[, ?.@]+");

        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].substring(0,1).toUpperCase() +names[i].substring(1);
        }
        return  String.join(" ",names);
    }
    public static void main(String[] args) {
        String name = " nguyen@    sdas    van   Toan";
        String nameFormat = formatName(name);
        System.out.println(nameFormat);
    }
}
/*Viết hàm nhập một số nguyên và trả lại số nguyên nhập được trong một khoảng cho trước. Yêu cầu khi nhập liệu: Cần kiểm tra được quy cách nhập liệu, nếu sai quy cách thì báo ra. Nếu sai khoảng giá trị cũng cần báo ra thông điệp lỗi.

    Đầu vào: 1 số nguyên
    Đầu ra: Nếu sai quy cách và sai khoảng giá trị => In ra thông điệp lỗi và yêu cầu nhập lại
    Nếu đúng hãy in số đó ra ngoài màn hình

    Ví Dụ: min = 2, max = 100 => Nhập 101 => Sai khoảng giá trị
    Nhập "Hello" => Sai quy cách nhập liệu*/
class JA3_1_13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri bat dau: \t");
        int start = sc.nextInt();
        System.out.println("\nNhap gia tri ket thuc: \t");
        int end = sc.nextInt();
        int input = 0;
        while (start<= input && input <=end ){
            input = sc.nextInt();
        }
    }
}
/*Viết chương trình nhập vào một chuỗi ở dạng chưa chuẩn hóa, hiển thị một chuỗi đã chuẩn hóa.

    Đầu vào: 1 chuỗi là họ tên và có dạng chưa chuẩn hóa . Ví dụ: " Nguyen van     a "
    Đầu ra: 1 chuỗi là họ tên có dạng "Nguyen van a"*/
class  JA3_1_08{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : \t");
        String name = sc.nextLine();
        String[] formatName = name.split("[, ?.@]+");
        for (int i = 0; i < formatName.length; i++) {
            formatName[i] = formatName[i].substring(0,1).toUpperCase() +formatName[i].substring(1);
        }
        System.out.println(String.join(" ",formatName));
    }
}
/*.    Viết hàm để hiển thị kí tự ở giữa chuỗi
        Ví Dụ: "kkcckk". Ký tự giữa chuỗi là: cc.
        Nếu độ dài của chuỗi là số lẻ sẽ có hai ký tự ở giữa.
        Nếu độ dài của chuỗi chẵn sẽ có một ký tự ở giữa.*/
class JA3_1_05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi : \t");
        String line = sc.nextLine();
        char[] lines =line.toCharArray();
        int len_line = line.length();
        System.out.println(len_line);
        if(len_line%2 == 0){
            System.out.printf("%c%c",lines[len_line/2-1],lines[(len_line/2)]);
        }else {
            System.out.printf("%c",lines[(len_line/2)]);
        }
    }
}
/*Cho số nguyên dương N = 5. Viết hàm tính giai thừa của số N
    Đầu vào: Số N = 5
    Đầu ra: Giai thừa của 5 = 120*/
class JA3_1_03{
    public static long calc(long n){
        if(n>0){
            return n * calc(n-1);
        }else {
            return 1;
        }
    }
    public static void main(String[] args) {
        int n =0;
        System.out.println("Nhap so nguy duong N:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.printf("Giai thua cua %d = %d",n,calc(n));
    }
}