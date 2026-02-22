package exercise1.entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct() {
		
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customsFee = customFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return String.format("%s $ %.2f (Customs fee: $ %.2f)", name, totalPrice(), customsFee); 
	}
	
	public double totalPrice() {
		return price + customsFee;
	}
	@Override
	public String toString() {
		return String.format("%s $ %.2f (Customs fee: $ %.2f) ", name,totalPrice(),customsFee);
	}
	
}
