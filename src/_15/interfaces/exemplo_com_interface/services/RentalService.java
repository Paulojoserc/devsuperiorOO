package _15.interfaces.exemplo_com_interface.services;

import _15.interfaces.exemplo_com_interface.entiteis.CarRental;
import _15.interfaces.exemplo_com_interface.entiteis.Invoice;

public class RentalService {
	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		super();
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		double hours = (double)(t2-t1)/1000 / 60 /60;
		double basicPayment;
		if (hours <= 12.0) {
			 basicPayment = Math.ceil(hours) * pricePerHour;
		}else {
			basicPayment = Math.ceil(hours/24) * pricePerDay;
		}
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
