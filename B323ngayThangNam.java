package Phan3;

import java.util.Scanner;

public class B323ngayThangNam {
	public int ngay;
	public int thang;
	public int nam;
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.printf("Nhập ngày: ");
		this.ngay=sc.nextInt();
		sc.nextLine();
		System.out.printf("Nhập tháng: ");
		this.thang=sc.nextInt();
		sc.nextLine();
		System.out.printf("Nhập năm: ");
		this.thang=sc.nextInt();
		sc.nextLine();
	}
	int a;
	int ngayThuN;
	public boolean xetNam(int nam){
	if(nam%4 ==0 && nam != 100) {
		return true;
	}
	else {
		return false;
	}
	}
	public int SoNgayTrongThang(int Nam, int Thang)
    {
        switch (Thang)
        {
            case 4:
            case 6:
            case 9:
            case 11: return 30;
            case 2:
                {
                    if (xetNam(Nam)) return 29;
                    return 28;
                }
            default: return 31;
        }
    }
	public int SoNgay(int Nam, int Thang,int soNgayCuaThangHienTai)
    {
        var SoNgay=0;
        for (int i = 1; i < Thang; i += 1)
            SoNgay += SoNgayTrongThang(Nam, i);
        return (SoNgay+soNgayCuaThangHienTai);
    }
	
	
	public static void main(String[] args) {
		B323ngayThangNam fB323ngayThangNam = new B323ngayThangNam();
		System.out.printf("Ngay can tim la "+ fB323ngayThangNam.SoNgay(2012, 4, 5));
	}
	
	

}
