package OOP_BASIC;

class BinhLinh {
    public static String Ten;
    public static double K =1.1;
    public static double SucManh =50;
    public static boolean TrangBi =false;

    public static void setTrangBi(boolean trangBi) {
        TrangBi = trangBi;
    }

    public static void setSucManh(double sucManh) {
        SucManh = sucManh*K;
    }

    public static void setTen(String ten) {
        Ten = ten;
    }

    public static String getTen() {
        return Ten;
    }

    public static double getSucManh() {
        return SucManh;
    }
    void inThongTin(){
        System.out.println(Ten +" có sức mạnh :"+SucManh);
    }

    public static boolean chienDau(BinhLinh b){
        if(b.getSucManh()>= SucManh){
            return false;
        }return true;
    }
}


class CungThu extends  BinhLinh{
    public double K =1.5;
}
class KiemSi extends  BinhLinh{
    public double K =1.7;
}
class test1{
    public static void main(String[] args) {
        BinhLinh linh = new BinhLinh();
        BinhLinh.setTrangBi(true);
        BinhLinh.setTen("Linh 1");

        CungThu cung = new CungThu();
        cung.setTen("sdsd");
    }
}