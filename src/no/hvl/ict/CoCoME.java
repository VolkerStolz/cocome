package no.hvl.ict;

/* Main Cashdesk implementation */

public class CoCoME implements CoCoME_if {

	public double total = 0;
	int items = 0;
	public boolean express = false;
	public boolean inProgress = false;
	public boolean paying = false;

	public void enableExpress() {
		assert !inProgress;
		express = true;
	}
 	public void disableExpress() {
		assert !inProgress;
		express = false;
	}
	public void startSale() {
		assert !inProgress;
		total = 0;
		items = 0;
		inProgress = true;
		paying = false;
	}
	public void enterItem(Barcode code, int qty) {
		assert inProgress && !paying;
		assert !express || items < 8;
		total = total + qty * code.getPrice();
		items++;
	}
	public void finishSale() {
		assert inProgress;
		paying = true;
	}
	public void cardPay(Card c) {
		assert paying;
		inProgress = false;
	}
	public double cashPay(double amount) {
		assert paying;
		inProgress = false;
		assert amount >= total;
		return amount - total;
	}
}
