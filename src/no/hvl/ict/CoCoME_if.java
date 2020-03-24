package no.hvl.ict;

interface CoCoME_if {
  void enableExpress();
  void disableExpress();
  void startSale();
  void enterItem(Barcode b, int qty);
  void finishSale();
  void cardPay(Card cc);
  double cashPay(double amount);
}
