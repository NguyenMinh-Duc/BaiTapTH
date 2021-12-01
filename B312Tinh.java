package Phan3;

import java.util.Scanner;

public class B312Tinh {
	public static void main(String[] args) {
	float a;
	float b;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap a: ");
	
	a=sc.nextFloat();
	sc.nextLine();
	System.out.println("\nNhap b: ");
	b=sc.nextFloat();
	sc.nextLine();
	
	System.out.printf("\nTong  is %f",a+b);
	System.out.printf("\nHieu  is %f  ",a-b);
	System.out.printf("\nTich  is %f  ",a*b);
	System.out.printf("\nThuong  is %f  ",a/b);
	System.out.printf("\nSo du is %f  ",a%b);
	sc.close();
}
}