package OOP_BASIC;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class OOP_12 {
    public int MaHocVien;
    public String Ho;
    public String Ten;
    public String HoVaTen;
    public Date NgaySinh;
    public String Email;
    OOP_12(int maHV,String name,String date) throws ParseException {
        super();
        this.MaHocVien = maHV;
        this.HoVaTen = name;
        NgaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        String[] parseName = HoVaTen.split("[, ?.@]+");
        Ho = parseName[0];
        Ten = parseName[parseName.length-1];
        Email = Ten+"@edusolution.com";
    }
    public void inThongTin(){
        System.out.println(MaHocVien+Ho+Ten+NgaySinh+Email);
    }
    public static void main(String[] args) throws ParseException {
        OOP_12 a = new OOP_12(12,"Anh Le","12/11/2021");
        a.inThongTin();
    }
}
