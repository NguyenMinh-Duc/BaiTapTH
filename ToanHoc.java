package Phan3;

import java.util.Scanner;

public class ToanHoc {
	public int k ;
	//1 Kiem tra so nguyen to
	public static boolean kiemtraNguyenTo(int k) {
		
		if(k<2) {
			return false;
		}else {
			if(k%2==0) {
				return false;
			}else {
				for(int i = 2;i<= Math.sqrt(k);i++) {
					if(k%i==0) {
						return false;
					}
				}
			}
		}
		return true;
	}
	//2 Kiem tra so hoan hao
	public static boolean kiemtraHoanHao(int n) {
		int sum = 0;
	    for(int i=1;i<=n/2;i++){
	        if(n%i==0) 
	            sum+=i;
	    }
	    if(sum==n) return true; 
	    return false;
	}
	
	//3 Kiem tra so chinh phuong
	public static boolean kiemtraSoChinhPhuong(int n) {
		int cb2 = (int)Math.sqrt(n);
		if(cb2*cb2 == n) {
            return true;
        }
        else {
            return false;
        }
	}
	
	//4 Tinh so fibonaci thu n voi CT
	/* 
	 * Ln = 2 nếu n = 0
	 * Ln=1 nếu n = 1
	 *L(n-1)+L(n-2) nếu n>1 */
	public static int tinhFibo(int n) {
		if(n==0) {
			return 2;
		}else if (n==1) {
			return 1;
		}else if(n>1) {
			return tinhFibo(n-1)+tinhFibo(n-2);	
	}
		return tinhFibo(n-1)+tinhFibo(n-2);	
	}
	
	//B5: tinh tong S = 1/2 +2/3 +...+ n-1/n
	public static float tinhTongb5(int n) {
		int i;
		float tong = 0;
		for(i = 1;i<=n;i++) {
			tong += 1.0*(i-1)/i;	
		}
		return tong;
	}
	//B6: tinh tong day S = 1!/(x+k) +2!/(x^2-k^2) +...+ n!/(x^n+ (-1)^(n+1)*k^n)
	public static float tinhTongb6(int n,int x,int k) {
		int i;
		float tong = 0;
		float tich = 1;
		for(i = 1;i<=n;i++) {
			tich*=i;
			tong += 1.0*tich/(Math.pow(x, i)+Math.pow(-1,i+1)*Math.pow(k, i));
		}
		return tong;
	}
	
	//B7: tinh tong day S = 1 + 2 -3 + .... + (-1)^(n+1) *n
	public static double tinhTongb7(int n) {
		double tong=1;
		int i;
		for(i=2;i<=n;i++) {
			tong+= Math.pow(-1, i)*i;
		}
		return tong;
	}

	//B8: tinh tong day S = 1!+ 2!+ 3! +...+ n!
	public static double tinhTongb8(int n) {
		double tong =0;
		double tich = 1;
		int i;
		for(i=1;i<=n;i++) {
			tich*=i;
			tong += tich;
		}
		return tong;
	}
}
