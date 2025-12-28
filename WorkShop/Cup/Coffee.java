package WorkShop;

public class Coffee {

	private String cname,name,power,col_hot;
	private int sucar_level;
	private double price;
	
	private Cup cup;

	private Coffee(String cname,String name, String power, String col_hot, int sucar_level, double price) {
		this.cname = cname;
		this.name=name;
		this.power = power;
		this.col_hot = col_hot;
		this.sucar_level = sucar_level;
		this.price = price;
	}
	public static Coffee getCoffeeObj(String cname,String name, String power, String col_hot, int sucar_level, double price) {
		return new Coffee(cname,name, power, col_hot, sucar_level, price);
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getCol_hot() {
		return col_hot;
	}

	public void setCol_hot(String col_hot) {
		this.col_hot = col_hot;
	}

	public int getSucar_level() {
		return sucar_level;
	}

	public void setSucar_level(int sucar_level) {
		this.sucar_level = sucar_level;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Cup getCup() {
		return cup;
	}
	public void setCup(Cup cup) {
		this.cup = cup;
	}
	public void InsertCoffee(Cup coff) {
		if(cup==null) {
			cup=coff;
			System.out.println("\t\t****  "+getName()+"  Your Coffee Order ***");
		}else {
			System.out.println("\t\tAlready Order In Coffee");
		}
	}
	public void removeCoffee() {
		if(cup!=null) {
			cup=null;
			System.out.println("\t\tYour Order Cancel...");
		}else {
			System.out.println("\t\t***Already Your Order Cancel***");
		}
	}
	public boolean isCupEmpty() {
		return cup==null;
	}
	
}
















