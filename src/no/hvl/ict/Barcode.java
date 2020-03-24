package no.hvl.ict;

public abstract class Barcode {
	public abstract double getPrice();
	/* getPrice() will throw if not valid */
	public abstract boolean isValid();
};
