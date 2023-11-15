public class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoiceObj = new Invoice("A","B",5,14);
        invoiceObj.setQuantity(-1);
        System.out.println(invoiceObj.getInvoiceAmount());
        invoiceObj.displayInvoice();
        // quantity 0 gelir çünkü koşul var
        //invoiceObj.setQuantity(5);
        //System.out.println(invoiceObj.getQuantity());

    }
}
