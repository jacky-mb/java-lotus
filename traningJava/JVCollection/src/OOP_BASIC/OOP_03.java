package OOP_BASIC;

import java.util.Map;
import java.util.Scanner;

public class OOP_03 {

    public static String TenMonAn;
    public static int GiaBan;
    public static String GioiThieu;
    public static String NguyenLieuChinh;

    public OOP_03(String tenMon, int gia, String gt, String nguyenLieu){
        TenMonAn = tenMon;
        GiaBan = gia;
        GioiThieu = gt;
        NguyenLieuChinh = nguyenLieu;
    }
    public OOP_03(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ten mon an\n ");
        TenMonAn = sc.nextLine();
        System.out.println("Nhap gia mon an\n ");
        GiaBan = sc.nextInt();
        System.out.println("Nhap gioi thieu mon an\n ");
        sc.skip("[\\r\\n]+");
        GioiThieu = sc.nextLine();
        System.out.println("Nhap nguyen lieu chinh\n");
        NguyenLieuChinh = sc.nextLine();


    }
    public void inThongTin(){
        System.out.println(TenMonAn +" "+ GioiThieu +" "+ "duoc lam tu cac nguyen lieu : "+" "+NguyenLieuChinh);
    }

    public static void main(String[] args) {
        OOP_03 cheBuoi = new OOP_03();
        cheBuoi.inThongTin();
    }
}
