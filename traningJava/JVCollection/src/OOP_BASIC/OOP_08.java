package OOP_BASIC;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class OOP_08 {
    public String HoTen;
    public String Lop;
    public Date NgaySinh;
    public float DiemToan;
    public float DiemVan;
    public float DiemAnh;
    public float DiemTrungBinh;
    OOP_08(String hoten, String lop, String date, float toan, float van, float tienganh) throws ParseException {
        HoTen = hoten;
        Lop = lop;
        NgaySinh =  new SimpleDateFormat("dd/MM/yyyy").parse(date);
        DiemToan = toan;
        DiemVan = van;
        DiemAnh = tienganh;
        DiemTrungBinh = (DiemToan + DiemVan+ DiemAnh)/3;
    }

    OOP_08() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten");
        HoTen = sc.nextLine();
        System.out.println("Nhap lop");
        Lop = sc.nextLine();
        System.out.println("Nhap ngay sinh");
        String ns = sc.nextLine();
        NgaySinh =  new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        System.out.println("Nhap diem toan");
        DiemToan = sc.nextFloat();
        System.out.println("Nhap diem van");
        DiemToan = sc.nextFloat();
        System.out.println("Nhap diem tieng anh");
        DiemToan = sc.nextFloat();
    }
    public Object[] LayThongTin(){
        return new Object[]{HoTen,Lop,NgaySinh,DiemToan,DiemAnh,DiemVan,DiemTrungBinh};
    }
}
class main{
    public main(String[] args) throws ParseException {
        OOP_08 hs = new OOP_08("Anh lt","hvit","12/07/1995",10,10,10);
        System.out.println(Arrays.toString(hs.LayThongTin()));
        OOP_08 hs1 = new OOP_08();
        System.out.println(Arrays.toString(hs1.LayThongTin()));
    }
}
