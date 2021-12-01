import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class JA2_1_07 {
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
