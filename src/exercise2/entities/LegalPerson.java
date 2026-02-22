package exercise2.entities;

public class LegalPerson extends Taxpayer {
	
	private int employeesNumber;

	public LegalPerson(String name, double annualIncome, int employeesNumber) {
		super(name, annualIncome);
		this.employeesNumber = employeesNumber;
	}

	@Override
	public double calculateTax() {
		double incomeAfterTax = annualIncome * 0.16; 
		
		if(employeesNumber > 10) {
			incomeAfterTax = annualIncome * 0.14;
		}
		
		return incomeAfterTax;
	}

	public int getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(int employeesNumber) {
		this.employeesNumber = employeesNumber;
	}
	public String toString() {
		return String.format("%s : $ %.2f", name, calculateTax()); 
	}

}
