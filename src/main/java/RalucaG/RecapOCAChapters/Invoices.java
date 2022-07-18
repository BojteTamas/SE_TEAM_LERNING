package RalucaG.RecapOCAChapters;

public class Invoices {
  public static String invoiceName = "";
  public static String business = "";

  public static double accountSID = 419.4;
  public static double accountXSID = 704.61;

  public static void invoice(String name) {
    invoiceName = name;
  }

  public static void invoiceModule(String module) {
    business = module;
  }

  public static void credit(double SID) {
    accountSID = SID;
  }

  public static void debit(double xSID) {
    accountXSID = xSID;
  }
}
