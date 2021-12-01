package OOP_BASIC;

import java.util.Scanner;

/*Đề bài
        Một cửa hàng sách cần quản lý các loại tài liệu bao gồm: Sách, Tạp chí, Truyện tranh

        Mỗi tài liệu có các thông tin chung: Mã tài liệu, Tên nhà xuất bản, Số bản phát hành.

        Sách có thêm các thông tin: Tên sách, tên tác giả, số trang
        Tạp chí có thêm các thông tin: Tên tạp chí, số phát hành, tháng phát hành
        Truyện tranh có thêm các thông tin: Tên truyện, ngày phát hành.
        Xây dựng các phương thức để quản lý

        Nhập thông tin cho các tài liệu.
        Hiển thị thông tin về các tài liệu.
        Tìm kiếm tài liệu theo tên.
        Xây dựng các lớp để quản lý các loại tài liệu trên sao cho tối ưu nhất.*/
class Book {
        public  int maTaiLieu;
        public  String tenNhaXuatBan;
        public int soBanXuatHanh;
        Book(){
                super();
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhap ma sach\n");
                this.maTaiLieu = sc.nextInt();
                System.out.println("Nhap ten nha san xuat\n");
                this.tenNhaXuatBan = sc.nextLine();
                System.out.println("So ban phat hanh");
                this.soBanXuatHanh =sc.nextInt();
        }
        public void nhapSach(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập mã sách: ");
                maTaiLieu = sc.nextInt();
                System.out.print("Nhập tên nhà xuất bản: ");
                tenNhaXuatBan = sc.nextLine();
                System.out.print("Nhập số lượng xuất bản: ");
                soBanXuatHanh = sc.nextInt();
        }
}
