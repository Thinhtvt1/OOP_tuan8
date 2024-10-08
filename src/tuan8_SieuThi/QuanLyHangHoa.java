package tuan8_SieuThi;
import java.util.ArrayList;
public class QuanLyHangHoa {
	private ArrayList<HangHoa> danhSachHangHoa;

    public QuanLyHangHoa() {
        this.danhSachHangHoa = new ArrayList<>();
    }

    public boolean themHangHoa(HangHoa hangHoa) {
        for (HangHoa hh : danhSachHangHoa) {
            if (hh.maHang.equals(hangHoa.maHang)) {
                return false; // Trùng mã hàng
            }
        }
        danhSachHangHoa.add(hangHoa);
        return true; // Thêm thành công
    }

 
}
