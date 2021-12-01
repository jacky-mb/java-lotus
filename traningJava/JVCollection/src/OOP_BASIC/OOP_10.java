package OOP_BASIC;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OOP_10 {
    public int Maso;
    public String HoTen;
    public Date NgaySinh;
    public String Ho;
    public String TenDem;
    public String Ten;
    public String taoDuLieuHoTen(){
        return "";
    }

    public int getMaso() {
        return Maso;
    }

    public void setMaso(int maso) {
        Maso = maso;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getHo() {
        return Ho;
    }

    public String getTenDem() {
        return TenDem;
    }

    public String getTen() {
        return Ten;
    }

    public Date getNgaySinh(Date ngaySinh) {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    OOP_10()throws ParseException {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do{
            try{
                System.out.println("Nhap ma so");
                Maso = sc.nextInt();
                System.out.println("Nhap ho ten");
                sc.skip("[\\r\\n]+");
                HoTen = sc.nextLine();
                System.out.println("Nhap ngay sinh");
                NgaySinh = new SimpleDateFormat("dd/MM/yyy").parse(sc.nextLine());
                flag = false;
            } catch (InputMismatchException e) {
                sc.nextLine();
            }
        }while (flag);
        String[] splitName = HoTen.split("[, ?.@]+");
        Ho = splitName[0];
        Ten = splitName[splitName.length-1];
        for (int i = 1; i <splitName.length-1 ; i++) {
            HoTen = String.join(" ",HoTen);
        }
    }
    public void inThongTin(){
        System.out.println(getMaso() + " co ten la "+ getHoTen()+" sinh ngay "+ getNgaySinh(NgaySinh));
    }

    public static void main(String[] args) throws ParseException {
        OOP_10 a = new OOP_10();
        a.inThongTin();
    }
}
