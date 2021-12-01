package OOP_BASIC;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OOP_06 {
    public int MaLop;
    public String TenLop;
    public int SiSo;
    public String DiaChi;
    public String GVCN;
    OOP_06(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma lớp :");
        MaLop =sc.nextInt();
        System.out.println("Nhập tên lớp");
        sc.next();
        TenLop =sc.nextLine();
        System.out.println("Nhập sĩ số:");
        SiSo = sc.nextInt();
        System.out.println("Nhập địa chỉ:");
        sc.next();
        DiaChi = sc.nextLine();
        System.out.println("Nhập GVCN:");
        GVCN = sc.nextLine();
    }
    OOP_06(int maLop, String tenLop, int siSo, String diaChi, String gvcn){
        MaLop = maLop;
        TenLop = tenLop;
        SiSo = siSo;
        DiaChi = diaChi;
        GVCN = gvcn;
    }
    public void inThongTin(){
        System.out.printf("Ma lop : %d\n"+
                "Ten lop : %s\n"+
                "Si so : %d\n"+
                "Dia chi: %s\n"+
                "GVCN: %s\n",MaLop,TenLop,SiSo,DiaChi,GVCN);
    }

    public static void main(String[] args) {
        OOP_06 a = new OOP_06();
        a.inThongTin();
        OOP_06 b = new OOP_06(123,"asd",12,"asdas","sdasdsa");
        b.inThongTin();
    }
}
