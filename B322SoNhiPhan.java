package Phan3;

import java.util.Scanner;

public class B322SoNhiPhan {
	public int n;
	public int i;
	int a[]=new int[10];
	public void nhapN() {
		System.out.println("Nhap n: ");
		Scanner sc = new Scanner(System.in);
		this.n=sc.nextInt();
		sc.nextLine();
	}

	public void soNhiPhan() {
		for(i=0;n>0;i++) {
			a[i]=n%2;
			n=n/2;
		}
		System.out.printf("So nhi phan cua %d la: ",n);
		for(i=i-1;i>=0;i--)  
		{  
		System.out.printf("%d",a[i]);  
		}  
	}
	
	public static void main(String[] args) {
		B322SoNhiPhan fSo = new B322SoNhiPhan();
		fSo.nhapN();
		fSo.soNhiPhan();
	}
	
}