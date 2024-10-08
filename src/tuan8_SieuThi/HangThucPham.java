package tuan8_SieuThi;

public class HangThucPham extends HangHoa {
	private String ngaySanXuat;
    private String ngayHetHan;
    private String nhaCungCap;

    public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia, String ngaySanXuat, String ngayHetHan, String nhaCungCap) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    @Override
    public double tinhVAT() {
        return donGia * 0.05;
    }

    @Override
    public String danhGiaBanBuon() {
        // Kiểm tra ngày hết hạn
        // Giả sử ngày hiện tại là "2023-10-06"
        String currentDate = "2023-10-06"; 
        if (soLuongTon > 0 && ngayHetHan.compareTo(currentDate) < 0) {
            return "Khó bán";
        }
        return "Không đánh giá";
    }
}
