package OOP_BASIC;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OOP_04 {
    public float giaTri;
    public boolean laSoDuong = false;
    OOP_04(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thuc \n");
        giaTri = sc.nextFloat();
        if(giaTri>=0){
            laSoDuong = true;
        }
    }
    public static double TinhCanBacN(float a, int n){
        double root3 = 0;
        try {
             root3 = Math.pow(a,(double) 1/n);
        }catch (Exception e){
            System.out.println("Đầu vào không hợp lệ");
        }
        return root3;
    }
    public static int timMax(float f){
        String fl = Float.toString(f);
        fl =fl.replace(".","");
        char[] c = fl.toCharArray();
        int max = Character.getNumericValue(c[0]);
        for (int i = 0; i < c.length; i++) {
            if(Character.getNumericValue(c[i])>= max){
                max =Character.getNumericValue(c[i]);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        float f = new OOP_04().giaTri;
        System.out.println(OOP_04.TinhCanBacN(f,3));
        System.out.println(+OOP_04.timMax(f));
    }
}
