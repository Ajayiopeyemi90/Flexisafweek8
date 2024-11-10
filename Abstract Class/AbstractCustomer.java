public abstract class AbstractCustomer{
    private String CustomerName;
    private String CustomerLocation;
    private String CustomerNumber;
    
    public AbstractCustomer(String name, String Location, String number){
        this.CustomerName = name;
        this.CustomerLocation = Location;
        this.CustomerNumber = number;
    }
    
     // Getter for customerName
    public String getCustomerName() {
        return CustomerName;
    }

    // Setter for customerName
    public void setCustomerName(String customerName) {
        this.CustomerName = customerName;
    }

    // Getter for customerLocation
    public String getCustomerLocation() {
        return CustomerLocation;
    }

    // Setter for customerLocation
    public void setCustomerLocation(String customerLocation) {
        this.CustomerLocation = customerLocation;
    }

    // Getter for customerNumber
    public String getCustomerNumber() {
        return CustomerNumber;
    }

    // Setter for customerNumber
    public void setCustomerNumber(String customerNumber) {
        this.CustomerNumber = customerNumber;
    }
}