package OOP_BASIC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OOP_09 {
    public float X;
    public float Y;
    public float Z;
    public float[] td;
    private Scanner sc = new Scanner(System.in);
    OOP_09( float x, float y, float z){
        X = x;
        Y = y;
        Z = z;
        td = new float[]{X, Y, Z};
    }
    OOP_09(){

        System.out.println("Nhap toa do x,y,z");
        X = sc.nextFloat();
        Y = sc.nextFloat();
        Z = sc.nextFloat();
    }
    public float[] getToaDo(){
        return td;
    }

    public double tinhKhoangCach(OOP_09 td){

        double t = Math.pow((this.X - td.X), 2) + Math.pow((this.Y - td.Y), 2) + Math.pow((this.Z - td.Z), 2);
        return Math.pow(t,(float)1/2);
    }

    public static void main(String[] args) {
        OOP_09 A = new OOP_09(1,2,3);
        OOP_09 B = new OOP_09(2,3,10);
        double dis = A.tinhKhoangCach(B);
        System.out.println(dis);
    }
}
