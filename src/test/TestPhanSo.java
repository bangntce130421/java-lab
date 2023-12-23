package test;

import java.util.Scanner;

import model.PhanSo;

/**
 * 
 * @author Test
 *
 */
public class TestPhanSo {

	public static void main(String[] args) {

		// - Xây dựng lớp phân số với hai thuộc tính riêng xác định tử số và mẫu số của
		// phân số và xây dựng các phương thức:
		// + Các hàm khởi tạo (constructor) trong trường hợp không có tham số và trường
		// hợp có 2 tham số tử số và mẫu số.
		// + Các hàm thực hiện phép toán cộng, trừ, nhân, chia các phân số.
		// + Hàm thực hiện kiểm tra một phân số có phải tối giản hay không.
		// + Hàm tìm dạng tối giản của phân số.
		// + Hàm tìm ước số chung lớn nhất của 2 số nguyên.
		// - Viết chương trình ứng dụng, trong đó khai báo 3 đối số phân số là sp1, sp2
		// và spTong để tương tác với các hàm có trong lớp phân số trên.

		Scanner sc = new Scanner(System.in);

		// tạo phân số thứ nhất
		PhanSo ps1 = new PhanSo();

		// tạo phân số thứ hai
		PhanSo ps2 = new PhanSo();

		// nhập phân số
		System.out.println("===== Nhap vao phan so thu nhat =====");
		ps1.nhapPhanSo(sc);
		System.out.println("===== Nhap vao phan so thu hai =====");
		ps2.nhapPhanSo(sc);

		PhanSo psTong = new PhanSo();

		// tính tổng hai phân số
		psTong = ps1.congPhanSo(ps2);

		// hiển thị
		System.out.println();
		System.out.print("Phan so thu nhat ==> ");
		ps1.hienThiPhanSo();
		System.out.print("Phan so thu hai ==> ");
		ps2.hienThiPhanSo();
		System.out.print("Tong hai phan so ==> ");
		psTong.hienThiPhanSo();

		sc.close();

	}

}
