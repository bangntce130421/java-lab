package model;

import java.util.Scanner;

/**
 * 
 * @author PhanSo class
 *
 */
public class PhanSo {

	// thuộc tính (attribute)
	private int tuSo;
	private int mauSo;

	/**
	 * Hàm khởi tạo không đối số (no-argument constructor)
	 */
	public PhanSo() {

		// mặc định phân số có dạng 0/1 vì mẫu số phải khác 0
		this.tuSo = 0;
		this.mauSo = 1;
	}

	/**
	 * Hàm khởi tạo có đối số (parameterized constructor)
	 * 
	 * @param tuSo
	 * @param mauSo
	 */
	public PhanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}

	/**
	 * Nhập phân số
	 * 
	 * @param sc
	 */
	public void nhapPhanSo(Scanner sc) {

		int a;
		int b;

		do {
			// nhập tử số, mẫu số
			System.out.print("Nhap tu so: ");
			a = sc.nextInt();
			System.out.print("Nhap mau so: ");
			b = sc.nextInt();

			// kiểm tra
			if (b == 0) {
				System.err.println("Mau so khong duoc bang 0. Hay nhap lai!");
			} else {
				this.tuSo = a;
				this.mauSo = b;
			}
		} while (b == 0);

	}

	/**
	 * Hiển thị phân số
	 */
	public void hienThiPhanSo() {

		if (this.tuSo * this.mauSo < 0) {

			// -1/1 or 1/-1 == -(1/1)
			System.out.println("-" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
		} else {

			// -1/-1 or 1/1 == 1/1
			System.out.println(Math.abs(tuSo) + "/" + Math.abs(mauSo));
		}
	}

	/**
	 * Cộng hai phân số
	 * 
	 * @param ps2
	 * @return
	 */
	public PhanSo congPhanSo(PhanSo ps2) {

		// quy đồng mẫu số hai phân số
		int a = (this.tuSo * ps2.mauSo) + (ps2.tuSo * this.mauSo);
		int b = this.mauSo * ps2.mauSo;

		return new PhanSo(a, b);
	}

	/**
	 * Trừ hai phân số
	 * 
	 * @param ps2
	 * @return
	 */
	public PhanSo truPhanSo(PhanSo ps2) {

		// quy đồng mẫu số hai phân số
		int a = (this.tuSo * ps2.mauSo) - (ps2.tuSo * this.mauSo);
		int b = this.mauSo * ps2.mauSo;

		return new PhanSo(a, b);
	}

	/**
	 * Nhân hai phân số
	 * 
	 * @param ps2
	 * @return
	 */
	public PhanSo nhanPhanSo(PhanSo ps2) {

		int a = this.tuSo + ps2.tuSo;
		int b = this.mauSo + ps2.mauSo;

		return new PhanSo(a, b);
	}

	/**
	 * Chia hai phân số
	 * 
	 * @param ps2
	 * @return
	 */
	public PhanSo chiaPhanSo(PhanSo ps2) {

		// phân số thứ nhất * nghịch đảo của phân số thứ 2
		int a = this.tuSo * ps2.mauSo;
		int b = this.mauSo * ps2.tuSo;

		return new PhanSo(a, b);
	}

	/**
	 * Tìm ước số chung lớn nhất
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private int timUocSoChungLonNhat(int a, int b) {

		int r = a % b;

		// a chia hết cho b (a%b=0) ==> b là ước của a
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}

		return b;
	}

	/**
	 * Hàm kiểm tra phân số tối giản hay chưa?
	 * 
	 * @return
	 */
	public boolean kiemTraToiGian() {

		if (timUocSoChungLonNhat(this.tuSo, this.mauSo) == 1) {
			return true;
		}

		return false;
	}

	public void toiGianPhanSo() {

		int x = timUocSoChungLonNhat(this.tuSo, this.mauSo);

		this.tuSo /= x;
		this.mauSo /= x;

	}

}
