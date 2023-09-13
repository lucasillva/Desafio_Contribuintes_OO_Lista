package entites;

public class TaxPayer {

	private	 double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;
	
	
	public TaxPayer() {
		
	}
	
	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public double salaryTax() {
		double monthlySalary = salaryIncome / 12.0;
		double incomeTax;
		
		if (monthlySalary < 3000) {
			incomeTax = 0.0;
			
		}else if (monthlySalary < 5000) {
			incomeTax = 12 * (monthlySalary * 0.1);

		}else incomeTax = 12 * (monthlySalary * 0.2);
		
	     return incomeTax;
	}

	public double servicesTax() {
		return servicesIncome * 0.15;
	}
	
	public double capitalTax() {
		return capitalIncome * 0.2;
	}
	
	
	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}
	
	
	public double taxRebate() {
		double expense = healthSpending + educationSpending;
		double rebateLimit = 0.3 * grossTax();
		double rebate;
		
		if(expense < rebateLimit) {
			rebate = expense;
		
		}else rebate = rebateLimit;
		
		return rebate;
	}
	
	
	public double netTax() {
		return grossTax() - taxRebate();
	}
}


