package tuan8_SieuThi;

public abstract class HangHoa implements HangHoaInterface{
	protected String maHang;
    protected String tenHang;
    protected int soLuongTon;
    protected double donGia;

    public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }
}
