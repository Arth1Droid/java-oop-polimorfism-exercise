package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private Date manufactureDate;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	
	@Override
	public String priceTag() {
		return String.format("%s $ %.2f (Customs fee: $ %.2f (Manufacture Date: %s )", name,price,sdf.format(manufactureDate)); 

	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}


	@Override
	public String toString() {
		return String.format("%s (used) $ %.2f (Manufacture date: %s)", name,price,sdf.format(manufactureDate));
	}
	
	
	
	
	
}
