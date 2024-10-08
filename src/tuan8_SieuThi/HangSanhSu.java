package tuan8_SieuThi;

public class HangSanhSu extends HangHoa {
	private String nhaSanXuat;
    private String ngayNhapKho;

    public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat, String ngayNhapKho) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }

    @Override
    public double tinhVAT() {
        return donGia * 0.10;
    }

    @Override
    public String danhGiaBanBuon() {
        // Giả sử thời gian lưu kho là số ngày
        int soNgayLuuKho = 12; // Giả sử
        if (soLuongTon > 50 && soNgayLuuKho > 10) {
            return "Bán chậm";
        }
        return "Không đánh giá";
    }
}
