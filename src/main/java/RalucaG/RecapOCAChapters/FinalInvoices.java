package RalucaG.RecapOCAChapters;

public class FinalInvoices {
  public static void main(String[] args) {
    Invoices.invoice("Telemedicine--SeriesMTEL00001");
    System.out.println(Invoices.invoiceName);

    Invoices invoices = new Invoices();
    invoices.invoice("Series:MTEL00001");
    System.out.println(invoices.invoiceName);

    Invoices.invoiceModule("Business module: Telemedicine");
    System.out.println(Invoices.business);

    Invoices.credit(234.54);
    Invoices.debit(321.45);
    System.out.println(
        "Invoices credit amount: "
            + Invoices.accountSID
            + " Invoices debit amount:  "
            + Invoices.accountXSID);
  }
}
