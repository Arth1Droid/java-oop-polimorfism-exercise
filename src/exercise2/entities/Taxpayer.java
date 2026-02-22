package exercise2.entities;

public abstract class Taxpayer {
	
	protected String name;
	protected double annualIncome;
	
	public Taxpayer(String name, double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}
	
	public abstract double calculateTax();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	
}
