package BaiGiuaKi;

import java.util.List;import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import BaiGiuaKi.demo.luu;



public class main {
	
	
	public static void main(String[] args) {
		luu v = (luu) new Store();
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        books.add(new Book());
        books.add(new Book("Dac nhan tam", "AT1", 80000));
        books.add(new Book("Chua te nhung chiec nhan","AT2", 18800));
        books.add(new Book("Bo gia", "AT3", 75000));
        books.add(new Book("De gio cuon di", "AT4", 220000));
        while (true) {
            int index = 0;
            int choice = 0;
            System.out.print("input choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    v.add(books);
                    break;
                case 2:
                    System.out.print("input edit index: ");
                    index = Integer.parseInt(sc.nextLine());
                    v.edit(books, index);
                    break;
                case 3:
                    v.List1(books);
                    break;
                case 4:
                    System.out.print("input delete index: ");
                    index = Integer.parseInt(sc.nextLine());
                    v.delete(books, choice);
                    break;  
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
	}

