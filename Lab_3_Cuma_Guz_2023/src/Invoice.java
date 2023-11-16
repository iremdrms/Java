public class Invoice {

    private String partNumber,partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber,String partDescription,int quantity,double price)
    {
        this.partNumber=partNumber;
        this.partDescription=partDescription;

        if(quantity>10)
            this.quantity=quantity;
        if(price>0)
            this.price=price;
    }

    public void setQuantity(int quantity)
    {
        if(quantity>10)
            this.quantity=quantity;
    }
    public int getQuantity()
    {
        return quantity;
    }

    public void setPrice(double price) {
        if(price>0)
            this.price=price;
    }

    public double getPrice() {
        return price;
    }
    public double getInvoiceAmount()
    {
        return getQuantity()*getPrice();
    }
    public void displayInvoice()
    {
        System.out.println("PartNumber: "+this.partNumber+"\nPartDescription: "+this.partDescription+"\nQuantity: "+this.getQuantity()+"\nPrice: "+this.getPrice());
    }
}
