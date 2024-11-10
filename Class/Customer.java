public class Customer extends AbstractCustomer {
    private String ProductId;
    private String Ordernumber;
    private String ModeOfPayment;

    // Constructor
    public Customer(String name, String Location, String number, String ProductId, String Ordernumber, String ModeOfPayment) {
        super(name, Location, number);
        this.ProductId = ProductId;
        this.Ordernumber = Ordernumber;
        this.ModeOfPayment = ModeOfPayment;
    }

    // Getter and Setter for ProductId
    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    // Getter and Setter for Ordernumber
    public String getOrdernumber() {
        return Ordernumber;
    }

    public void setOrdernumber(String Ordernumber) {
        this.Ordernumber = Ordernumber;
    }

    // Getter and Setter for ModeOfSupply
    public String getModeOfPayment() {
        return ModeOfPayment;
    }

    public void setModeOfPayment(String ModeOfPayment) {
        this.ModeOfPayment = ModeOfPayment;
    }

 @Override
 public String toString(){
     return "Customer's information: \n name = " + getCustomerName() + "\n Location = " + getCustomerLocation() + "\n number = " + getCustomerNumber() + 
     "\n Product Id = " + ProductId + "\n Order number = " + Ordernumber +  "\n Mode Of Payment = " + ModeOfPayment;
 }
}