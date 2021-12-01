package OOP_BASIC;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OOP_05 {
    public int MaNhanVien;
    public String HoVaTen;
    public String PhongBan;
    public String DiaChi;
    public String SoDienThoai;
    OOP_05(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        try{
            System.out.println("Nhap ma nhan vien");
            MaNhanVien= sc.nextInt();

        }catch (InputMismatchException e){
            sc.next();
            System.out.println("ma nha vien nhap sai");
        }

        System.out.println("Nhap ho va ten");
        sc.skip("[\\r\\n]+");
        HoVaTen = sc.nextLine();
        System.out.println("Nhap Phong ban");
        PhongBan = sc.nextLine();
        System.out.println("Nhap dia chi");
        DiaChi = sc.nextLine();
        System.out.println("Nhap so dien thoai");
        SoDienThoai = sc.nextLine();
    }
    public void InThongTin(){
        System.out.println("Ma nhan vien :" +MaNhanVien+"\n");
        System.out.println("Ho va ten :" +HoVaTen+"\n");
        System.out.println("So dien thoai :" +SoDienThoai+"\n");
    }

    public static void main(String[] args) {
        OOP_05 nv = new OOP_05();
        nv.InThongTin();
    }
}
