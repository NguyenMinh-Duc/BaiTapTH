package Phan3;

import java.util.Scanner;

public class KhachHang {
	public String hoTenChuHo;
	public int soNha;
	public String maSoCongTo;
	public String getHoTenChuHo() {
		return hoTenChuHo;
	}
	public void setHoTenChuHo(String hoTenChuHo) {
		this.hoTenChuHo = hoTenChuHo;
	}
	public int getSoNha() {
		return soNha;
	}
	public void setSoNha(int soNha) {
		this.soNha = soNha;
	}
	public String getMaSoCongTo() {
		return maSoCongTo;
	}
	public void setMaSoCongTo(String maSoCongTo) {
		this.maSoCongTo = maSoCongTo;
	}
	public void nhapTT() {
		Scanner	Input = new Scanner(System.in);
		System.out.println("\nNhập họ tên: ");
		this.hoTenChuHo =Input.nextLine();
		System.out.println("\nNhập số nhà: ");
		this.soNha =Input.nextInt();
		Input.nextLine();
		System.out.println("\nNhập mã số công tơ:");
		this.maSoCongTo=Input.nextLine();
	}
	public void inTT() {
		System.out.printf("Họ tên: "+getHoTenChuHo());
		System.out.printf("Số nhà: "+getSoNha());
		System.out.printf("Mã số công tơ"+getMaSoCongTo());
	}
}
