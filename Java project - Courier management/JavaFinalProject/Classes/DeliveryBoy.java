package Classes;

import java.io.File;
import java.util.Scanner;

public class DeliveryBoy{

//DeliveryBoy d1[] = new DeliveryBoy[200];


    private String deliveryBoyId;
    private String deliveryBoyName;
    private String deliveryBoyAge;
    private String deliveryBoyGender;
    private String deliveryBoyAddress;
    private String deliveryBoyContactNumber;
    private String deliveryBoyEmailAddress;
    private String deliveryBoyPassword;


    public DeliveryBoy() {
    }

    public DeliveryBoy(String deliveryBoyId, String deliveryBoyName, String deliveryBoyAge, String deliveryBoyGender, String deliveryBoyAddress, String deliveryBoyContactNumber, String deliveryBoyEmailAddress, String deliveryBoyPassword) {
        this.deliveryBoyId = deliveryBoyId;
        this.deliveryBoyName = deliveryBoyName;
        this.deliveryBoyAge = deliveryBoyAge;
        this.deliveryBoyGender = deliveryBoyGender;
        this.deliveryBoyAddress = deliveryBoyAddress;
        this.deliveryBoyContactNumber = deliveryBoyContactNumber;
        this.deliveryBoyEmailAddress = deliveryBoyEmailAddress;
        this.deliveryBoyPassword = deliveryBoyPassword;
    }
//Setter method//


        public void setDeliveryBoyId (String deliveryBoyId){
        this.deliveryBoyId = deliveryBoyId;
    }

        public void setDeliveryBoyName (String deliveryBoyName){
        this.deliveryBoyName = deliveryBoyName;
    }

        public void setDeliveryBoyAge (String deliveryBoyAge){
        this.deliveryBoyAge = deliveryBoyAge;
    }

        public void setDeliveryBoyGender (String deliveryBoyGender){
        this.deliveryBoyGender = deliveryBoyGender;
    }

        public void setDeliveryBoyAddress (String deliveryBoyAddress){
        this.deliveryBoyAddress = deliveryBoyAddress;
    }

        public void setDeliveryBoyContactNumber (String deliveryBoyContactNumber){
        this.deliveryBoyContactNumber = deliveryBoyContactNumber;
    }

        public void setDeliveryBoyEmailAddress (String deliveryBoyEmailAddress){
        this.deliveryBoyEmailAddress = deliveryBoyEmailAddress;
    }

        public void setDeliveryBoyPassword (String deliveryBoyPassword){
        this.deliveryBoyPassword = deliveryBoyPassword;
    }



    //Getter method//


    public String getDeliveryBoyId() {
        return deliveryBoyId;
    }

    public String getDeliveryBoyName() {
        return deliveryBoyName;
    }

    public String getDeliveryBoyAge() {
        return deliveryBoyAge;
    }

    public String getDeliveryBoyGender() {
        return deliveryBoyGender;
    }

    public String getDeliveryBoyAddress() {
        return deliveryBoyAddress;
    }

    public String getDeliveryBoyContactNumber() {
        return deliveryBoyContactNumber;
    }

    public String getDeliveryBoyEmailAddress() {
        return deliveryBoyEmailAddress;
    }

    public String getDeliveryBoyPassword() {
        return deliveryBoyPassword;
    }






}