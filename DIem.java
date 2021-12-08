package Phan3;

public class DIem {
	double x;
	double y;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public DIem(){
		
	}
	public DIem(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	public void inTTDiem() {
		System.out.println("=========================================");
		System.out.println("Information: ");
		System.out.println("x: " + this.getX());
		System.out.println("y: "+ this.getY());
		
	}
	public static double tinhKC2Diem(DIem p1, DIem p2) {
        double kc;
        kc = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
        return kc;
    }
	 public double tinhKhoangCach(double x1,double y1) {
		 
		 double khoangCach=0;
		 khoangCach = Math.sqrt(Math.pow((this.x - x1), 2) + Math.pow((this.y - y1), 2));
		 return khoangCach;
	 }
	public static void main(String[] args) {
		DIem fDIem = new DIem(3.0,5.0);
		fDIem.inTTDiem();
		fDIem.tinhKhoangCach(6.0,7.0);
		System.out.println("khoang cach den diem D la: "+fDIem.tinhKhoangCach(6.0,7.0));
		DIem D1 = new DIem(3.0,7.0);
		DIem D2 = new DIem(9.0,3.0);
		System.out.println("khoang cach 2 diem D1 va D2 la: "+tinhKC2Diem(D1, D2));
		

		
	}
	
}
