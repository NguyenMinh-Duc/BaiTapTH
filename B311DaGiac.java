package Phan3;

import java.util.Random;
import java.util.Scanner;

public class B311DaGiac {
	int soCanh;
	int doDaiCanh[];
	int chuvi;
	public void NhapCanh(){

		Scanner sc=new Scanner(System.in);

		System.out.println("Nhap vao so canh: ");

		soCanh=sc.nextInt();

		doDaiCanh=new int[soCanh];

		for(int i=0;i<soCanh;i++){

		System.out.println("Nhap vao canh thu "+(i+1));

		doDaiCanh[i]=sc.nextInt();

		}

		}public void tinhChuvi(){

		chuvi=0;

		for(int i=0;i<soCanh;i++){

		chuvi=chuvi+doDaiCanh[i];

		}

		System.out.println("Chu vi da giac la: "+chuvi);

		}public static void main(String[] args) {

			B311DaGiac dg=new B311DaGiac();

		dg.NhapCanh();

		dg.tinhChuvi();

		}

		}

