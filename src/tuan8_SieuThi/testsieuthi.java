package tuan8_SieuThi;

import java.util.Scanner;

public class testsieuthi {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyHangHoa quanLy = new QuanLyHangHoa();
        int choice;

        do {
            System.out.println("1. Thêm hàng hóa");
            System.out.println("2. In danh sách hàng hóa");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Chọn loại hàng hóa:");
                    System.out.println("1. Hàng thực phẩm");
                    System.out.println("2. Hàng sành sứ");
                    System.out.println("3. Hàng điện máy");
                    int loai = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer

                    System.out.print("Nhập mã hàng: ");
                    String maHang = scanner.nextLine();
                    System.out.print("Nhập tên hàng: ");
                    String tenHang = scanner.nextLine();
                    System.out.print("Nhập số lượng tồn: ");
                    int soLuongTon = scanner.nextInt();
                    System.out.print("Nhập đơn giá: ");
                    double donGia = scanner.nextDouble();

                    if (loai == 1) { // Hàng thực phẩm
                        scanner.nextLine(); // Clear buffer
                        System.out.print("Nhập ngày sản xuất: ");
                        String ngaySanXuat = scanner.nextLine();
                        System.out.print("Nhập ngày hết hạn: ");
                        String ngayHetHan = scanner.nextLine();
                        System.out.print("Nhập nhà cung cấp: ");
                        String nhaCungCap = scanner.nextLine();

                        HangThucPham hangThucPham = new HangThucPham(maHang, tenHang, soLuongTon, donGia, ngaySanXuat, ngayHetHan, nhaCungCap);
                        if (quanLy.themHangHoa(hangThucPham)) {
                            System.out.println("Thêm thành công!");
                        } else {
                            System.out.println("Mã hàng đã tồn tại!");
                        }

                    } else if (loai == 2) { // Hàng sành sứ
                        scanner.nextLine(); // Clear buffer
                        System.out.print("Nhập nhà sản xuất: ");
                        String nhaSanXuat = scanner.nextLine();
                        System.out.print("Nhập ngày nhập kho: ");
                        String ngayNhapKho = scanner.nextLine();

                        HangSanhSu hangSanhSu = new HangSanhSu(maHang, tenHang, soLuongTon, donGia, nhaSanXuat, ngayNhapKho);
                        if (quanLy.themHangHoa(hangSanhSu)) {
                            System.out.println("Thêm thành công!");
                        } else {
                            System.out.println("Mã hàng đã tồn tại!");
                        }

                    } else if (loai == 3) { // Hàng điện máy
                        System.out.print("Nhập thời gian bảo hành (tháng): ");
                        int thoiGianBaoHanh = scanner.nextInt();
                        System.out.print("Nhập công suất (KW): ");
                        double congSuat = scanner.nextDouble();

                        HangDienMay hangDienMay = new HangDienMay(maHang, tenHang, soLuongTon, donGia, thoiGianBaoHanh, congSuat);
                        if (quanLy.themHangHoa(hangDienMay)) {
                            System.out.println("Thêm thành công!");
                        } else {
                            System.out.println("Mã hàng đã tồn tại!");
                        }
                    }
                    break;

                case 2:
                    quanLy.inDanhSachHangHoa();
                    break;

                case 3:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Chọn không hợp lệ.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
