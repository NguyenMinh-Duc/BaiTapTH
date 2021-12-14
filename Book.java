package BaiGiuaKi;

public class Book {
	public String id;
	public String name;
	public int price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Book() {
		
	}
	
	public Book(String name,String id,int price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	@Override
    public String toString() {
        return name +"\t"+id+"\t"+price;
    }
	
}
