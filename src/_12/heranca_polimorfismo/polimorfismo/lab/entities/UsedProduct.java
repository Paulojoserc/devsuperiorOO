package _12.heranca_polimorfismo.polimorfismo.lab.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufatureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufatureDate) {
		super(name, price);
		this.manufatureDate = manufatureDate;
	}

	public Date getManufatureDate() {
		return manufatureDate;
	}

	public void setManufatureDate(Date manufatureDate) {
		this.manufatureDate = manufatureDate;
	}
	
	@Override
	public String priceTag() {
		return getName()
						+" (used) $ "
						+ String.format("%.2f", getPrice()) 
						+  "(Manufacture date: "
						+ sdf.format(manufatureDate)
						+")";
	}
}
