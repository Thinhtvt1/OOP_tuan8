package tuan7_GiaoDich;
import java.util.Date;
public class GiaoDichVang extends GiaoDich{
	private String loaiVang;

    public GiaoDichVang(String maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }
    

    public String getLoaiVang() {
		return loaiVang;
	}


	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}


	@Override
	public double tinhthanhtien() {
		return soLuong * donGia;	
	}


	@Override
	public String toString() {
		return super.toString() + String.format("|%-15s|%-15.2f", loaiVang, tinhthanhtien());
	}
	
}
