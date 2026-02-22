package exercise2.entities;

public class NaturalPerson extends Taxpayer {
	
	private double healthSpending;
	public NaturalPerson(String name, double annualIncome, double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	@Override
	public double calculateTax() {
		double incomeAfterTax;
		if(annualIncome < 20000.00) {
			incomeAfterTax = annualIncome * 0.15; 
		}
		else {
		    incomeAfterTax = annualIncome * 0.25;
		}
		incomeAfterTax -= healthSpending * 0.5;
		
		return incomeAfterTax;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public String toString() {
		return String.format("%s : $ %.2f", name, calculateTax()); 
	}
	

}
