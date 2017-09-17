package Chapter10Exercise3;

public class ItemSold {

    private int invoiceNumber;
    private String description;
    private double price;

    public int getInvoiceNumber(){
        return invoiceNumber;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
    public void setPrice(double price) {
        this.price = price;
    }


}
