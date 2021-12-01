import java.util.Scanner;

public class JA2_1_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] a = new int[len];
        System.out.printf("Lenght = %d \n",len);
        for (int i=0;i<len; i++) {
            a[i] = sc.nextInt();
            System.out.printf("a[%d] : %d\n", i,a[i]);
        }
        int sum = 0;
        for(int i=0;i<len; i++){
            sum+=a[i];
        }
        System.out.printf("Sum = %d",sum);
    }
}
