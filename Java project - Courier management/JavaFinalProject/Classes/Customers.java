package Classes;

public class Customers{

    private String customerName;
    private String customerAge;
    private String customerGender;
    private String customerAddress;
    private String customerContactNumber;
    private String customerEmailAddress;
    private String customerPassword;
    int customerId=0;
    public Customers() {
        customerId++;
    }

    public Customers(String customerName, String customerAge, String customerGender, String customerAddress, String customerContactNumber, String customerEmailAddress,String customerPassword) {
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.customerGender = customerGender;
        this.customerAddress = customerAddress;
        this.customerContactNumber = customerContactNumber;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPassword = customerPassword;
    }
//Setter method
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAge(String customerAge) {
        this.customerAge = customerAge;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerContactNumber(String customerContactNumber) {
        this.customerContactNumber = customerContactNumber;
    }

    public void setCustomerEmailAdress(String customerEmailAdress) {
        this.customerEmailAddress = customerEmailAdress;
    }
    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }
//Getter method
    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAge() {
        return customerAge;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getCustomerContactNumber() {
        return customerContactNumber;
    }

    public String getCustomerEmailAdress() {
        return customerEmailAddress;
    }
    public String getCustomerPassword() {
        return customerPassword;
    }




        // for customers want to log in whose have acc already





}