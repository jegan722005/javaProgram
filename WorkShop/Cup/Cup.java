package WorkShop;

public class Cup {

	private String cname,color,size;
	private double price;
	
	
	private Cup(String cname, String color, double price,String size) {
		
		this.cname = cname;
		this.color = color;
		this.price = price;
		this.size = size;
	}
	public static Cup getCup(String cname, String color, double price, String size) {
		return new Cup(cname, color, price, size);
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void detailsOfCup() {
		System.out.println("Cup Name:"+getCname());
		System.out.println("Cup color:"+getColor());
		System.out.println("Cup Price:"+getPrice());
		System.out.println("Cup Size:"+getSize());
	}
	
	
}
