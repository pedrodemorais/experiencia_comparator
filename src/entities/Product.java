package entities;

public class Product implements Comparable<Product>{
	
	private String name;
	private Double price;
	
	public Product() {
		
	}
	
	public Product (String name, Double price) {
		this.name = name;
		this.price = price;
		
	}
	
	public void setName(String name) {
		this.name=name;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(Double price) {
		this.price = price;
		
		
	}
	
	public Double getPrice() {
		return price;
	}
	
	

	@Override
	public String toString() {
		return "Product [name: " + name + ", price:" + price + "]";
	}

	@Override
	public int compareTo(Product other) {
		// TODO Auto-generated method stub
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}

}
