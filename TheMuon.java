package Phan3;

import java.util.Scanner;

//số phiếu mượn , ngày mượn, hạn
//trả, số hiệu sách
public class TheMuon extends SinhVien {
	public String soPhieuMuon;
	public String ngayMuon;
	public String hanTra;
	public String soHieuSach;
	public String getSoPhieuMuon() {
		return soPhieuMuon;
	}
	public void setSoPhieuMuon(String soPhieuMuon) {
		this.soPhieuMuon = soPhieuMuon;
	}
	public String getNgayMuon() {
		return ngayMuon;
	}
	public void setNgayMuon(String ngayMuon) {
		this.ngayMuon = ngayMuon;
	}
	public String getHanTra() {
		return hanTra;
	}
	public void setHanTra(String hanTra) {
		this.hanTra = hanTra;
	}
	public String getSoHieuSach() {
		return soHieuSach;
	}
	public void setSoHieuSach(String soHieuSach) {
		this.soHieuSach = soHieuSach;
	}
	
	public void nhap() {
		Scanner	Input = new Scanner(System.in);
		System.out.println("Nhập họ tên: ");
		this.hoTen =Input.nextLine();
		System.out.println("Nhập năm sinh: ");
		this.namSinh =Input.nextInt();
		Input.nextLine();
		System.out.println("Nhập tuổi:");
		this.tuoi =Input.nextInt();
		Input.nextLine();
		System.out.println("Nhập lớp:");
		this.lop =Input.nextLine();
		System.out.println("Nhập số phiếu:");
		this.soPhieuMuon =Input.nextLine();
		System.out.println("Nhập ngày mượn:");
		this.ngayMuon =Input.nextLine();
		System.out.println("Nhập hạn trả:");
		this.hanTra =Input.nextLine();
		System.out.println("Nhập số hiệu sách:");
		this.soHieuSach =Input.nextLine();	
	}
	public void inTT() {
		System.out.printf("Họ tên: "+getHoTen());
		System.out.printf("Năm sinh: "+getNamSinh());
		System.out.printf("Tuổi: "+getTuoi());
		System.out.printf("Lớp: "+getLop());
		System.out.printf("Số phiếu mượn: "+getSoPhieuMuon());
		System.out.printf("Ngày mượn: "+getNgayMuon());
		System.out.printf("Hạn trả: "+getHanTra());
		System.out.printf("Số hiệu sách: "+getSoHieuSach());
		
	}
	public static void main(String[] args) {
		TheMuon fTheMuon = new TheMuon();
		fTheMuon.nhap();
		fTheMuon.inTT();
	}
}
