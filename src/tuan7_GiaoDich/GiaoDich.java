package tuan7_GiaoDich;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public abstract class GiaoDich {
	protected String maGiaoDich;
    protected Date ngayGiaoDich;
    protected double donGia;
    protected int soLuong;

    public GiaoDich(String maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public abstract double tinhthanhtien();

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

	public String getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public Date getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	public void setNgayGiaoDich(Date ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		 DecimalFormat df = new DecimalFormat("#,###0.00");
		// TODO Auto-generated method stub
		return String.format("|%10s|%10s|%10.2f|%5d|", getMaGiaoDich(), simpleDateFormat.format(ngayGiaoDich), getDonGia(), getSoLuong());
	}
}
