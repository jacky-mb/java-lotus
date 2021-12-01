package OOp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class OOP_16 {
    public static int ngay;
    public static int thang;
    public static int nam;
    public static int thu;
    public static boolean laNamNhuan = false;
    protected boolean flag = true;
    public enum dateTime{DAY,MONTH,YEAR};
    public static Calendar c = Calendar.getInstance();
    private final Scanner sc = new Scanner(System.in);
    public static void setDay(int day) {
        ngay = day;
    }

    public static void setMonth(int month) {
        thang = month;
    }

    public static void setYear(int year) {
        nam = year;
    }
    public static void setThu(){
        c.set(nam,thang-1,ngay);
        thu = c.get(Calendar.DAY_OF_WEEK);
    }
    public static int getDay() {
        return ngay;
    }

    public static int getThang() {
        return thang;
    }

    public static int getNam() {
        return nam;
    }

    public static int getThu() {
        return thu;
    }

    public static boolean getLaNamNhuan() {
        if(nam%4==0){
            laNamNhuan = true;
        }
        return laNamNhuan;
    }
    OOP_16() {
        NhapLieu(dateTime.DAY);
        NhapLieu(dateTime.MONTH);
        NhapLieu(dateTime.YEAR);
        setThu();
    }

    OOP_16( int y, int m, int d){
        c.set(y,m-1,d);
        ngay = d;
        thang = m;
        nam = y;
        setThu();
    }
    public void LayThongTin(){
        System.out.printf("Thời gian hiện tại là thứ %d ngày %d tháng %d năm %d ",thu,ngay,thang,nam);
        System.out.println("Là năm nhuận :"+laNamNhuan);
    }
    public void NhapLieu(dateTime type){
        boolean flag = true;
        do{
            try {

                switch (type) {
                    case DAY -> {
                        System.out.println("Nhap ngay");
                        ngay = sc.nextInt();
                        if (1 > ngay || ngay > 31) throw new InputMismatchException("Nhap sai ngay");
                    }
                    case MONTH -> {
                        System.out.println("Nhap thang");
                        thang= sc.nextInt();
                        if (1 > thang || thang > 12) throw new InputMismatchException("Nhap sai thang");
                    }
                    case YEAR -> {
                        System.out.println("Nhap nam ");
                        nam = sc.nextInt();
                        if (1900 > nam || nam > 2900) throw new InputMismatchException("Nhap sai nam");
                    }
                }
                flag = false;
            } catch (InputMismatchException e) {
                e.printStackTrace();
                sc.nextLine();
            }
        }while (flag);
    }

    public void layKhoangThoiGian(String start, String end )throws  ParseException{
        Date st = new SimpleDateFormat("dd/MM/yyyy").parse(start);
        Date en = new SimpleDateFormat("dd/MM/yyyy").parse(end);
        long delta = (en.getTime() -st.getTime())/(1000*3600*24);
        System.out.printf("Khoảng thời gian từ ngày %s đến ngày %s là %d",start,end, delta);
    }

    public static void main(String[] args) throws Exception {
        OOP_16 a = new OOP_16(2021,11,12);
        a.LayThongTin();
        OOP_16 b = new OOP_16();
        a.LayThongTin();
        a.layKhoangThoiGian("1/1/2021","3/1/2021");
    }
}
