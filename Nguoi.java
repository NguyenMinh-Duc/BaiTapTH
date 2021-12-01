package Phan3;

import java.util.Scanner;

public class Nguoi {
	public String hoTen;
	public String diaChi;
	public int namSinh;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int tuoi) {
		this.namSinh = namSinh;
	}
	
	public Nguoi(String hoTenNguoi,String diaChiNguoi,int namSinhNguoi) {
		this.hoTen=hoTenNguoi;
		this.diaChi=diaChiNguoi;
		this.namSinh=namSinhNguoi;
	}
	public Nguoi() {
		
	}
	
	public void nhapTT() {
		Scanner	Input = new Scanner(System.in);
		System.out.println("Nhập họ tên: ");
		this.hoTen =Input.nextLine();
		System.out.println("Nhập địa chỉ: ");
		this.diaChi =Input.nextLine();
		System.out.println("Nhập năm sinh:");
		this.namSinh=Input.nextInt();
		Input.nextLine();
	}
	public void inTT() {
		
		System.out.println("Thông tin người: ");
		System.out.println("Ten: " + this.getHoTen());
		System.out.println("Địa chỉ: "+ this.getDiaChi());
		System.out.println("Năm sinh: "+ this.getNamSinh());
	}
	public static void main(String[] args) {
		Nguoi fNguoi = new Nguoi();
		fNguoi.nhapTT();
		fNguoi.inTT();
	}
}
