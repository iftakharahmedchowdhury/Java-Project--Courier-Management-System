package Interface;

import Classes.Customers;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface CustomerInterface{
     boolean setCustomer(Customers c) throws IOException;
     boolean removeCustomer(Customers c);
     boolean customerLogin(String customerContactNumber1,String customerPasswordForLogIn);
     Customers searchCustomer(String customerSearchPhoneNumber);
     Customers searchCustomerForLogin(String customerContactNumber1,String customerPasswordForLogIn);
     //Customers setcustomerTxt(Customer c2);

}