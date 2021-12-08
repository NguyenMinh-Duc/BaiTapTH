package Phan3;

import java.util.Scanner;

public class VanDung extends ToanHoc {
public static void main(String[] args) {
		
		ToanHoc fToanHoc = new ToanHoc();
		
		//1 Kiem tra so nguyen to
		if(fToanHoc.kiemtraNguyenTo(19)) {
			System.out.println("k la so nguyen to");
		}else {
			System.out.println("k không la so nguyen to");
		}
		
		//2 Kiem tra so hoan hao
		if(fToanHoc.kiemtraHoanHao(12)) {
			System.out.printf(" n la so hoan hao");
		}else {
			System.out.println("n không la hoan hao");
		}
		
		//3 Kiem tra so chinh phuong
		if(fToanHoc.kiemtraSoChinhPhuong(4)) {
			System.out.println("a la so chinh phuong");
		}else {
			System.out.println("a khong la so chinh phuong");
		}
		
		//4 Tinh so fibonaci thu n voi CT
		/* 
		 * Ln = 2 nếu n = 0
		 * Ln=1 nếu n = 1
		 *L(n-1)+L(n-2) nếu n>1 */
		System.out.printf("So fibonaci thu n la %d ",tinhFibo(3));
		
		//B5: tinh tong S = 1/2 +2/3 +...+ n-1/n
		System.out.printf("\ntong S = 1/2 +2/3 +...+ n-1/n la  " + tinhTongb5(4));
		
		//B6: tinh tong day S = 1!/(x+k) +2!/(x^2-k^2) +...+ n!/(x^n+ (-1)^(n+1)*k^n)
		System.out.printf("\ntong day S = 1!/(x+k) +2!/(x^2-k^2) +...+ n!/(x^n+ (-1)^(n+1)*k^n) là " + tinhTongb6(3,1,2));
		//B7: tinh tong day S = 1 + 2 -3 + .... + (-1)^(n+1) *n
		System.out.printf("\ntong day S = 1 + 2 -3 + .... + (-1)^(n+1) *n là " + tinhTongb7(5));
		//B8: tinh tong day S = 1!+ 2!+ 3! +...+ n!
		System.out.printf("\ntong day S = 1!+ 2!+ 3! +...+ n! là " + tinhTongb8(5));
	}
}


