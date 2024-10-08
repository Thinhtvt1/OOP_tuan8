package tuan7_GiaoDich;
import java.util.Date;
public class GiaoDichTienTe extends GiaoDich{
	private double tiGia;
    private String loaiTienTe;

    public GiaoDichTienTe(String maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong, double tiGia, String loaiTienTe) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }
    

    public double getTiGia() {
		return tiGia;
	}


	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}


	public String getLoaiTienTe() {
		return loaiTienTe;
	}


	public void setLoaiTienTe(String loaiTienTe) {
		this.loaiTienTe = loaiTienTe;
	}


	
 


	@Override
	public double tinhthanhtien() {
		if(loaiTienTe.equals("VN")) {
			return soLuong * donGia;
		}else return 
				soLuong * donGia * tiGia;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("|%-15f|%-15s|-15.2f|", tiGia, loaiTienTe, tinhthanhtien());
	}
	
}
