import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JA2_1_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] a = new int[len];
        System.out.printf("Lenght = %d\n",len);
        for (int i=0;i<len; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        int keySearch = sc.nextInt();
        System.out.printf("key : %d\n",keySearch);
        int  r = Arrays.binarySearch(a,keySearch);
        System.out.printf("First index : %d\n",r);
        Arrays.sort(a,r,len-1);
        System.out.println(Arrays.toString(a));
    }
}
/*Viết chương trình nhập vào một mảng số nguyên. Thực hiện chia mảng thành 2 mảng số nguyên chẵn và lẻ, hiển thị ra màn hình kết quả
    Đầu vào: 1 mảng số nguyên bât kì
    Đầu ra: 1 danh sách các mảng số nguyên, 1 mảng chứa số chẵn và 1 mảng chứa số lẻ. (Mảng số chẵn được hiển thị trước mảng số lẻ)*/
class test2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.printf("Lenght = %d\n",len);
        for (int i=0;i<len; i++) {
            int input = sc.nextInt();
            arr.add(input);
        }
        System.out.println(arr.toString());
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int i =0;i<len;i++){
            int mod = arr.get(i)%2;
            if(mod==0){
                arr1.add(arr.get(i));

            }else {
                arr2.add(arr.get(i));

            }
        }
        System.out.println(arr1.toString());
        System.out.println(arr2.toString());
        ArrayList<Object> arr3 = new ArrayList<Object>();
        arr3.add(arr1);
        arr3.add(arr2);
        System.out.println(arr3.toString());
    }
}