package Phan3;

import java.util.Scanner;

//Họ tên chủ hộ, số nhà, mã số
//công tơ của hộ dân sử dụng điện
public class BienLai extends KhachHang {
	public int chiSoCu;
	public int chiSoMoi;
	public int tienPhaiTra;
	public int n;
	public int getChiSoCu() {
		return chiSoCu;
	}
	public void setChiSoCu(int chiSoCu) {
		this.chiSoCu = chiSoCu;
	}
	public int getChiSoMoi() {
		return chiSoMoi;
	}
	public void setChiSoMoi(int chiSoMoi) {
		this.chiSoMoi = chiSoMoi;
	}
	public int getTienPhaiTra() {
		return tienPhaiTra;
	}
	public void setTienPhaiTra(int tienPhaiTra) {
		this.tienPhaiTra = tienPhaiTra;
	}
	public void nhapN() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n: ");
		this.n=sc.nextInt();
		sc.nextLine();
	}
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public void nhapThongTinN() {
		for(int i = 1;i<=n;i++) {
			System.out.printf("\nThong tin nguoi %d la: ",i);
			super.nhapTT();
			Scanner	Input = new Scanner(System.in);
			System.out.println("\nNhập chỉ số cũ: ");
			this.chiSoCu =Input.nextInt();
			Input.nextLine();
			System.out.println("\nNhập chỉ số mới: ");
			this.chiSoMoi =Input.nextInt();
			Input.nextLine();
			System.out.printf("\nChi so cu: ");
			System.out.printf("");
			System.out.printf("\nSo tien phai tra cho  ho dan %d la: %d\n",i,(chiSoCu-chiSoMoi)*850000);
		}
		
	}
	public static void main(String[] args) {
		BienLai fBienLai =new BienLai();
		fBienLai.nhapN();
		fBienLai.nhapThongTinN();
	}
	
}
