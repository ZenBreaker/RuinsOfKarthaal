
public class Town {
	private String name;
	private Shop shop;
	
	public Town() {
		name = "";
		shop = new Shop();
	}
	
	public Town(String name, Shop shop) {
		this.name = name;
		this.shop = shop;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Shop getShop() {
		return shop;
	}
	
	public void setShop(Shop shop) {
		this.shop = shop;
	}
}
