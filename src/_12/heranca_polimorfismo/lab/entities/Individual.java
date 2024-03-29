package _12.heranca_polimorfismo.lab.entities;

public class Individual extends TaxPayer {
	private Double heathExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double heathExpenditures) {
		super(name, anualIncome);
		this.heathExpenditures = heathExpenditures;
	}

	public Double getHeathExpenditures() {
		return heathExpenditures;
	}

	public void setHeathExpenditures(Double heathExpenditures) {
		this.heathExpenditures = heathExpenditures;
	}

	@Override
	public double tax() {
		//Exemplo no ternario 
		//double basictax = (getAnualIncome()< 20000.0)? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;
		double basicTax;
		if(getAnualIncome() < 20000.0) {
			basicTax = getAnualIncome() * 15.0 /100;
		}else {
			basicTax = getAnualIncome() * 0.25;
		}
		basicTax -= getHeathExpenditures()*0.5;
		if(basicTax < 0.0) {
			basicTax = 0.0;
		}
		return basicTax;
	}
	
}
