package BaiGiuaKi;
import java.util.ArrayList;
import Phan3.main;
import java.util.List;
import java.util.Scanner;
import BaiGiuaKi.demo.luu;

public class Store  implements luu  {
	public int totalItems;
	public int MAX_Items=6;
	public static ArrayList<String> book = new ArrayList<String>();
	public int getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}
		
   public ArrayList<String> getBook() {
		return book;
	}
	public void setBook(ArrayList<String> book) {
		this.book = book;
	}
	public void add(List<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input name: ");
        String name = sc.nextLine();
        System.out.print("input id: ");
        String id = sc.nextLine();
        System.out.print("input price: ");
        int price =sc.nextInt();
        sc.nextLine();
        Book s = new Book(name, id, price);
        list.add(s);
    }
	public void List1(List<Book> list) {
        for (Book o : list) {
            System.out.println(o);
        }
    }
	 public void delete(List<Book> list, int i) {
	        for (int j = 0; j < list.size(); j++) {
	            if (j == i) {
	                list.remove(j);
	                break;
	            }
	        }
	    }
	public void edit(List<Book> list, int i) {
        for (int j = 0; j < list.size(); j++) {
            if (j == i) {
                Scanner sc = new Scanner(System.in);
                System.out.print("input name: ");
                String name = sc.nextLine();
                System.out.print("input id: ");
                String id = sc.nextLine();
                System.out.print("input price: ");
                int price =sc.nextInt();
                sc.nextLine();
                list.get(j).setName(name);
                list.get(j).setId(id);
                list.get(j).setPrice(price);
                break;
            }
        }
    	

	

	
	
	}
	
}
